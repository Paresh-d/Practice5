package com.uti;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SleniumHighlighter5 {

	//public static void getColor(WebDriver driver, WebElement element){
		//JavascriptExecutor jse = (JavascriptExecutor) driver;
        //jse.executeScript("arguments[0].style.border='3px solid red'", element);
    //}
		
	public static void getColor(WebDriver driver, WebElement element, String color){
		JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].style.border='6px solid "+color+"'", element);
	}
}
