package SoftwareTestingPages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SoftwareTestingBase.TestBase;

public class SignUpPage extends TestBase{
	
	@FindBy(xpath ="//*[@routerlink='/auth/register' and contains(text(),'Register your account')]")
	WebElement registerYourAccountLink;
	
	public SignUpPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public void ClickRegisterYourAccountLink() {
		registerYourAccountLink.click();
	}
	

}
