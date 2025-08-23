package TestNGBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	@BeforeSuite
	public void setProperty() {
		System.out.println("Chrome Webdriver Property is set");
	}
	
	
	@BeforeClass
	public void launchBrowswer() {
		System.out.println("Launch Chrome Browser");
	}

	
	@BeforeMethod
	public void enterUrl() {
		System.out.println("Enter URL");
	}
	
	@BeforeTest
	public void login() {
		System.out.println("Login Successful");
	}
	
	@Test
	public void validateTitle() {
		System.out.println("Title Check");
	}
	
	@AfterTest
	public void deleteCookies() {
		System.out.println("LCookies Deleted");
	}
		
	@AfterMethod
	public void logout() {
		System.out.println("Logout successful");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close Chrome");
	}
	
	
	@AfterSuite
	public void generateReport() {
		System.out.println("HTML report generated");
	}
}
