package com.day10.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class ClassAssignment_TestNG_Part1 {
	
	public WebDriver driver;
	@BeforeMethod
	public void loginRediff() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		driver.findElement(By.id("//input[@id=\"login1\"]")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("//input[@id=\"password\"]")).sendKeys("Selenium@123");
		driver.findElement(By.id("//input[@class=\"signinbtn\"]")).sendKeys("Selenium@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
	}

}
