package com.nexii.lead;

import org.testng.annotations.Test;

public class BDE extends Helper {
 
  @Test    
  public void bde_test() {
	  helper.openBrowser();

	  //helper.login_CRM();

	 // helper.login_CRM();

	  //Sreekar, continue the code here
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
@Test    
public void bde_test1() {
	  helper.openBrowser();
	  driver.manage().window().maximize();
	  //latest updated on 29th Sept
	  driver.findElement(By.className("close").findElement(By.linkText("Research Phase ")).click();
	  
	  
}
}
