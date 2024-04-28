package com.uti;

import org.openqa.selenium.By;

public class LoginPage5 {

	public By user= By.xpath("//*[@name='username']");
	public By password= By.xpath("//*[@type='password']");
	public By loginBtn= By.xpath("//*[@type='submit']");
	public By dropDownbtn= By.xpath("//*[@class='oxd-userdropdown-name']");
	public By logOutBtn= By.xpath("(//*[@class='oxd-userdropdown-link'])[4]");
}
