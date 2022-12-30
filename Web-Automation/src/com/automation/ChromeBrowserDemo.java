package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		lanchbrowser();
		navigate();
		closeApplication();
	}
	private static void lanchbrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver",".\\Library\\driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
	try
	{
		oBrowser.get("http://localhost/login.do");
		Thread.sleep(5000);
	}catch (Exception e)
	{
		e.printStackTrace();
	}
}
	private static void closeApplication()
	{
		
		try
		{
			oBrowser.quit();
			
			
	}catch (Exception e)
	{
		e.printStackTrace();
	}
}
}

