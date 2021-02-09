package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.LoginPage;
import util.BrowserFactory;

public class LoginStaps {
	WebDriver driver;
String username ="";
String password ="";
	@Given("^a valid user$")
	public void a_valid_user() {
	username="techfiosdemo@gmail.com";
	password="abc123";
	}

	@When("^user goes to Techfios Site$")
	public void user_goes_to_Techfios_Site()  {
	driver = BrowserFactory.startBrowser();
	    
	}

	@Then("^Login Page should be displayed$")
	public void login_Page_should_be_displayed()  {
	String expectedTitle= "Login - TechFios Test Application - Billing";
	LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
	String actualTitle = loginPage.GetPageTitle();
	Assert.assertEquals(expectedTitle, actualTitle);
	}

	@When("^user logs in with valid credentials$")
	public void user_logs_in_with_valid_credentials() {
	    
	}

	@Then("^Dashboard page should display$")
	public void dashboard_page_should_display()  {
	   
	}

	@Then("^username should match$")
	public void username_should_match()  {
	   
	}
}
