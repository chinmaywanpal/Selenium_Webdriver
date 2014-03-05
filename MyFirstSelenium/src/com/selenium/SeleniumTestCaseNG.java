package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class SeleniumTestCaseNG {

	WebDriver driver1;

	@BeforeMethod
	@Parameters("browser")
	public void launchBrowser(String browser) {
		if (browser.equalsIgnoreCase("FF"))
			driver1 = new FirefoxDriver();
		else if (browser.equalsIgnoreCase("CH")) {
			System.setProperty("webdriver.chrome.driver",
					"C:/Users/Chinmay/chromedriver_win32/chromedriver.exe");
			 driver1 = new ChromeDriver();

		}
	}

	@AfterMethod
	public void closeBrowser() {
		driver1.close();
		driver1.quit();

	}

}
