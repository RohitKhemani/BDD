package Stepping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Definitions {
	
	public static WebDriver driver;
	public static String Title;
	
	
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\exe files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
	}



	@When("the User enter Something")
	public void the_user_enter_something() {
		
	 Title =	driver.getTitle();
		
	}
	@Then("next Page is displayed")
	public void next_page_is_displayed() {
		
		System.out.println("title of the Page is:" +Title);
	}


}
