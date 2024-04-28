package com.uti;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SleniumClick5 {

	public void getActionClick(WebDriver driver, WebElement element){
		Actions act = new Actions(driver);
		act.click(element).build().perform();
		
	}
	public void javaScriptClick(WebDriver driver, WebElement element){
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", element);
		
	}
	
}
