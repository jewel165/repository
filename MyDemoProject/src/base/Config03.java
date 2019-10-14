package base;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.beust.jcommander.Parameters;

import util.WebDriverAPI;

public class Config03 extends WebDriverAPI {
	
	
	@org.testng.annotations.Parameters("browser")
	@BeforeMethod(alwaysRun = true)
	
	
		
		public void setup(String browserName) {
		
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","/Users/jewel/Downloads/chromedriver");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver","/Users/jewel/GitHub/TestNG_Framework_FB/Divers/geckodriver");
			driver = new FirefoxDriver();
		}
		
		
		//System.setProperty("webdriver.chrome.driver","/Users/jewel/Downloads/chromedriver");
		//driver = new ChromeDriver();
		driver.get("http://facebook.com");
		pageload();
		maxscreen();
		wttime();
		DltCookies();
		maxscreen();
		
	}




	@AfterMethod(alwaysRun = true)
	public void close() {
		driver.quit();
	}


}
