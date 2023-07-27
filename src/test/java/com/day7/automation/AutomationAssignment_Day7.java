package com.day7.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationAssignment_Day7 {

	public static void main(String[] args) {
		// tutorialsninja.com

		// Register option all validations for all WebElements - this in one method
		// Login option all validations for all WebElement - this in another method

		// getTitle
		// getCurrentUrl
		// isEnabled()
		// isDisplayed()
		// isSelected()
		//LoginValidation();
		RegisterValidation();

	}

	public static void LoginValidation() {

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	
	String actualTitle = driver.getTitle();
	String expectedTitle = "Account Login";

	String expectedURL = "https://tutorialsninja.com/demo/index.php?route=account/login";
	String actualcurrentURL = driver.getCurrentUrl();
	
	if(expectedTitle.equals(actualTitle) && expectedURL.equals(actualcurrentURL)) {
		WebElement emailTextbox = driver.findElement(By.id("input-email"));
		WebElement passwordTextbox = driver.findElement(By.id("input-password"));
		WebElement loginBtn = driver.findElement(By.cssSelector("input.btn.btn-primary"));
		
		
		if(emailTextbox.isDisplayed() && emailTextbox.isEnabled() && passwordTextbox.isDisplayed() && passwordTextbox.isEnabled()) {
			emailTextbox.sendKeys("seleniumpanda@gmail.com");
			passwordTextbox.sendKeys("Selenium@123");
			loginBtn.click();
			driver.findElement(By.linkText("Logout")).click();
			driver.findElement(By.linkText("Continue")).click();
		}
	}else {
		driver.quit();
	}
	}

	public static void RegisterValidation() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
		driver.findElement(By.linkText("Register")).click();		
		String actualRegisterPageTitle = driver.getTitle();
		String expectedRegisterPageTitle = "Register Account";
		
		String actualRegisterPageURL = driver.getCurrentUrl();
		String expectedRegisterCurrentURL = "https://tutorialsninja.com/demo/index.php?route=account/register";
		
		WebElement firstNameTextbox = driver.findElement(By.id("input-firstname"));
		WebElement lastNameTextbox = driver.findElement(By.id("input-lastname"));
		WebElement emailTextbox = driver.findElement(By.id("input-email"));
		WebElement telephoneTextbox = driver.findElement(By.id("input-telephone"));
		WebElement passwordTextbox = driver.findElement(By.id("input-password"));
		WebElement confirmPasswordTextbox = driver.findElement(By.id("input-confirm"));
		WebElement newsLetterSubscribe = driver.findElement(By.xpath("//input[@name = 'newsletter' and @value = '1'] "));
		WebElement privacyPolicyCheckbox = driver.findElement(By.name("agree"));
		WebElement continueBtn = driver.findElement(By.cssSelector("input.btn.btn-primary"));
		
		if(actualRegisterPageTitle.equals(expectedRegisterPageTitle) && actualRegisterPageURL.equals(expectedRegisterCurrentURL)) {
			
			
			if(firstNameTextbox.isDisplayed() && firstNameTextbox.isEnabled() && lastNameTextbox.isDisplayed() && lastNameTextbox.isEnabled() && emailTextbox.isDisplayed() && emailTextbox.isEnabled() && telephoneTextbox.isDisplayed() && passwordTextbox.isDisplayed() && passwordTextbox.isEnabled() && confirmPasswordTextbox.isDisplayed() && confirmPasswordTextbox.isEnabled() && privacyPolicyCheckbox.isSelected()) {
				
				System.out.print("Hello");
				firstNameTextbox.sendKeys("Divya");
				lastNameTextbox.sendKeys("Patel");
				emailTextbox.sendKeys("pateldivya301@gmail.com");
				telephoneTextbox.sendKeys("6475124366");
				passwordTextbox.sendKeys("divya@123");
				confirmPasswordTextbox.sendKeys("divya@123");
				newsLetterSubscribe.click();
				privacyPolicyCheckbox.isSelected();
				
				continueBtn.click();
				System.out.print("Pass");
			}
			
		}else {
			System.out.print("Fail");
			driver.quit();
		}
		

	}

}
