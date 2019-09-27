package TestMe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class SignInTest {
	WebDriver driver;
	@Given("^User must be registered$")
	public void user_must_be_registered() throws Throwable {
		 driver=BrowserClass.openBrowser("Chrome");
		  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		  driver.findElement(By.linkText("SignIn")).click();
	}

	@Given("^User is on Login Page$")
	public void user_is_on_Login_Page() throws Throwable {
		 Assert.assertEquals(driver.getTitle(),"Login");
		
	}

	@When("^User enters \"([^\"]*)\" in username field$")
	public void user_enters_in_username_field(String arg1) throws Throwable {
		 driver.findElement(By.name("userName")).sendKeys(arg1);
	}

	@When("^user enters \"([^\"]*)\" in password field$")
	public void user_enters_Password_in_password_field(String arg) throws Throwable {
		driver.findElement(By.name("password")).sendKeys(arg);
	}

	@When("^User clicks Login button$")
	public void user_clicks_Login_button() throws Throwable {
		driver.findElement(By.name("Login")).click();
	}

	@Then("^User must be navigated to home page$")
	public void user_must_be_navigated_to_home_page() throws Throwable {
		 Assert.assertEquals(driver.getTitle(),"Home");
		 driver.close();
	}

 
}
