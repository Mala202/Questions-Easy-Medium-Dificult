package com.selenium_framework_quetions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class websiteverifytitle {
	
    @Test
	public static void main(String[]args) 
    {
    	
    	WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://tutorialsninja.com/demo/");
    	
    	String my_title=driver.getTitle();
    	System.out.println("Title is" + my_title);
    	
    	String expected_title="Your Store";
    	
    	Assert.assertEquals(my_title, expected_title);
    	
    	System.out.println("Test Completed");
    	
		

	}

}
