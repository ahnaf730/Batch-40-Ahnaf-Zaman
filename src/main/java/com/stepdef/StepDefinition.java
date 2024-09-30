package com.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.lumapagefactory.LumaPageFactory;

import io.cucumber.java.en.*;

public class StepDefinition {

	WebDriver driver = new ChromeDriver();

	LumaPageFactory lpf;

	@Given("Open the browser")
	public void open_the_browser() {

		driver.manage().window().maximize();

	}

	@And("Pass the LumaURL")
	public void pass_the_luma_url(String LumaURL) {
		driver.navigate().to(LumaURL);
	}

	@When("Click on the Login button in the homepage")
	public void click_on_the_login_button_in_the_homepage() {
		lpf = new LumaPageFactory(driver);
		lpf.getSigninbtn_homepage().click();
	}

	@And("Enter the email in  the email field")
	public void enter_the_email_in_the_email_field(String email) {
		lpf.getEmail_homepage().sendKeys(email);
	}

	@And("the Password in the password field")
	public void the_password_in_the_password_field(String password) {
		lpf.getPassword_homepage().sendKeys(password);
	}

	@And("Click on Login button in the Login page")
	public void click_on_login_button_in_the_login_page() {
		lpf.getLogin_homepage().click();
	}

	@Then("Validate the login is successful")
	public void validate_the_login_is_successful() {
		Assert.assertTrue(lpf.getDropdown_menu().isDisplayed(), "Login is Successful");
		
		if (lpf.getDropdown_menu().isDisplayed()) {
			
			System.out.println("Login Successful");
			
		}
		
		driver.quit();
	}

}
