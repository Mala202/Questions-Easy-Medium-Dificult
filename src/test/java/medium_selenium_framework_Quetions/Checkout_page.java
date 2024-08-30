package medium_selenium_framework_Quetions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Checkout_page {
	
	public WebDriver driver;
	
	@Test
	public void Checkout_page() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
        driver.findElement(By.xpath("//div[@class=\"product-layout col-lg-3 col-md-3 col-sm-6 col-xs-12\"]/descendant::img")).click();
        driver.findElement(By.xpath("//div[@class='form-group']/descendant::button")).click();
        driver.findElement(By.id("cart-total")).click();
	}

}