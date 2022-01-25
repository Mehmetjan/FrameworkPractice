package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {

	WebDriver driver;
	public LoginPageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="user-name")
	WebElement username;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="login-button")
	WebElement loginButton;


	public void openLoginPage() throws Exception {

	System.out.println("main page is loaded");
	String title= driver.getTitle();
	Assert.assertEquals(title, "Swag Labs");

	}

	public void enterUsername(String Username) {
		 username.sendKeys(Username);

	}
	public void enterPassword(String Password) {
		password.sendKeys(Password);

	}
	public void clickOnLogin() {
		loginButton.click();
	}

	public void validateProductPage() {
		WebElement products= driver.findElement(By.xpath("//span[@class=\"title\"]"));
		String text =products.getText();
		Assert.assertEquals(text,"PRODUCTS");
	}




}
