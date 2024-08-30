package com.selenium_framework_quetions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

// day5th
//.Write a TestNG test to navigate to a website, click on a link to navigate to a different page, 
//and verify the presence of certain elements on the new page.
public class WebsiteElementsNewPage {
	 public WebDriver driver; 
	 
	 @Test
	 public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://tutorialsninja.com/demo/");
			driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[4]/div/div[1]/a/img")).click();
			driver.findElement(By.partialLinkText("Components")).click();	
		
		        
	}
		   
		

}

	

