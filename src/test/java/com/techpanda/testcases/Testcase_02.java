package com.techpanda.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.seleniumbase.Initiate;
import com.techpanda.pages.MobilePage;

public class Testcase_02 {

	@Test
	void case2() {
		WebDriver driver = Initiate.BrowserSetUp();

		MobilePage mobilePage = new MobilePage(driver);
		mobilePage.NavigateToMoblietab();

		System.out.println(mobilePage.VerifyTitle());

		String Actual = mobilePage.Cost0fSonyXperia();

		String Expected = mobilePage.compare_CostofSonyXperia();

		Assert.assertEquals(Actual, Expected);
		
		Initiate.teardown();
	}

}
