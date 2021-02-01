package com.learningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildRelationship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\selenium\\eclipse\\chromedriver.exe");
		WebDriver uniqueDriver =new ChromeDriver();
		uniqueDriver.get("https://www.google.com");
		uniqueDriver.findElement(By.xpath("//div [@class = 'RNNXgb']/div/div[2]/input")).sendKeys("Ram Sita");
		uniqueDriver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).click();
		
	}

}
