package com.seleniumbase;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeTest;

public class Initiate {

	public static WebDriver driver;

	@BeforeTest
	public static WebDriver BrowserSetUp() {
		// ChromeOptions option = new ChromeOptions();
		// option.setAcceptInsecureCerts(true);
		FirefoxOptions option = new FirefoxOptions();
		option.setAcceptInsecureCerts(true);

		try {
			// driver = new ChromeDriver(option);
			driver = new FirefoxDriver(option);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://live.techpanda.org/index.php/");
		return driver;
	}

	public static void ScreenShot(WebDriver driver) {
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(SrcFile, new File("./SeleniumScreenshots/Screen.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void HandlingWindow() {
		
		String currWindow = driver.getWindowHandle();
		
		Set<String> AllWindow = driver.getWindowHandles();
		
		for(String window: AllWindow)
		{
			if(window.equalsIgnoreCase(currWindow))
			{
				driver.switchTo().window(window);
				break;
			}
		}
	}
	
	

	public static void teardown() {
		driver.close();
	}
}
