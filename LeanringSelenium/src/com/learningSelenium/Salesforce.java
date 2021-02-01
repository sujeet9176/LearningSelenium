package com.learningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) {
		// Selenium Code will go here
		
		//Set the path of exe to communicate with respective browser.
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\selenium\\eclipse\\chromedriver.exe");
		
		//Create Driver object for chromeDriver
		WebDriver driverrss =new ChromeDriver();
		
		//Register the URL when we need to perform testing
		driverrss.get("https://login.salesforce.com");
		
		//Locator supported by selenium
		// 1 - I
		// 2 - ClassName
		// 3 - Name
		// 4 - linkText
		// 5- Xpath
		// 6 - CSS
		
		// To get these locator we can right click inspect on element and copy -- xpath 
		
		
		//driverrss.findElement(By.id("username")).sendKeys("srai0430");
		driverrss.findElement(By.cssSelector("#username")).sendKeys("MyName is SUjeet");
		driverrss.findElement(By.name("pw")).sendKeys("testing");
		//driverrss.findElement(By.name("Login")).click();
		driverrss.findElement(By.xpath("//*[@id=\'Login\']")).click();
		driverrss.findElement(By.cssSelector("#error")).getText();
		System.out.println(driverrss.findElement(By.cssSelector("#error")).getText());
	}
}
