package com.techpanda.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.seleniumbase.Initiate;
import com.techpanda.pages.MobilePage;

public class Testcase_04 {
	
	
	@Test
	void case4() {
		
		WebDriver driver = Initiate.BrowserSetUp();

		MobilePage mobilePage = new MobilePage(driver);
		mobilePage.NavigateToMoblietab();

		System.out.println(mobilePage.VerifyTitle());
		
		String[] Result = mobilePage.VerifyAddtoCompare();
		
		System.out.println(Result);
		
		System.out.println(mobilePage.CompareWindow());
		
		//Initiate.HandlingWindow();
		
		Initiate.teardown();
	}

}
