package com.techpanda.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	public static WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver=driver;
	}

	public String VerifyTitle() {
		return driver.getTitle();
	}
	
	public String AccountCreation() {
		driver.findElement(By.cssSelector("div[class='footer'] a[title='My Account']")).click();
		
		driver.findElement(By.xpath("//a[@title='Create an Account']")).click();
		
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("abc");
		
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("abc");
		
		driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("dummy134@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234567");
		
		driver.findElement(By.xpath("//input[@id='confirmation']")).sendKeys("1234567");
		
		driver.findElement(By.xpath("//button[@title='Register']")).click();
		
		return driver.findElement(By.xpath("/html/body/div/div/div[1]/div/p")).getText();
	}
	
	public void Login() {
		
		driver.findElement(By.cssSelector("div[class='footer'] a[title='My Account']")).click();
		
		driver.findElement(By.id("email")).sendKeys("dummy134@gmail.com");

		driver.findElement(By.id("pass")).sendKeys("1234567");

		driver.findElement(By.id("send2")).click();
	}
	
}
