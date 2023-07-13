package com.day4.java;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day5_ClassAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com");
		driver.get("https://www.walmart.ca");
		driver.get("https://www.guru99.com/");
		driver.get("https://ca.yahoo.com/");
		driver.quit();
		
		openInFirefox();
		openInEdge();
	}
	
	public static void openInFirefox()
	{
		WebDriver driver  = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://artoftesting.com/");
		driver.get("https://www.selenium.dev/");
		driver.get("https://www.w3schools.com/");
		driver.get("https://stackoverflow.com/");
		driver.quit();
	}
	
	public static void openInEdge()
	{
		WebDriver driver  = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.youtube.com/");
		driver.get("https://www.netflix.com/");
		driver.get("https://www.w3schools.com/");
		driver.get("https://stackoverflow.com/");
		driver.quit();
	}
	

}
