package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingPage {
	
		
@FindBy(xpath="(//button[text()='Add to cart'])[1]")
WebElement addButton1;
@FindBy(xpath="(//button[text()='Add to cart'])[3]")
WebElement addButton3;
@FindBy(xpath="//a[@class='shopping_cart_link']")
WebElement cartLink;
WebDriver driver;

public ShoppingPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void userLogin() {
	LoginPageObjects login= new LoginPageObjects(driver);
	login.enterUsername("standard_user");
	login.enterPassword("secret_sauce");
	login.clickOnLogin();
	
}
public void userOnShoppingPage() {
	String title = driver.getTitle();
	Assert.assertEquals(title,"Swag Labs");
}
public void addFirstItem() {
	addButton1.click();
}
public void addSecondItem() {
	addButton3.click();
}
public void checkItemNumberInCart() {
 String num= cartLink.getText();
 System.out.println("number of item is : "+num);

}
}
