package com.nexii.lead;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BDE extends Helper{
 
  @Test    
  public void bde_test() 
  {
	  helper.openBrowser();
	  driver.manage().window().maximize();
	  helper.login_CRM(login.getProperty("bdeusername"), login.getProperty("bdepassword"));
	  //Sreekar, continue the code here
	  
	  List<WebElement> closelist= driver.findElement(By.className("menu")).findElements(By.className("close"));
	  System.out.println(closelist.size());
	  for(int i=0;i <closelist.size();i++)
	  {
		  helper.sleep(2);
		 System.out.println("Clicking the link :" +closelist.get(i).getText());
		  closelist.get(i).findElement(By.className("                                 symbol-close")).click();
		  }
	  List<WebElement> openlist= driver.findElement(By.className("menu")).findElements(By.className("open"));
	  System.out.println(openlist.size());
	  for(int j=0;j <openlist.size();j++)
	  {
		  helper.sleep(1);
		 System.out.println("Closing the link :" +openlist.get(j).getText());
		  openlist.get(j).findElement(By.className("                                 symbol-open")).click();
		  }
	  
	  driver.close();
  }
}


  