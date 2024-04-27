package com.techpanda.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.seleniumbase.Initiate;

public class MobilePage {
	public WebDriver driver;

	public MobilePage(WebDriver driver) {
		this.driver = driver;
	}

	public String VerifyTitle() {
		return driver.getTitle();
	}

	public void NavigateToMoblietab() {

		driver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[1]/a")).click();
	}

	public void SortBy_Name() {
		WebElement Name = driver.findElement(
				By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select"));
		Name.click();
		Select select = new Select(Name);
		select.selectByVisibleText("Name");
		Initiate.ScreenShot(driver);
	}

	public String Cost0fSonyXperia() {
		return driver.findElement(By.cssSelector("#product-price-1 > span.price")).getText();
	}

	public String compare_CostofSonyXperia() {

		driver.findElement(By.id("product-collection-image-1")).click();

		return driver.findElement(By.className("price")).getText();
	}

	public void addTocart_SonyXperia() {

		driver.findElement(By.xpath("(//button[@title='Add to Cart'])[2]")).click();
		WebElement cart = driver.findElement(By.xpath("//input[@title='Qty']"));
		cart.click();
		cart.clear();
		cart.sendKeys("1000");

		WebElement update = driver.findElement(By.cssSelector("button[title='Update'] span span"));
		update.click();
	}

	public String VerifyErrMsg() {

		String msg = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/form/table/tbody/tr/td[2]/p"))
				.getText();

		driver.findElement(By.xpath("//span[contains(text(),'Empty Cart')]")).click();

		return msg;
	}

	public String VerifyCart() {
		driver.findElement(By.className("header-minicart")).click();

		return driver.findElement(By.xpath("(//p[@class='empty'])[1]")).getText();
	}

	public String[] VerifyAddtoCompare() {
		driver.findElement(By.xpath("//li[2]//div[1]//div[3]//ul[1]//li[2]//a[1]")).click();

		driver.findElement(By.xpath("//li[3]//div[1]//div[3]//ul[1]//li[2]//a[1]")).click();

		String mobile1 = driver.findElement(By.xpath("(//h2[@class='product-name'])[2]")).getText();

		String mobile2 = driver.findElement(By.xpath("(//h2[@class='product-name'])[3]")).getText();

		driver.findElement(By.xpath("(//span[contains(text(),'Compare')])[2]")).click();

		return new String[] { mobile1, mobile2 };
	}

	public String[] CompareWindow() {

		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}

		driver.findElement(By.xpath("//h1[normalize-space()='Compare Products']")).getText();
		
		String mobile1 = driver.findElement(By.cssSelector("h2[class='product-name'] a[title='IPhone']")).getText();

		String mobile2 = driver.findElement(By.cssSelector("h2[class='product-name'] a[title='Samsung Galaxy']"))
				.getText();

		

		return new String[] { mobile1, mobile2 };
	}
	
	public void mobile_Wishlist() {
		driver.findElement(By.xpath("(//ul)[4]//a[1]")).click();
	}

}
