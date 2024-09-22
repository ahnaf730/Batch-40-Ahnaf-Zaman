package com.testng;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.lumapagefactory.LumaPageFactory;
import com.utilities.ConfigFiles;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LumaGear {

	LumaPageFactory lpf;
@Test
	public void getGear() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		Actions ac = new Actions(driver);

		driver.manage().window().maximize();
		driver.navigate().to(ConfigFiles.getConfigValue("URL"));

		lpf = new LumaPageFactory(driver);

		ac.click(lpf.getSigninbtn_homepage()).perform();

		lpf.getEmail_homepage().sendKeys(ConfigFiles.getConfigValue("Email"));
		lpf.getPassword_homepage().sendKeys(ConfigFiles.getConfigValue("Password"));

		ac.click(lpf.getLogin_homepage()).perform();

		ac.moveToElement(lpf.getGear_menu()).perform();

		ac.click(lpf.getBags_gear()).perform();

		ac.click(lpf.getOvernight_duffle()).perform();

	}

}
