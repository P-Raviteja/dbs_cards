package com.dbs.test;

import ObjectRepository.Utility;

import org.testng.Assert;
import org.testng.annotations.Test;
import ObjectRepository.Keyword;

import org.openqa.selenium.By;

import ObjectRepository.HomePage_Tabs;

public class CompareCards extends HomePage_Tabs{

	public static void main(String[] args) throws InterruptedException {

		//Launch the browser 
		chromeBrowserLaunch(dbs_Cards);	
		
		//Click on tab "Cards"
		ClickOnTab("CreditCards");
		
		
		//scroll down 
		scroll(300);
		scroll(300);
		
		//Click on card - DBS Black Visa Card
		 driver.findElement(By.xpath("//*[@id=\"bodywrapper\"]/div[2]/div/div[1]/div/div/div[2]/div/div[2]/div/label/div[2]")).click();

		// Click on card - DBS Live Fresh Card
		 driver.findElement(By.xpath("//*[@id=\"bodywrapper\"]/div[2]/div/div[1]/div/div/div[3]/div/div[2]/div/label/div[2]")).click();
 
		 // Click on Compare 
		 driver.findElement(By.id("cardCompareBtn")).click();
		 Thread.sleep(3000);

		 //scroll down
		scroll(300);
		
		//Compare card DBS Black Visa Card
		String CardType = driver.findElement(By.xpath("//*[@id=\"card1\"]/div[6]/div[4]")).getText();
		System.out.println(CardType);
		String CardType_Expected = "VISA";
		System.out.println(CardType_Expected);
		Assert.assertEquals(CardType_Expected, CardType);
		
		System.out.println("Test Case Pass");
		
		closeTheBrowser();
		
	}

}
