package com.selenium_framework_quetions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//day5
public class validatiLoginCredentials {
	public WebDriver driver;
	
	//Write a TestNG test to fill out a login form on a website and verify 
	//successful login with valid credentials.
	public static void main(String[] args) {
		validatiLoginCredentials();
	}
	public static void validatiLoginCredentials() {
		
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
		driver.findElement(By.id("input-email")).sendKeys("belioska05@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Abnhg123");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		
		
	}
				
	}

