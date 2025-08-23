package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class HtmlUnitDriverConcept {

	public static void main(String[] args) {
		
		
		WebDriver driver = new HtmlUnitDriver();
		
		driver.get("https://www.google.com");
		System.out.println("Page title is: " + driver.getTitle());
		
	}

}
