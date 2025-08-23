package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseMovement {
	
	
	@Test(priority = 2, groups = "Sanity")
	public void mouseHover() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.spicejet.com/");
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'Add-ons')]"))).build().perform();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-ubezar' and contains(text(),'SpiceMax')]")).click();
		Thread.sleep(5000);
		
		driver.quit();
		
		
	}
	
	
	@Test(priority = 1, groups = "Regression")
	public void dragDrop() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://jqueryui.com/droppable/");
		
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		
		Actions action = new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']")))
		.moveToElement(driver.findElement(By.xpath("//*[@id='droppable']")))
		.release().build().perform();
		
		Thread.sleep(3000);
		driver.quit();
		
	}


}
