package com.day7.java;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day7_Class_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Divya");
		driver.findElement(By.name("lastname")).sendKeys("Patel");
		driver.findElement(By.name("reg_email__")).sendKeys("pateldivya301@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("pateldivya301@gmail.com");
		
		

	}

}
