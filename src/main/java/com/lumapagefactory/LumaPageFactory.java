package com.lumapagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LumaPageFactory {

	public LumaPageFactory(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//*[@class='authorization-link'][1])")
	private WebElement signinbtn_homepage;

	@FindBy(xpath = "//*[@id='email']")
	private WebElement email_homepage;

	@FindBy(xpath = "//*[@type='password']")
	private WebElement password_homepage;

	@FindBy(xpath = "(//*[@class='action switch'][1])")
	private WebElement dropdown_menu;

	@FindBy(xpath = "(//*[@class='authorization-link'][1])")
	private WebElement signout_homepage;

	@FindBy(xpath = "(//*[@name='send'][1])")
	private WebElement login_homepage;
	
	
	@FindBy(xpath = "//*[text()='Men']")
	private WebElement mens_dropdown;
	
	@FindBy(xpath = "//*[@id=\"ui-id-17\"]")
	private WebElement mens_tops_dropdown;
	
	@FindBy(xpath = "//*[@id=\"ui-id-2\"]/li[3]/ul/li[1]/ul/li[1]")
	private WebElement jackets_menu;
	
	@FindBy(xpath = "//*[@class='page-title-wrapper']")
	private WebElement jackets_title;
	
	
	@FindBy(xpath = "(//*[@class='filter-options-title'][1])")
	private WebElement m_j_style_dropdown;
	

	@FindBy(xpath = "//*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol/li[9]/a")
	private WebElement windbreaker_btn;

	@FindBy(xpath = "/html/body/div[2]/main/div[3]/div[1]/div[3]/ol/li[1]/div/div/strong/a")
	private WebElement montana_wind_jacket;

	@FindBy(xpath = "//div[@aria-label='M']")
	private WebElement sz_m_montana_wind_jacket;

	@FindBy(xpath = "//*[@id='option-label-color-93-item-53']")
	private WebElement clr_grn_montana_wind_jacket;

	@FindBy(xpath = "//input[@type='number']")
	private WebElement qty_montana_wind_jacket;

	@FindBy(xpath = "//*[@id='product-addtocart-button']")
	private WebElement addtocart_montana_wind_jacket;
	
	@FindBy (xpath = "//*[@class='page messages']")
	private WebElement addtocart_success;
	
	
	@FindBy (xpath = "//*[@class='action showcart']")
	private WebElement showcart;
	
	
	@FindBy (xpath = "//*[@class='action delete']")
	private WebElement deletefromcart;
	
	@FindBy (xpath = "//*[@class='action-primary action-accept']")
	private WebElement confirmokbutton;
	

	public WebElement getConfirmokbutton() {
		return confirmokbutton;
	}

	public WebElement getShowcart() {
		return showcart;
	}

	public WebElement getDeletefromcart() {
		return deletefromcart;
	}

	public WebElement getAddtocart_success() {
		return addtocart_success;
	}

	public WebElement getMontana_wind_jacket() {
		return montana_wind_jacket;
	}

	public WebElement getSz_m_montana_wind_jacket() {
		return sz_m_montana_wind_jacket;
	}

	public WebElement getClr_grn_montana_wind_jacket() {
		return clr_grn_montana_wind_jacket;
	}

	public WebElement getQty_montana_wind_jacket() {
		return qty_montana_wind_jacket;
	}

	public WebElement getAddtocart_montana_wind_jacket() {
		return addtocart_montana_wind_jacket;
	}

	public WebElement getWindbreaker_btn() {
		return windbreaker_btn;
	}

	public WebElement getM_j_style_dropdown() {
		return m_j_style_dropdown;
	}

	public WebElement getJackets_title() {
		return jackets_title;
	}

	public WebElement getJackets_menu() {
		return jackets_menu;
	}

	public WebElement getMens_tops_dropdown() {
		return mens_tops_dropdown;
	}

	public WebElement getMens_dropdown() {
		return mens_dropdown;
	}

	public WebElement getLogin_homepage() {
		return login_homepage;
	}

	public WebElement getSigninbtn_homepage() {
		return signinbtn_homepage;
	}

	public WebElement getEmail_homepage() {
		return email_homepage;
	}

	public WebElement getPassword_homepage() {
		return password_homepage;
	}

	public WebElement getDropdown_menu() {
		return dropdown_menu;
	}

	public WebElement getSignout_homepage() {
		return signout_homepage;
	}

}
