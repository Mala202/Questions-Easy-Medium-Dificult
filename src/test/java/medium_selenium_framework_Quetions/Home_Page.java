package medium_selenium_framework_Quetions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;





public class Home_Page {
	public WebDriver driver;
	
	@Test
	public void validatWebElementsHomePages() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo/");
	driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[4]/div/div[1]/a/img")).click();
	driver.findElement(By.partialLinkText("Components")).click();
	driver.findElement(By.partialLinkText("Software")).click();
	

	
	}
}

