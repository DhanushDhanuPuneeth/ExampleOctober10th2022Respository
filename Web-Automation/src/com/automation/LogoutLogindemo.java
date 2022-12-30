package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoutLogindemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		lanchBrowser();
		navigate();
		login();
		minimizeFlyoutwindow();
		logout();
		closeapp();
	}
	private static void lanchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver",".\\Library\\driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch (Exception e) {
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
	
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(5000);
	}catch (Exception e)
		{
		e.printStackTrace();
		}
	}

private static void minimizeFlyoutwindow()
{
	try
	{
		oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
		Thread.sleep(2000);
	}catch (Exception e)
	{
		e.printStackTrace();
	}
	}
private static void logout()
{
	try
	{
		oBrowser.findElement(By.linkText("logout")).click();
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void closeapp()
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



