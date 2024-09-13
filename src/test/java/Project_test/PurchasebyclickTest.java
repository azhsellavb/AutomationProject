package Project_test;
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Project_page.Purchasebyclick;


public class PurchasebyclickTest {
	
	    WebDriver driver;
		
		@BeforeTest
		public void setup()
		{
			driver=new ChromeDriver();
		}
		
		@BeforeMethod
		 public void url()
		 {
			 driver.get("https://freshdaykart.com/");
			 driver.manage().window().maximize();
			 
			    
		 }
		 @Test
		 public void testlogin() throws Exception
		 {
			 
			 Purchasebyclick  ob=new Purchasebyclick(driver);
			 ob.setvalues();
			 ob.search();
			 Thread.sleep(1000);
			 ob.viewitem("RAMRAJ New Seasons Organic Single Clove Garlic");
			 Thread.sleep(3000);
			 ob.clickcart();
			 ob.showcart();
			 Thread.sleep(5000);
			 ob.shopping();
			
			//SCREENSHOt PAGE
			
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src,new File("C:\\Users\\Azhsella\\OneDrive\\Desktop\\scrnshot\\pic.png"));
			
			
			//SCROLLDOWN AND CLICK DISCOUNT AND OFFERS 
			
			 JavascriptExecutor js= (JavascriptExecutor) driver;
			 js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			 driver.findElement(By.xpath("/html/body/footer/div[2]/div[1]/div[1]/ul/li[5]/a")).click();
			 
		    //SCREENSHOT/Element
			 	
			WebElement dayelement=driver.findElement(By.xpath("/html/body/footer/div[2]/div[1]/div[1]/ul/li[5]/a"));
					
			File srcl= dayelement.getScreenshotAs(OutputType.FILE);
					
			FileHandler.copy(srcl,new File("./SCREENSHOT//Element.png"));  
				
		 		 
				 
		 }

}
