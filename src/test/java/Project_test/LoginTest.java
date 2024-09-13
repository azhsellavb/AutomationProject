package Project_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Project_page.Login;

public class LoginTest {
	

	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	 public void url()
	 {
		 driver.get("https://freshdaykart.com/sign-in");
		 driver.manage().window().maximize();
	 }
	 @Test
	 public void testlogin() throws Exception
	 {
		 Login  ob=new Login(driver);
		 ob.setvalues("azhsella.vb296@gmail.com","Azhs@2k23#");
		 ob.login();
		 
		 
		 //Logo Verification
		 
		    WebElement src=driver.findElement(By.xpath("/html/body/header/div[3]/div[1]/div[1]/a/img"));
			Boolean yes=src.isDisplayed();
			if(yes)
			{
				System.out.println("logo is Displayed");
			}
			else
			{
				System.out.println("Log is Not Displayed");
			}
			
		    driver.quit();
		 
	 }
	
	
	
	

}
