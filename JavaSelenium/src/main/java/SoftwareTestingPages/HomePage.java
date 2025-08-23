package SoftwareTestingPages;


import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SoftwareTestingBase.TestBase;

public class HomePage extends TestBase {
	
	// Page Factory - OR:
	@FindBy(xpath = "//*[@class='nav-link' and contains(text(),'Sign in')]")
	WebElement signUpLink;

	public HomePage() throws IOException {
		
		super();
		PageFactory.initElements(driver, this);
	}
	
	public void ClickSignInLink() {
		signUpLink.click();
	}
	



}
