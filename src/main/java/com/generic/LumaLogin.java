package com.generic;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import com.lumapagefactory.LumaPageFactory;
import com.utilities.ConfigFiles;
import com.utilities.Highlight;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LumaLogin {

	LumaPageFactory lpf;

	public void getLogin() {

		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		WebDriver driver = new ChromeDriver(chromeOptions);

		Actions ac = new Actions(driver);

		driver.manage().window().maximize();
		driver.navigate().to(ConfigFiles.getConfigValue("URL"));

		lpf = new LumaPageFactory(driver);

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

		if(lpf.getSigninbtn_homepage().isDisplayed()) {
			
		System.out.println("Logged out");
		
		}

		driver.quit();

		System.out.println("Driver Closed");

	}

}
