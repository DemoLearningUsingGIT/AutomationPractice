package com.qa.test;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomepageTest {

	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\New folder\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.hotels.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test
	public void test() throws InterruptedException 
	{
		System.out.println("Initial_HomePage-->"+driver.getWindowHandle());
		
		System.out.println("Start");
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		System.out.println("start2");
		Thread.sleep(5000);
		System.out.println("========================");
		driver.findElement(By.xpath("//input[@id='sign-in-email']")).sendKeys("ku.gauravsingh@gmail.com");
		 driver.findElement(By.xpath("//input[@id='sign-in-password']")).sendKeys("gaurav@123");
		 //Thread.sleep(5000);
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 Thread.sleep(5000);
		 System.out.println("=== Successfully loged in ===");		
	}	
	@AfterMethod
	public void after()
	{
		driver.close();
	}

}
