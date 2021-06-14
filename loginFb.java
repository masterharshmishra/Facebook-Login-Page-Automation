package selenium_BasicsPck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
     public static void main(String args[])
     {
    	 
      System.setProperty("webdriver.chrome.driver","C:\\Users\\Harsh\\Downloads\\chromedriver_win32\\chromedriver.exe" );
    	 
      WebDriver driver = new ChromeDriver();
      driver.get("https://facebook.com");
      
      driver.manage().window().maximize();
      
      driver.findElement(By.id("email")).sendKeys("harshtestmyamcat@gmail.com");
      try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      
      driver.findElement(By.id("pass")).sendKeys("Test@1234");
      driver.findElement(By.id("u_0_b")).click();	
