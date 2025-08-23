package SoftwareTestingPages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SoftwareTestingBase.TestBase;

public class RegistrationPage extends TestBase{

	@FindBy(id = "first_name")
	WebElement firstNameTextBox;
	
	@FindBy(id = "last_name")
	WebElement lastNameTextBox;
	
	@FindBy(id = "dob")
	WebElement dateOfBirthTextBox;
	
	@FindBy(id = "street")
	WebElement streetTextBox;
	
	public RegistrationPage() throws IOException {
		super();
		
		// Initializing the Page Objects:
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions:
	public void fillDetailsAndCompleteTheRegistrationForm() throws InterruptedException {
		
		firstNameTextBox.sendKeys("Test");
		lastNameTextBox.sendKeys("Automation");
		
		Thread.sleep(5000);
	}
	
	

}
