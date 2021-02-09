package page;

import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	 WebDriver driver;
	
	public String GetPageTitle() {
		return driver.getTitle()  ;
		
	}
	public String GetCurrentUrl() {
		return driver.getCurrentUrl() ;
		
	}


}
