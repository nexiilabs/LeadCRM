package com.nexii.lead;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class Administrator extends Helper{
	
	
	@Test  //Ajay
	public void admin_test(){
	helper.openBrowser();
	helper.login_CRM();
	List<WebElement> admin_menu =driver.findElement(By.id("tree_menu")).findElement(By.tagName("ul")).findElements(By.tagName("li"));
	for (int i = 0; i < admin_menu.size(); i++) {
		admin_menu.get(i).click();
	}
	}
  
  
}