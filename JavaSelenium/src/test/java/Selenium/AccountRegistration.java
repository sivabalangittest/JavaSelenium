package Selenium;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import SoftwareTestingBase.TestBase;
import SoftwareTestingPages.HomePage;
import SoftwareTestingPages.RegistrationPage;
import SoftwareTestingPages.SignUpPage;

public class AccountRegistration extends TestBase{
	
	HomePage homePage;
	SignUpPage signUpPage;
	RegistrationPage registrationPage;
	
	public AccountRegistration() throws IOException {
		super();		
	}
	
	
	@BeforeMethod
	public void SetUp() throws IOException {
		
		initialization();
		homePage = new HomePage();
		
	}

	@Test
	public void EnterDetailsAndCompleteAccountRegistration() throws InterruptedException, IOException {
		

		
		signUpPage = new SignUpPage();
		registrationPage = new RegistrationPage();
		
		homePage.ClickSignInLink();
		signUpPage.ClickRegisterYourAccountLink();
		registrationPage.fillDetailsAndCompleteTheRegistrationForm();	
	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}

}
