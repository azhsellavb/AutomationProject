package Project_page;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Purchasebyclick 
{

	WebDriver driver;      

	By searchitem=By.xpath("/html/body/header/div[3]/div[2]/div/nav/div[2]/ul/li[2]/a");
	By Search=By.xpath("/html/body/header/div[3]/div[2]/div/nav/div[2]/ul/li[2]/a");
	By Item=By.xpath("//*[@id=\"srt_ajax_id\"]/div[1]/div/div[1]/a[1]");
	By cart=By.xpath("//*[@id=\"ads-2529\"]/button");
	By Viewcart=By.xpath("/html/body/header/div[3]/div[1]/div[4]/ul/li[1]/a[1]/img");
	By shopping=By.xpath("//*[@id=\"payd\"]/div/div[2]/a[2]");
	
	public Purchasebyclick(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setvalues()
	{
		
		driver.findElement(searchitem).click();
		
	}
	public void search()
	{
		driver.findElement(Search).click();
	}

	public void viewitem(String cartitem)
	{
		driver.findElement(Item).click();
	}
	public void clickcart()
	{
		driver.findElement(cart).click();		
	}
	
	public void showcart()
	{
		driver.findElement(Viewcart).click();
	}
	public void shopping() 
	{
		driver.findElement(shopping).click();
	}
	
	
	
}
