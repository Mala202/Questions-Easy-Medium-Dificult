package medium_selenium_framework_Quetions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Register {
	
	public WebDriver driver;
	@Test
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();
	
		driver.findElement(By.id("input-firstname")).sendKeys("Hilook");
		driver.findElement(By.id("input-lastname")).sendKeys("ananti");
		driver.findElement(By.id("input-email")).sendKeys("belioska04@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("3329652356");
		driver.findElement(By.id("input-password")).sendKeys("Man23412");
		driver.findElement(By.id("input-confirm")).sendKeys("Man23412");
		driver.findElement(By.xpath("//input[@name = 'newsletter' and @value = '1']")).click();
		driver.findElement(By.xpath("//input[@name = 'agree']")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
}
