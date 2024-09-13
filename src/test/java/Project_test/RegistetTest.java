package Project_test;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Project_page.Register;



public class RegistetTest 
{

	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		
		
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://freshdaykart.com/sign-up");
		driver.manage().window().maximize();
	}
	@Test
	public void tesRegister() throws Exception
	{
		Register ob=new Register(driver);
		ob.setvalues("Azhsella", "azhsella.vb296@gmail.com", "7306080337", "Azhs@2k23#", "Azhs@2k23#");
		ob.registertest();
		
		//TITLE VERIFICATION
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String expected="Sign Up | Freshdaykart - Kochi";
		
		if(title.equalsIgnoreCase(expected))
		{
			System.out.println("Title Verification is Passed ");
		}
		else
		{
			System.out.println("Title Verification is Failed ");
		}
		
		// URL VERIFICATION
		
		URL ob1=new URL("https://freshdaykart.com/");
		HttpURLConnection con=(HttpURLConnection)ob1.openConnection();
		con.connect();
		if(con.getResponseCode()==200)
		{
			
			System.out.println("URL is valid ");
		}
		else
		{
			System.out.println("Invalid URL ");
		}      
		
		}
	
	
		

}


	
	

