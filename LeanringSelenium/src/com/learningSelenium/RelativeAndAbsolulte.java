package com.learningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeAndAbsolulte {

public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D:\\Study\\selenium\\eclipse\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("https://www.usbank.com/index.html");

// if requirement  is not fix and inspect element is not available then use text  
driver.findElement(By.xpath("//li[text()='Lifetime access']")).click();

//if one sibling is have constant value then xpath for other
driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();

//if a chield element is constant and we need parent
System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));
//

}
}