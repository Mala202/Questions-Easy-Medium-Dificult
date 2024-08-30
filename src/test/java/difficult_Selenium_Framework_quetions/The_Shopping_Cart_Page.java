package difficult_Selenium_Framework_quetions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class The_Shopping_Cart_Page {

	public WebDriver driver;

	@Test
	public void ValidateShoppingCartPage() {
		// driver = initializeBrowserAndOpenApplication(Prop.getProperty("browser"));
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[4]/a")).click();
		driver.findElement(By.cssSelector("div.button-group>button:nth-child(1)")).click();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
