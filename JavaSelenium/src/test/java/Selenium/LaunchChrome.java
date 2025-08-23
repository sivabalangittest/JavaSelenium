package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LaunchChrome {
		
	Logger log = LogManager.getLogger(LaunchChrome.class);
	
	@Test
	public void validateTitle() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/sivabalan/eclipse-workspace/JavaSelenium/JavaSelenium/chromedriver");
		System.setProperty("webdriver.manager.disable", "true"); 
		
        WebDriver driver = new ChromeDriver();
        
        log.info("Chrome Browser Launched");
        
		driver.get("https://www.automationexercise.com/");
		
		
		String urlTitle = driver.getTitle();
		System.out.println(urlTitle);
		
		if(urlTitle.equals("Automation Exercise")) {
			System.out.println("Title Matches");
		}
		else {
			System.out.println("Invalid Title");
		}
		
		driver.quit();
		
		
	}

}
