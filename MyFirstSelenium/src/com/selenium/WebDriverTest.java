package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class WebDriverTest extends SeleniumTestCaseNG {

	public void testWiki() {

		driver1.get("http://www.wikipedia.org");
		// driver1.get("http://google.com");
		// WebElement element = driver1.findElement(By.name("q"));
		// element.sendKeys("Wikipedia");
		// element.submit();
		// driver1.findElement(By.cssSelector(".r:nth-of-type(1) a")).click();
		// String path = "ol[id='rso'] h3[class='r'] a";
		// driver1.findElements(By.cssSelector(path)).get(3).click();

		driver1.findElement(By.name("search")).sendKeys("Selenium Software");
		driver1.findElement(By.name("go")).click();
		;
		driver1.findElement(
				By.cssSelector(".mw-search-results li:nth-of-type(1) a"))
				.click();
		Assert.assertTrue(driver1
				.findElement(
						By.cssSelector("img[src='//upload.wikimedia.org/wikipedia/en/5/5c/Seleniumlogo.png']"))
				.isDisplayed());
	}
}
