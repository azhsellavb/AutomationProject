package Project_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register 
{
	WebDriver driver;
	
	By Name = By.name("name");
	By Email=By.name("email");
	By Mobile=By.name("phone");
	By Password=By.name("pass1");
	By Cpassword=By.name("pass2");
	By Register=By.xpath("/html/body/div[2]/div/form/button");
	
	
	public Register(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setvalues(String name,String email,String mobile,String password,String Cpasswords)
	{
		driver.findElement(Name).sendKeys(name);
		driver.findElement(Email).sendKeys(email);
		driver.findElement(Mobile).sendKeys(mobile);
		driver.findElement(Password).sendKeys(password);
		driver.findElement(Cpassword).sendKeys(Cpasswords);
		
	}
	
	public void registertest()
	{
		//driver.findElement(By.xpath("/html/body/header/div[3]/div[1]/div[4]/ul/li[2]/p[2]/a"));
		driver.findElement(Register).click();
		driver.navigate().back();
	}
	
	

}
