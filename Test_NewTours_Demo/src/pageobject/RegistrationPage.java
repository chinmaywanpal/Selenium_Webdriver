package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

	WebDriver driver;
	String username;

	public RegistrationPage(WebDriver driver, String username ) {
		this.driver = driver;
		this.username = username;
	}

	public AccountcreationPage registartion() {
		driver.manage().window().maximize();
		driver.findElement(By.name("firstName")).sendKeys("FirstName");
		driver.findElement(By.name("lastName")).sendKeys("LastName");
		driver.findElement(By.name("phone")).sendKeys("999-999-9999");
		driver.findElement(By.name("userName")).sendKeys("myname@abc.def");
		driver.findElement(By.name("address1"))
				.sendKeys("000 MyStreet, MyTown");
		driver.findElement(By.name("city")).sendKeys("Boston");
		driver.findElement(By.name("state")).sendKeys("MA");
		driver.findElement(By.name("postalCode")).sendKeys("000000");

		new Select(driver.findElement(By.name("country")))
				.selectByVisibleText("INDIA");
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("register")).click();
		

		return new AccountcreationPage(driver);

	}
}
