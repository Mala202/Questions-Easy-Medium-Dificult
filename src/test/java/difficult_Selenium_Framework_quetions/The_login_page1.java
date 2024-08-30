package difficult_Selenium_Framework_quetions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


@Test

public class The_login_page1 {
	public WebDriver driver;

	public The_login_page1() {
		//driver = initializeBrowserAndOpenApplication(Prop.getProperty("browser"));
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		LoginPage loginpage = new LoginPage();
		loginpage.combiningTwoActionsToNavigateTologinPage1();
		driver.findElement(By.id("email")).sendKeys("belioska05@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("ABdc56321");
		driver.findElement(By.cssSelector("button.action.login.primary")).click();
		driver.findElement(By.cssSelector("li.customer-welcome")).click();
		driver.findElement(By.linkText("my Account")).click();
		AssertJUnit.assertTrue(driver.findElement(By.linkText("My Orders")).isDisplayed());

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
