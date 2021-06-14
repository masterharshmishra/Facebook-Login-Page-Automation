package SampleTestOnline;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OnlineTest {
   
	   public static void main(String args[]) {
		   
		   
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\Harsh\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		   
		   WebDriver driver =  new ChromeDriver();
		   
		   driver.get("https://www.testandquiz.com/selenium/testing.html");
		   driver.manage().window().maximize();
		   
		   driver.findElement(By.id("fname")).sendKeys("MHARSH");
		   try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		   
		   driver.findElement(By.id("idOfButton")).click();
		   
		   try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   driver.findElement(By.id("male")).click();
		   try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   
		   driver.navigate().refresh();
		   try {
			   Thread.sleep(2000);
		   }catch (InterruptedException e)
		   {
			   e.printStackTrace();
		   }
		   
		   driver.findElement(By.id("fname")).sendKeys("Swag!!!");
		   
		   
		   try {
			   Thread.sleep(2000);
		   }catch (InterruptedException e)
		   {
			   e.printStackTrace();
		   }
		   
		   driver.findElement(By.id("female")).click();
		   
		  //  driver.findElement(By.linkText("This is a link")).click();
		   
		   try {
			   Thread.sleep(2000);
		   } catch (InterruptedException e)
		   {
		   e.printStackTrace();
		   }
		   
		   driver.findElement(By.className("Performance")).click();
		   
		   try {
			   Thread.sleep(1000);
		   }catch (InterruptedException e)
		   {
			   e.printStackTrace();
		   }
		   
		   Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));  
		   try {
			   Thread.sleep(1000);
		   }catch (InterruptedException e)
		   {
			   e.printStackTrace();
		   }
		   
		    dropdown.selectByVisibleText("Database Testing");  
		    try {
				   Thread.sleep(2000);
			   }catch (InterruptedException e)
			   {
				   e.printStackTrace();
			   }
		    
		        dropdown.selectByIndex(1); 
		        try {
					   Thread.sleep(2000);
				   }catch (InterruptedException e)
				   {
					   e.printStackTrace();
				   }
		     
		        
		        
		        
	 	   Actions actions = new Actions(driver);
			   actions.doubleClick(driver.findElement(By.id("dblClkBtn"))).perform();
			   
		        
	   }
	   
}
