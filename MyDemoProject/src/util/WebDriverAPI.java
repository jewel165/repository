package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebDriverAPI {
	
	
	public WebDriver driver;
		
		public void pageload() {
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		}
		
		public void maxscreen() {
			driver.manage().window().maximize();
		}
		
		public void wttime() {
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		
		public void DltCookies() {
			
		}
		
		public void TypeByXpath( String FbLocators,String Fbvalues) {
			driver.findElement(By.xpath(FbLocators)).sendKeys(Fbvalues);;
			
		}
		
		public void ClickByXpath(String FbLocators) {
			driver.findElement(By.xpath(FbLocators)).click();
		}
		
		public void ClickById(String FbLocators) {
			driver.findElement(By.id(FbLocators)).click();
		}
		
		
		public void FindByXpath(String FbLocators) {
			driver.findElement(By.xpath(FbLocators)).isEnabled();
		}
		
		

}
