package com.day10.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class July_23rd_Assignment {
	//TutorialsNinja
	//Whole Login Page
	//Whole Register Page
	
	//each webelement - I want 3 cssSelectors for each
	
	public static void main(String[] args) {
		Login();
		//Register();
		
	}
	
	public static void Login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//a[contains(text(),'My Account')]")).click();
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.cssSelector("input[id='input-email']")).sendKeys("pateldivya301@gmail.com");
		driver.findElement(By.cssSelector("#input-email")).sendKeys("pateldivya301@gmail.com");
		driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("pateldivya301@gmail.com");
		
		
		driver.findElement(By.cssSelector("input[id=\"input-password\"]")).sendKeys("Qwerty@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.cssSelector("div.list-group >a:nth-of-type(13)")).click();
		driver.findElement(By.cssSelector("a.btn.btn-primary")).click();
		
		
		
	}

}
