


package ObjectRepository;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Utility extends Keyword
{

	
	public static void chromeBrowserLaunch(String url) throws InterruptedException
	{	
		//Launch the IE browser
		System.setProperty("webdriver.chrome.driver","E:\\CD1\\chromedriver.exe"); 
		driver=new ChromeDriver();  
      	//System.setProperty("webdriver.ie.driver","E://IEDriverServer.exe");
      	//driver=new InternetExplorerDriver();
      	driver.navigate().to(url);
      	Thread.sleep(3000);
        //Maximize the browser
      	driver.manage().window().maximize();
      	Thread.sleep(2000);
	}

	public static void closeTheBrowser() {
		driver.quit();
	}
	
	public static void scroll(int pixel) throws InterruptedException
	{
		//Scroll
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,"+pixel+")");Thread.sleep(2000);
	}
	
	public static void waitexplicit(By locator)
	{
		WebDriverWait waitone = new WebDriverWait(driver,30);
		waitone.until(ExpectedConditions.visibilityOfElementLocated(locator));    

	}
	public static void scrolltolocation(By locator) throws InterruptedException
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement location = driver.findElement(locator);
		jse.executeScript("arguments[0].scrollIntoView(true);",location );
	}
	
  public static void screnshot(String pj,String tc,String op) throws IOException
  {		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./Screenshots/" + pj +"/" + tc +"/"  +dateintext()+"_" +  currenttime() +"_" + op +".png"));
		System.out.println("Screenshot Taken: " +pj+ "_" +tc+ "_" +op );	  
  }
  public static String dateintext()
  {		DateFormat df = new SimpleDateFormat("dd"+ ""+"MMM");
	  	java.util.Date today = Calendar.getInstance().getTime();
	  	String dateintext = df.format(today);
	  	return dateintext ; }  
  public static String currenttime()
  {
	  DateFormat df = new SimpleDateFormat("HHmmss");
	  java.util.Date time = Calendar.getInstance().getTime();
	  String currenttime = df.format(time);
	  return currenttime ;
  }







}
