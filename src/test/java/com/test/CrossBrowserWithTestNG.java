package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.lumapagefactory.LumaPageFactory;
import com.utilities.ConfigFiles;
import com.utilities.Highlight;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserWithTestNG {

	WebDriver driver;
	LumaPageFactory lpf;
	Actions ac;

	@Test
	@Parameters("browser")
	public void getCrossBrowser(String browser) {

		if (browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

			System.out.println("Browser Opened=" + browser);
		} else if (browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

			System.out.println("Browser Opened=" + browser);
		}
		driver.manage().window().maximize();
		driver.navigate().to(ConfigFiles.getConfigValue("URL"));

		lpf = new LumaPageFactory(driver);
		ac = new Actions(driver);

		ac.click(lpf.getSigninbtn_homepage()).perform();

		lpf.getEmail_homepage().sendKeys(ConfigFiles.getConfigValue("Email"));
		lpf.getPassword_homepage().sendKeys(ConfigFiles.getConfigValue("Password"));

		ac.click(lpf.getLogin_homepage()).perform();

		if (lpf.getDropdown_menu().isDisplayed()) {

			System.out.println("Login Successful!");

		}

		Highlight.addColor(driver, lpf.getDropdown_menu());

		ac.click(lpf.getDropdown_menu()).perform();

		ac.click(lpf.getSignout_homepage()).perform();

		Assert.assertTrue(lpf.getSigninbtn_homepage().isDisplayed(), "Logout successful");

		driver.quit();

		System.out.println("Driver Closed");

	}

}
