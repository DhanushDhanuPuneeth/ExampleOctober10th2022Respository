package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assingement4 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyoutwindow();
		createcustomer();
		deletecustomer();
		//logout();
		//closeapp();

	}
	private static void launchBrowser()
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
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
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
	private static void createcustomer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_nameField\']")).sendKeys("java");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']")).click();
			Thread.sleep(2000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deletecustomer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\"customerPanel_deleteConfirm_submitBtn\"]/div")).click();
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
			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			Thread.sleep(2000);
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
	


	

