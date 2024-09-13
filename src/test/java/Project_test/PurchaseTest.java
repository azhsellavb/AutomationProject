package Project_test;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Project_page.Purchase;

public class PurchaseTest 
{
	
	
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
		 Purchase  ob=new Purchase(driver);
		 ob.setvalues("Oil");
		 ob.search();
		 ob.viewitem("SUNFIOWER OIL GW 2LTR BOTTLE");
		 Thread.sleep(3000);
		 ob.clickcart();
		 
		//Screenshot /page	
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src,new File("C:\\Users\\Azhsella\\OneDrive\\Desktop\\scrnshot\\image1.png"));
			
			driver.quit();
			
	 }

}
