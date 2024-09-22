package com.testng;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.lumapagefactory.LumaPageFactory;
import com.utilities.ConfigFiles;
import com.utilities.Highlight;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LumaMensJackets {

	LumaPageFactory lpf;
@Test
	public void getLumaMensJackets() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		Actions ac = new Actions(driver);

		driver.manage().window().maximize();
		driver.navigate().to(ConfigFiles.getConfigValue("URL"));

		lpf = new LumaPageFactory(driver);

		// Login

		ac.click(lpf.getSigninbtn_homepage()).perform();

		lpf.getEmail_homepage().sendKeys(ConfigFiles.getConfigValue("Email"));
		
		lpf.getPassword_homepage().sendKeys(ConfigFiles.getConfigValue("Password"));

		ac.click(lpf.getLogin_homepage()).perform();

		// Go to Mens>Tops>Jackets

		ac.moveToElement(lpf.getMens_dropdown()).perform();

		ac.moveToElement(lpf.getMens_tops_dropdown()).perform();

		ac.click(lpf.getJackets_menu()).perform();
		
		

		Highlight.addColor(driver, lpf.getJackets_title());

		if (lpf.getJackets_title().isDisplayed()) {

			System.out.println("Mens Jackets Are Displayed");

		}

		ac.click(lpf.getM_j_style_dropdown()).perform();

		// Select Windbreaker Jacket

		ac.click(lpf.getWindbreaker_btn()).perform();

		ac.click(lpf.getMontana_wind_jacket()).perform();

		ac.click(lpf.getSz_m_montana_wind_jacket()).perform();

		ac.click(lpf.getClr_grn_montana_wind_jacket()).perform();

		ac.click(lpf.getQty_montana_wind_jacket()).perform();

		ac.doubleClick(lpf.getQty_montana_wind_jacket()).perform();

		ac.sendKeys("2").perform();

		ac.click(lpf.getAddtocart_montana_wind_jacket()).perform();

		if (lpf.getAddtocart_success().isDisplayed()) {

			System.out.println("MONTANA JACKET SZ: M, CLR: GREEN ADDED TO CART");
		}

		// Delete from cart to empty cart for future tests.

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		ac.click(lpf.getShowcart()).perform();

		ac.click(lpf.getDeletefromcart()).perform();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		ac.click(lpf.getConfirmokbutton()).perform();

		driver.quit();

	}

}
