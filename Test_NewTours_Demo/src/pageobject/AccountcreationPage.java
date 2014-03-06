package pageobject;

import org.openqa.selenium.WebDriver;

public class AccountcreationPage {

	
	WebDriver driver;
	public AccountcreationPage(WebDriver driver) {
		this.driver=driver;
	}
	
	 public boolean isUserNamePresent(String username){
		 if(username.equals("name"))
	 return true;
		 return false;
	 }

}
