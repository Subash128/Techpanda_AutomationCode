package com.techpanda.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TvPage {
	public WebDriver driver;

	public TvPage(WebDriver driver) {
		this.driver = driver;
	}

	public void NavigateToTvtab() {

		driver.findElement(By.xpath("//a[normalize-space()='TV']")).click();
	}

	public String Tv_wishlist() {
		
		driver.findElement(By.xpath("//li[1]//div[1]//div[3]//ul[1]//li[1]//a[1]")).click();

		HomePage hmp = new HomePage(driver);
		
		hmp.Login();

		driver.findElement(By.xpath("//span[contains(text(),'Share Wishlist')]")).click();

		driver.findElement(By.id("email_address")).sendKeys("abc@gmail.com");

		driver.findElement(By.id("message")).sendKeys("Thank you");

		driver.findElement(By.xpath("//span[contains(text(),'Share Wishlist')]")).click();

		return driver.findElement(By.className("success-msg")).getText();
	}

}
