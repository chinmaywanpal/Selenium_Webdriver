package com.selenium;




import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pageobject.AccountcreationPage;
import pageobject.RegistrationPage;

public class WebDriverTest extends SeleniumTestCaseNG {
	String username = "name";

	@Test
	public void testRegistration() {
		RegistrationPage reg = new RegistrationPage(driver,username);
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		AccountcreationPage accountcreationPage =reg.registartion();

		assert driver
				.findElement(By.tagName("body"))
				.getText()
				.contains(
						"Thank you for registering. You may now sign-in using the user name and password");
//test1 for user name - using testNG
		assert driver.findElement(By.tagName("body")).getText()
				.contains(username);
//test2 for user name - using junit
		 Assert.assertTrue(accountcreationPage.isUserNamePresent(username));

	}

}
