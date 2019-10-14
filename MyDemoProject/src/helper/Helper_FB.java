package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import locators.FB_Locators;
import testData.FB_Values;
import util.WebDriverAPI;

public class Helper_FB extends WebDriverAPI {
	


	//public WebDriver driver;
	
	FB_Locators ab = new FB_Locators();
	FB_Values bb = new FB_Values();
	
	public void FbLogoTest(String Fblocators) {
		driver.findElement(By.xpath(""));
	}

	public void FbLogin() {
		TypeByXpath(ab.EmailPh,bb.Email);
		TypeByXpath(ab.PassWord,bb.Pass);
		ClickById(ab.LoginBtn);
		
	}
	
	public void LoginVerify() {
	String Greeting = 	driver.findElement(By.xpath(ab.FbGreeting)).getText();
	String actGreeting = Greeting.trim();
	System.out.println(actGreeting);
	Assert.assertEquals(actGreeting, "MD Jewel");
		
	}

}
