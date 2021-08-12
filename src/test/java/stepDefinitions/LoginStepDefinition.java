package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class LoginStepDefinition {
	WebDriver driver;
	
	
	@Given("^user is already on Login page$")
	public void user_already_on_login_page() {
	//	System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_88v\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://freecrm.com/");		
	}
	
	@When("^title of login page is Free CRM$")	
	public void title_of_login_page_is_Free_CRM(){
		String title = driver.getTitle();
		System.out.println(title);
		//Assert.assertEquals("#1 Free CRM customer relationship management software cloud", title);
		Assert.assertEquals("1 Free CRM customer relationship management software cloud", title);
	}
	
	
	
	
	
}
