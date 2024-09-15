package com.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Highlight {

public static void addColor(WebDriver driver, WebElement element){
		
		JavascriptExecutor js= (JavascriptExecutor)driver; //type casting
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);",element, "color: red; border: 2px solid red;");
	
	}

	
}
