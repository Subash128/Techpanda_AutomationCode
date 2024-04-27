package com.techpanda.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.seleniumbase.Initiate;
import com.techpanda.pages.HomePage;
import com.techpanda.pages.MobilePage;
import com.techpanda.pages.MyAccPage;
import com.techpanda.pages.TvPage;

public class Testcase_06 {

	@Test
	void case6() throws InterruptedException {

		WebDriver driver = Initiate.BrowserSetUp();

		HomePage homepage = new HomePage(driver);

		MyAccPage accpage = new MyAccPage(driver);

		homepage.Login();

		accpage.NavigateToAcc();

		accpage.MyWishlist();

		accpage.addTocart_FromAcc();

	}
}
