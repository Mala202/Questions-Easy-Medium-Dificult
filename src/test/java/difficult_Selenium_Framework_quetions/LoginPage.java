package difficult_Selenium_Framework_quetions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;




public class LoginPage {
	public WebDriver driver;
	
	@FindBy(linkText = "My Account")
	private WebElement myAccoutDropdown;
	
	@FindBy(linkText = "Register")
	private WebElement RegisterOption;
	
	@FindBy(linkText = "Login")
	private WebElement LoginOption;
	
	@FindBy(linkText = "HP LP3065")
	private WebElement validProduct;
	
	
	
	public LoginPage combiningTwoActionsToNavigateTologinPage1() {
		myAccoutDropdown.click();
		LoginOption.click();
		return new LoginPage();
		
	}
	public boolean verifyValidProduct() {
		boolean status = validProduct.isDisplayed();
		return status;
	}

}
