package com.techpanda.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.seleniumbase.Initiate;
import com.techpanda.pages.HomePage;
import com.techpanda.pages.TvPage;

public class Testcase_05 {
	
	@Test
	void case5() {
		WebDriver driver = Initiate.BrowserSetUp();
		
		HomePage homepage = new HomePage(driver);
		TvPage tvpage = new TvPage(driver);
		
		String name = homepage.AccountCreation();
		
		System.out.println(name);
		
	    tvpage.NavigateToTvtab();
	    
	    String msg = tvpage.Tv_wishlist();
	    
	    System.out.println(msg);
	    
	    Initiate.teardown();

	}
	


}
