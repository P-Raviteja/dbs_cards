package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class HomePage_Tabs extends Utility{

	public static void ClickOnTab(String tab) throws InterruptedException
	{	
		
	  if (tab=="CARDS")
	  {
		  driver.findElement(By.xpath("//*[@id=\"flpHeader\"]/header/div/div[2]/ul/li[2]/a")).click();
	  }
	  
	  if (tab=="BANK")
	  {
		  driver.findElement(By.xpath("//*[@id=\"flpHeader\"]/header/div/div[2]/ul/li[1]/a")).click();
	  }
	  
	  if (tab=="CreditCards")
	  {
		  driver.findElement(By.xpath("//*[@id=\"bodywrapper\"]/div[1]/div[1]/div/ul/li[2]/a")).click();
			Thread.sleep(8000);
	  }
	  

	}
	
	
}
