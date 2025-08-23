package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameHandling {
	
	@Test
	public void FrameHandle() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.switchTo().frame("iframe-name");
		driver.findElement(By.linkText("Courses")).click();
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
