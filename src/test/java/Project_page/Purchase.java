
package Project_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Purchase {
	
	
		WebDriver driver;      

		By searchitem=By.xpath("/html/body/header/div[3]/div[1]/div[2]/div/form/input");
		By Search=By.xpath("/html/body/header/div[3]/div[1]/div[2]/div/form/button");
		By Item=By.xpath("//*[@id=\"srt_ajax_id\"]/div[10]/div/div[1]/a[1]");
		By cart=By.xpath("//*[@id=\"ads-2172\"]/button");
		
		public Purchase(WebDriver driver)
		{
			this.driver=driver;
		}
		
		public void setvalues(String Item)
		{
			
			driver.findElement(searchitem).sendKeys(Item);
			
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
		
		
	
}
