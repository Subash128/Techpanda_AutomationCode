package com.techpanda.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.techpanda.pages.*;

import com.seleniumbase.*;

public class Testcase_01 {

	@Test
	public void case1() {
		WebDriver driver = Initiate.BrowserSetUp();

		HomePage homePage = new HomePage(driver);
		System.out.println(homePage.VerifyTitle());

		MobilePage mobilePage = new MobilePage(driver);
		mobilePage.NavigateToMoblietab();

		System.out.println(mobilePage.VerifyTitle());
		mobilePage.SortBy_Name();

		Initiate.teardown();
	}

}
