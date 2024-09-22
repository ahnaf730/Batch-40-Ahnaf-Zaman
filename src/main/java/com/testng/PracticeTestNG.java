package com.testng;

import org.testng.annotations.Test;

public class PracticeTestNG {

	@Test(priority=0, groups = {"Smoke"})
	public void getLogin() {
		System.out.println("Login");
	}
	
	@Test(priority=1, groups = {"Functional"})
	public void getSearch() {
		System.out.println("Search");
	}
	
	@Test(priority=4, dependsOnMethods= {"getPress"}, groups = {"Smoke"})
	public void getPump() {
		System.out.println("Pump");
	}
	
	@Test(priority=2, enabled=false)
	public void getDumb() {
		System.out.println("Dumb");
	}
	
	@Test(priority=3, groups = {"Regression"})
	public void getPress() {
		System.out.println("Press");
	}
	
}
