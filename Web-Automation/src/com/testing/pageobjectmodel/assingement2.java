package com.testing.pageobjectmodel;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assingement2 {
public static WebDriver oBrowser=null;
public static PageObjectmodel oPage=null;
	public static void main(String[] args) {
		launch();
		navigate();
		login();
		minimize();
		createUser();
		modify();
		delete();
		logout();
		close();
	}
	private static void launch()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", ".\\Library\\driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new PageObjectmodel(oBrowser);
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

private static void navigate()
{
	try
	{
		oBrowser.navigate().to("http://localhost/login.do");
		Thread.sleep(2000);
	}catch(Exception e)
	{
	  e.printStackTrace();
	}
}
 private static void login()
 {
	 try
	 {
		 oPage.getusername().sendKeys("admin");
		 oPage.getpwd().sendKeys("manager");
		 oPage.getLogin().click();
		 Thread.sleep(2000);
	 }catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 }
 private static void minimize()
 {
	 try
	 {
		 oPage.getFlyoutwindow().click();
		 Thread.sleep(2000);
 }catch(Exception e)
 {
	 e.printStackTrace();
 }
 } 
	 
	 private static void createUser()
	 {
		 try
		 {
			oPage.getclickonUsers().click();
			Thread.sleep(2000);
			oPage.getcreteuser().click();
			Thread.sleep(2000);
			oPage.getfirstname().sendKeys("java");
			oPage.getlastName().sendKeys("a");
			oPage.getemail().sendKeys("java@1");
			oPage.getuserDataLightBox_usernameField().sendKeys("javaa");
			oPage.getuserDataLightBox_passwordField().sendKeys("java1");
			oPage.getuserDataLightBox_passwordCopyField().sendKeys("java1");
			oPage. getcreate().click();
			Thread.sleep(2000);
	 }catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 }	 
	 private static void modify()
	 {
		 try
		 {
			 oPage.getmodify().click();
			 Thread.sleep(2000);
			 oPage.getmodifyname().sendKeys("program");
			 oPage.getsavechanges().click();
			 Thread.sleep(2000);
		 }catch (Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	 private static void delete()
		{
			try
			{
				oPage.getdelete().click();
				Thread.sleep(2000);
				oPage.getdeleteuser().click();
				Thread.sleep(2000);
				Alert oAlert=oBrowser.switchTo().alert();
				oAlert.accept();
				
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		}
	 private static void logout()
	 {
		 try
		 {
			 oPage.getlogout().click();
			 Thread.sleep(2000);
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }

	 private static void close()
	 {
		 try
		 {
			oBrowser.close(); 
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	}

