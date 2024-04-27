package com.techpanda.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class MyAccPage {
	private WebDriver driver;

	public MyAccPage(WebDriver driver) {
		this.driver = driver;
	}

	public void NavigateToAcc() {
		driver.findElement(By.xpath("(//li[@class='first'])[3]")).click();
	}
	
	public void MyWishlist()
	{
		driver.findElement(By.xpath("//a[normalize-space()='My Wishlist']")).click();
	}
	
	public void addTocart_FromAcc() throws InterruptedException {
		driver.findElement(By.xpath("(//span[contains(text(),'Add to Cart')])[1]")).click();
		
		String actual = driver.findElement(By.xpath("(//span[@class='price'])[8]")).getText();
		
		driver.findElement(By.xpath("(//span[contains(text(),'Proceed to Checkout')])[1]")).click();
		
		driver.findElement(By.xpath("//input[@id='billing:use_for_shipping_yes']")).click();
		
		driver.findElement(By.xpath("//input[@id='billing:street1']")).sendKeys("ABC");
		
		driver.findElement(By.xpath("//input[@id='billing:city']")).sendKeys("New York");
		
		WebElement state = driver.findElement(By.xpath("//select[@id='billing:region_id']"));
		
		Select s = new Select(state); s.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("//input[@id='billing:postcode']")).sendKeys("542896");
		
		driver.findElement(By.xpath("//input[@id='billing:telephone']")).sendKeys("12345678");
		
		driver.findElement(By.xpath("//button[@onclick='billing.save()']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		
		driver.findElement(By.xpath("//input[@id='p_method_checkmo']")).click();
		
		driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
		
		String Expected = driver.findElement(By.xpath("(//span[@class='price'])[8]")).getText();
		
		driver.findElement(By.xpath("//button[@title='Place Order']")).click();
		
		String orderid = driver.findElement(By.xpath("//h2[@class='sub-title']/following-sibling::p[1]")).getText();
		
		Assert.assertEquals(actual, Expected);
		
		System.out.println(orderid);
	}
	
	

}
