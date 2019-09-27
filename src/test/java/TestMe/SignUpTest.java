package TestMe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class SignUpTest {
   WebDriver driver;
   Select s;
	@Given("^User is on the SignUp page$")
	public void user_is_on_the_SignUp_page() throws Throwable {
		 driver=BrowserClass.openBrowser("Chrome");
		  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		  driver.findElement(By.linkText("SignUp")).click();
	    
	}

	@When("^User enters \"([^\"]*)\" in User Name Field$")
	public void user_enters_in_User_Name_Field(String arg1) throws Throwable {
		driver.findElement(By.name("userName")).sendKeys("JessicaDavis");
	}

	@When("^User enters \"([^\"]*)\" as First Name$")
	public void user_enters_as_First_Name(String arg1) throws Throwable {
		driver.findElement(By.name("firstName")).sendKeys("Vidhya");
	    
	}

	@When("^User enters \"([^\"]*)\" as Last Name$")
	public void user_enters_as_Last_Name(String arg1) throws Throwable {
		driver.findElement(By.name("lastName")).sendKeys("Anbu");
	    
	}

	@When("^User enters \"([^\"]*)\" in password field$")
	public void user_enters_in_password_field(String arg1) throws Throwable {
		 driver.findElement(By.name("password")).sendKeys("Vidhya98");
	    
	}

	@When("^User re-enters \"([^\"]*)\" in Confirm Password$")
	public void user_re_enters_in_Confirm_Password(String arg1) throws Throwable {
		driver.findElement(By.name("confirmPassword")).sendKeys("Vidhya98");
	   
	}

	@When("^User selects Female in Gender Field$")
	public void user_selects_Female_in_Gender_Field() throws Throwable {
		WebElement radio1= driver.findElement(By.xpath("//input[@type='radio' and @value='Female']"));
		radio1.click();

	   
	}

	@When("^User enters \"([^\"]*)\" in E- Mail field$")
	public void user_enters_in_E_Mail_field(String arg1) throws Throwable {
		driver.findElement(By.name("emailAddress")).sendKeys("vidhya98@gmail.com");
	   
	}

	@When("^User enters \"([^\"]*)\" in Mobile Number field$")
	public void user_enters_in_Mobile_Number_field(String arg1) throws Throwable {
		driver.findElement(By.name("mobileNumber")).sendKeys("7708884554");
	}

	@When("^User selects dob from calendar$")
	public void user_selects_dob_from_calendar() throws Throwable {
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[9]/div/div/img ")).click();
		  s=new Select (driver.findElement(By.xpath("/html/body/div/div/div/select[1]")));
		  s.selectByVisibleText("Mar");
		  s=new Select (driver.findElement(By.xpath("/html/body/div/div/div/select[2]")));
		   s.selectByVisibleText("1998");
		   driver.findElement(By.xpath("/html/body/div/table/tbody/tr[3]/td[4]/a")).click();
	}

	@When("^User selects the security Question$")
	public void user_selects_the_security_Question() throws Throwable {
		s=new Select (driver.findElement(By.name("securityQuestion")));
		   s.selectByValue("411011");
	}

	@When("^User enters \"([^\"]*)\" in Answer field$")
	public void user_enters_in_Answer_field(String arg1) throws Throwable {
		driver.findElement(By.name("answer")).sendKeys("Black");

	}

	@When("^User clicks on Register button$")
	public void user_clicks_on_Register_button() throws Throwable {
		driver.findElement(By.name("Submit")).click();
	}

	@Then("^User must be navigated to login page$")
	public void user_must_be_navigated_to_login_page() throws Throwable {
		 System.out.println("User enters");
		 Assert.assertEquals(driver.getTitle(),"Login");	
		 driver.close();
		 }


}
