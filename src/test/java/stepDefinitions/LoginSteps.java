package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPageObjects;

 public class LoginSteps {
	WebDriver driver;
	LoginPageObjects lg ;
	@Given("user is on login page")
	public void user_is_on_login_page() throws Exception {

		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.saucedemo.com/");
		lg= new LoginPageObjects(driver);
		lg.openLoginPage();
		Thread.sleep(1000);

	}

	@When("enter {string}")
	public void enter_username(String username) {
	     lg.enterUsername(username);
	}

	@When("enter password as {string}")
	public void enter_password(String password) {
	   lg.enterPassword(password);
	}

	@When("click on login button")
	public void click_on_login_button() {
	  lg.clickOnLogin();
	}

	@Then("user is on shopping page")
	public void user_is_on_shopping_page() throws Exception {
	  lg.validateProductPage();
	  Thread.sleep(2000);
	  driver.close();
	}



}
