package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlePopUp {
	
	// Handle JavaScript Pop-Up
	@Test
	public void HandlePopUpAlert() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("name")).sendKeys("Test");
		driver.findElement(By.id("alertbtn")).click();
		
		Alert alertDisplayed = driver.switchTo().alert();
		
		Thread.sleep(5000);
		
		System.out.println(alertDisplayed.getText());
		
		alertDisplayed.accept();
		
		driver.quit();
		
	}
	
	// Handle browse file upload (locator should have attribute type="file")
	@Test
	public void HandleBrowseUploadFile() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://html.com/input-type-file/");
		
		driver.findElement(By.id("fileupload")).sendKeys("/Users/sivabalan/Downloads/Collection.jpg");
		Thread.sleep(5000);
		
		driver.quit();
		
		
	}

}
