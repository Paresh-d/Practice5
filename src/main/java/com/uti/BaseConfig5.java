package com.uti;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class BaseConfig5 {

	public String  getConfig(String value) throws Exception {
		String filpath = "./Com.property";
		FileInputStream fis = new FileInputStream (filpath);
		Properties pro = new Properties();
		pro.load(fis);
		String eachValue = pro.get(value).toString();
		//System.out.println(eachValue);
		
		return eachValue;
	}
	public static void main(String[] args) throws Exception {
		BaseConfig5 obj = new BaseConfig5();
		obj.getConfig("URL");
		
	}
}
