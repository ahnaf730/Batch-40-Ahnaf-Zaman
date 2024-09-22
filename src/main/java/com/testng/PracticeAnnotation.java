package com.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeAnnotation {

	@Test
	public void getCart() {

		System.out.println("This is Test annotation.");

	}

	@BeforeMethod
	public void getShopping() {
		
		System.out.println("This is the BeforeMethod annotation.");
	}
	
	@AfterMethod
	public void getLogout() {
		
		System.out.println("This is the AfterMethod annotation.");
	}
	
	@BeforeTest
	public void getJacked() {
		
		System.out.println("This is BeforeTest annotation.");
	}
}
