package com.BDD.cucumber.practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.uti.BaseConfig5;
import com.uti.LoginPage5;
import com.uti.SeleniumWait5;
import com.uti.SleniumHighlighter5;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef5 {
	WebDriver driver;
	BaseConfig5 obj = new BaseConfig5();
	LoginPage5 pom = new LoginPage5();
	
@Given("Open a Browser")
public void open_a_Browser() {
 driver = new ChromeDriver();
}
@Given("Go to application Url")
public void go_to_application_Url() throws Exception {
	driver.get(obj.getConfig("URL"));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	}

@When("Put a valid User")
public void put_a_valid_User() throws Exception {
	SleniumHighlighter5.getColor(driver, driver.findElement(pom.user),"red");
	driver.findElement(pom.user).sendKeys(obj.getConfig("USER"));
	}
@When("Put a valid Password")
public void put_a_valid_Password() throws Exception {
	SleniumHighlighter5.getColor(driver, driver.findElement(pom.password),"green");
	driver.findElement(pom.password).sendKeys(obj.getConfig("PASSWORD"));
	 }
@When("Click Login Btn")
public void click_Login_Btn() {
	SleniumHighlighter5.getColor(driver, driver.findElement(pom.loginBtn),"blue");
	driver.findElement(pom.loginBtn).click();
}
@When("Click dropDown Btn")
public void click_dropDown_Btn() {
	SleniumHighlighter5.getColor(driver, driver.findElement(pom.dropDownbtn),"purple");
	driver.findElement(pom.dropDownbtn).click();
}
@Then("Test will pass if logOut Btn found")
public void test_will_pass_if_logOut_Btn_found() throws Exception {
	SleniumHighlighter5.getColor(driver, driver.findElement(pom.logOutBtn),"green");
	WebElement logout = driver.findElement(pom.logOutBtn);
	SeleniumWait5.getExplicitWait(driver, logout);
	boolean logOutFound = logout.isDisplayed();
	Thread.sleep(10000);
	driver.close();
}
	
}