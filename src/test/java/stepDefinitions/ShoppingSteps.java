package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ShoppingPage;

public class ShoppingSteps {
	WebDriver driver;
	 ShoppingPage shp;
	@Given("user is on shopping main page")
	public void user_is_on_shopping_main_page() throws Exception {
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.saucedemo.com/");
		shp= new ShoppingPage(driver);
		shp.userLogin();
		Thread.sleep(1000);
	}

	@When("user cilcik Add To Cart button of first item")
	public void user_cilcik_add_to_cart_button_of_first_item() {
	   shp.addFirstItem();
	}

	@When("add second item")
	public void add_second_item() {
	   shp.addSecondItem();
	}

	@Then("item number in the cart will be {int}")
	public void item_number_in_the_cart_will_be(Integer int1) {
	    shp.checkItemNumberInCart();
	}
}
