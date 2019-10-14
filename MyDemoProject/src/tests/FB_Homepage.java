package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Config03;
import helper.Helper_FB;
import locators.FB_Locators;
import testData.FB_Values;


public class FB_Homepage extends Config03 {
	
	//DriverMethods aa = new DriverMethods();
	Helper_FB bb = new Helper_FB();
	FB_Locators cc = new FB_Locators();
	FB_Values dd = new FB_Values();
	
	
	@Test(groups = "random" )
	public void verifyTittle() {
	String FbTittle = 	driver.getTitle();
	System.out.println(FbTittle);
	}
	
	@Test(groups = "random")
	public void FbLogoTest() {
	boolean a = driver.findElement(By.xpath(cc.FbLogo)).isDisplayed();
	Assert.assertTrue(a, "FB Logo is Displayed");
	}
	
	@Test(groups = {"Smoke"})
	public void FbSearchTest() {
		TypeByXpath(cc.EmailPh,dd.Email);
		TypeByXpath(cc.PassWord,dd.Pass);
		ClickById(cc.LoginBtn);
		FindByXpath(cc.FbSearch);
	}
	
	@Test(priority = 1,groups = {"Smoke","Regression"})
	public void LogInwithValidInfo() {
		TypeByXpath(cc.EmailPh,dd.Email);
		TypeByXpath(cc.PassWord,dd.Pass);
		ClickById(cc.LoginBtn);
		
		
	}
	
	@Test(priority = 2,groups = {"Smoke","Regression"})
	public void LoginWithvalidPh() {
		TypeByXpath(cc.EmailPh,dd.FbPhone);
		TypeByXpath(cc.PassWord,dd.Pass);
		ClickById(cc.LoginBtn);
		//bb.LoginVerify();
	}
	@Test(priority = 3)
	public void LoginVerify() {
		TypeByXpath(cc.EmailPh,dd.Email);
		TypeByXpath(cc.PassWord,dd.Pass);
		ClickById(cc.LoginBtn);
		String Greeting = 	driver.findElement(By.xpath(cc.FbGreeting)).getText();
		String actGreeting = Greeting.trim();
		System.out.println(actGreeting);
		Assert.assertEquals(actGreeting, "MD Jewel");
			
		}

}
