package Project_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	
    WebDriver driver;         
	
	By Email=By.name("email");
	By Password=By.name("password");
	By Login=By.xpath("/html/body/div[2]/div/form[1]/button");
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setvalues(String email,String password)
	{
		
		driver.findElement(Email).sendKeys(email);
		driver.findElement(Password).sendKeys(password);
	}
	
	public void login()
	{
		driver.findElement(Login).click();
	}

}
