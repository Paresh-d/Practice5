package com.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.uti.BaseConfig5;
import com.uti.LoginPage5;
import com.uti.SeleniumWait5;
import com.uti.SleniumHighlighter5;

public class LoginFunction5 {

	public void getLogin() throws Exception{
		WebDriver driver = new ChromeDriver();
		BaseConfig5 obj = new BaseConfig5();
		
		driver.get(obj.getConfig("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		LoginPage5 pom = new LoginPage5();
		SleniumHighlighter5.getColor(driver, driver.findElement(pom.user),"red");
		driver.findElement(pom.user).sendKeys(obj.getConfig("USER"));
		SleniumHighlighter5.getColor(driver, driver.findElement(pom.password),"green");
		driver.findElement(pom.password).sendKeys(obj.getConfig("PASSWORD"));
		SleniumHighlighter5.getColor(driver, driver.findElement(pom.loginBtn),"blue");
		driver.findElement(pom.loginBtn).click();
		SleniumHighlighter5.getColor(driver, driver.findElement(pom.dropDownbtn),"purple");
		driver.findElement(pom.dropDownbtn).click();
		SleniumHighlighter5.getColor(driver, driver.findElement(pom.logOutBtn),"green");
		WebElement logout = driver.findElement(pom.logOutBtn);
		SeleniumWait5.getExplicitWait(driver, logout);
		
		boolean logOutFound = logout.isDisplayed();
		Thread.sleep(30000);
		driver.close();
		
	}
}
