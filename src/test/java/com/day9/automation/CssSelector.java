package com.day9.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("Register"));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		driver.findElement(By.cssSelector("input[id=input-firstname]")).sendKeys("Divya");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Patel");
		driver.findElement(By.cssSelector("#input-email")).sendKeys("pateldivya301@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("1231231231");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("12345@");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("12345@");
		
		

	}

}
