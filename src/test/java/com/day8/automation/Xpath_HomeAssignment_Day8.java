package com.day8.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_HomeAssignment_Day8 {

	public static void main(String[] args) {
		//Rediffmail
		//Money
		//Business Email
		//Videos
		//Shopping
		//Create Account
		
		//I want 10 advanced Customized xpaths of all the above Web Elements
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		//Rediffmail
		//driver.findElement(By.xpath("//div[@class=\"logobar\"]/child::div[@class=\"table\"]/child::div[2]/a[text()=\"Rediffmail\"]")).click();
		//driver.findElement(By.xpath("//div[@class=\"cell\"]/following-sibling::div[@class=\"cell topicons\"]/child::a[1]")).click();
		//driver.findElement(By.xpath("//div[@class=\"cell\"]/following-sibling::div[@class=\"cell topicons\"]/child::a[@class=\"mailicon\"]")).click();
		//driver.findElement(By.xpath("//a[contains(text(), 'Rediffmail')]")).click();
		driver.findElement(By.xpath("//div[@class=\"logobar\"]/descendant::a[@class=\"mailicon\"]")).click();
		//div[@class="logobar"]/descendant::a[@class="mailicon"]
		
		//Money
		//driver.findElement(By.xpath("//input[@id=\"OAS_subsection\"]/following-sibling::div[2]/descendant::div[@class=\"cell topicons\"]/child::a[2]")).click();
	}

}
