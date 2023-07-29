package com.day10.automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_23July_Assignment {
	public WebDriver driver;
	@BeforeMethod
	public void tutorialNinja() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
	}
	
	@Test(priority = 1)
	public void loginTestCase1() {
		driver.findElement(By.xpath("//a[contains(text(),'My Account')]")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.cssSelector("input[id='input-email']")).sendKeys("pateldivya301@gmail.com");
		driver.findElement(By.cssSelector("input[id=\"input-password\"]")).sendKeys("Qwerty@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.cssSelector("div.list-group >a:nth-of-type(13)")).click();
		driver.findElement(By.cssSelector("a.btn.btn-primary")).click();			
	}
	
	@Test(priority = 2 )
	public void loginTestCase2() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("pateldivya301@gmail.com");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Qwerty@123");
		driver.findElement(By.cssSelector("input[value=\"Login\"]")).click();
		driver.findElement(By.cssSelector("div.list-group >a:nth-of-type(13)")).click();
		driver.findElement(By.cssSelector("a.btn.btn-primary")).click();
	}
	
	@Test(priority = 3 )
	public void loginTestCase3() throws InterruptedException {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("pateldivya301@gmail.com");
		driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("Qwerty@123");
		driver.findElement(By.cssSelector("input[value=\"Login\"]")).click();
		driver.findElement(By.cssSelector("div.list-group >a:nth-of-type(13)")).click();
		driver.findElement(By.cssSelector("a.btn.btn-primary")).click();	
	}
	
	
	@Test(priority = 4)
	public void registerTestCase4() throws InterruptedException {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#input-firstname")).sendKeys("Divya");
		driver.findElement(By.cssSelector("#input-lastname")).sendKeys("Patel");
		driver.findElement(By.cssSelector("#input-email")).sendKeys("divyapatel0295@gmail.com");
		driver.findElement(By.cssSelector("#input-telephone")).sendKeys("1231231230");
		driver.findElement(By.cssSelector("#input-password")).sendKeys("Qwerty@1234");
		driver.findElement(By.cssSelector("#input-confirm")).sendKeys("Qwerty@1234");
		driver.findElement(By.cssSelector("label.radio-inline:nth-child(1) > input")).click();
		driver.findElement(By.cssSelector("input[name = agree]")).click();
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		
		
	}
	
	@Test(priority = 5)
	public void registerTestCase5() throws InterruptedException {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Divya");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Patel");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("divyapatel0295@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone")).sendKeys("1231231230");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Qwerty@1234");
		driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Qwerty@1234");
		driver.findElement(By.cssSelector("label.radio-inline:nth-child(1) > input")).click();
		driver.findElement(By.cssSelector("a[class=\"agree\"]")).click();
		
	}
	
	@Test(priority = 6)
	public void registerTestCase6() throws InterruptedException {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".form-control[name=\"firstname\"]")).sendKeys("Divya");
		driver.findElement(By.cssSelector(".form-control[name=\"lastname\"]")).sendKeys("Patel");
		driver.findElement(By.cssSelector(".form-control[name=\"email\"]")).sendKeys("divyapatel@gmail.com");
		driver.findElement(By.cssSelector(".form-control[name=\"telephone\"]")).sendKeys("9898989890");
		driver.findElement(By.cssSelector(".form-control[name=\"password\"]")).sendKeys("Qwerty@1234");
		driver.findElement(By.cssSelector(".form-control[name=\"confirm\"]")).sendKeys("Qwerty@1234");
		driver.findElement(By.cssSelector("input[name=\"newsletter\"][type=\"radio\"][value=\"1\"]")).click();
		driver.findElement(By.cssSelector("input[type=\"checkbox\"]")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}

}
