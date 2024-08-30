package difficult_Selenium_Framework_quetions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class SearchPages {
	public WebDriver driver;
	
	public void validateSearchPages(){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("cano");
		driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]/span")).click();
		
		
		
	}

}
