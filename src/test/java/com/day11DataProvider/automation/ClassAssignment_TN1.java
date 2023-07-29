package com.day11DataProvider.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassAssignment_TN1 {
	public  WebDriver driver;
	@BeforeMethod
	public void tutorialNinja() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
	}
	
	@Test(priority=1, dataProvider = "TutorialsNinja" , dataProviderClass=ClassAssignment_DataProviders.class)
	public void loginTestCase1(String email,String password) {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.cssSelector("input#input-email")).sendKeys(email);
		driver.findElement(By.cssSelector("input#input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input[value=\"Login\"]")).click();
		driver.findElement(By.cssSelector("div.list-group >a:nth-of-type(13)")).click();
		driver.findElement(By.cssSelector("a.btn.btn-primary")).click();	
	}
	
	
	@Test(priority=2, dataProvider = "TutorialsNinja",dataProviderClass=ClassAssignment_DataProviders.class)
	public void loginTestCase2(String email,String password) {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.cssSelector("input#input-email")).sendKeys(email);
		driver.findElement(By.cssSelector("input#input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input[value=\"Login\"]")).click();
		driver.findElement(By.cssSelector("div.list-group >a:nth-of-type(13)")).click();
		driver.findElement(By.cssSelector("a.btn.btn-primary")).click();	
	}
	
	@AfterMethod()
	public void tearDown() {
		driver.quit();
	}

}
