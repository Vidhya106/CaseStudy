package TestMe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class AddToCartTest {
	WebDriver driver;
	Actions act;
	String text="0";
	String ExpectedTitle ="View Cart";
	@Given("^User Should be logged in$")
	public void user_Should_be_logged_in() throws Throwable {
		 driver=BrowserClass.openBrowser("Chrome");
		  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		  driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.name("userName")).sendKeys("Lalitha");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.name("Login")).click();
	}

	@When("^User enters the \"([^\"]*)\" keyword$")
	public void user_enters_the_keyword(String arg1) throws Throwable {
		WebDriverWait wait= new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("myInput")));
		driver.findElement(By.id("myInput")).click();
		WebElement d=driver.findElement(By.xpath("//input[@id='myInput' and @name='products']"));
		d.sendKeys(new String[] {"head"});
	    
	}

	@When("^User selects the required product$")
	public void user_selects_the_required_product() throws Throwable {
		//driver.findElement(By.xpath("/html/body/div[1]/form/div[1]/div/div")).click();;
		driver.findElement(By.xpath("//input[@type='submit' and @name='val']")).click();
	    
	}

	@Then("^User must be navigated to Proudct Details Page$")
	public void user_must_be_navigated_to_Proudct_Details_Page() throws Throwable {
		
	    Assert.assertEquals(driver.getTitle(),"Search");
	  }
	@When("^User enters keyword$")
	public void user_enters_keyword() throws Throwable {
		WebDriverWait wait= new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("myInput")));
		driver.findElement(By.id("myInput")).click();
		WebElement d=driver.findElement(By.xpath("//input[@id='myInput' and @name='products']"));
		d.sendKeys(new String[] {"tap"});	   
	}

	@When("^User couldn't find the revelant products$")
	public void user_couldn_t_find_the_revelant_products() throws Throwable {
		//driver.findElement(By.xpath("//input[@type='submit' and @name='val']")).click();
	
	}

	@Then("^User gets an error message$")
	public void user_gets_an_error_message() throws Throwable {
	String s=  driver.findElement(By.xpath("//*[@id=\"itemscount\"]")).getText();
	System.out.println(s);
	Assert.assertTrue(s.equals(text));
	   driver.close();
	}

	@When("^User search a particular product$")
	public void user_search_a_particular_product() throws Throwable {
		WebDriverWait wait= new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("myInput")));
		driver.findElement(By.id("myInput")).click();
		WebElement d=driver.findElement(By.xpath("//input[@id='myInput' and @name='products']"));
		d.sendKeys(new String[] {"head"});	   
	}

	@When("^User try to move forward without adding product$")
	public void user_try_to_move_forward_without_adding_product() throws Throwable {
		
		driver.findElement(By.xpath("//input[@type='submit' and @name='val']")).click();
	}

	@Then("^TestMe doesn't display cart icon$")
	public void testme_doesn_t_display_cart_icon() throws Throwable {
	//	String cart=driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]/text()[1]")).getText();
		Assert.assertTrue("Cart cannot be found",ExpectedTitle.equals(driver.getTitle()));
	    
	} 

  
}
