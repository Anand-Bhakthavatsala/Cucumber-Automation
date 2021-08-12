package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class TestProject {
	WebDriver driver;
	
	
	@Given("^user is on Login page$")
	public void user_already_on_login_page() {
	//	System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_88v\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://example.testproject.io/web/");		
	}
	
	@When("^user enters username and password$")	
	public void title_of_login_page_is_Free_CRM(){
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("name")).sendKeys("test");
		driver.findElement(By.id("password")).sendKeys("test123");
		
	//	Assert.assertEquals("#1 Free CRM customer relationship management software cloud", title);
	}
	
	@And("^clicks on login button$")
	public void clicks_on_login_button()
	{
		driver.findElement(By.id("login")).click();
	}
	
	@Then("^user is navigated to the home page$")
	public void user_is_navigated_to_the_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new PendingException();
		String title = driver.getTitle();
		System.out.println(title);
	    Assert.assertEquals("TestProject Dem", title);
	    
	}
	
	
}
