package com.techpanda.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.seleniumbase.Initiate;
import com.techpanda.pages.MobilePage;

public class Testcase_03 {
    
	@Test
	void case3() {
		WebDriver driver = Initiate.BrowserSetUp();

		MobilePage mobilePage = new MobilePage(driver);
		mobilePage.NavigateToMoblietab();

		System.out.println(mobilePage.VerifyTitle());
		
		mobilePage.addTocart_SonyXperia();
		
		String Expected = mobilePage.VerifyErrMsg();
		
		String Actual = "* The maximum quantity allowed for purchase is 500.";
		
		Assert.assertEquals(Actual, Expected);
		
		String act = "You have no items in your shopping cart.";
		
		String exp = mobilePage.VerifyCart();
		
		Assert.assertEquals(act, exp);
		
		Initiate.teardown();
	}

}
