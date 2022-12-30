package com.testing.pageobjectmodel;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
public class assingement4 {
public static WebDriver oBrowser=null;
public static PageObjectmodel oPage=null;
	public static void main(String[] args) {
		launch();
		navigate();
		login();
		minimize();
		cretecus();
		deletecus();
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
 private static void cretecus()
 {
	 try
	 {
		 oPage.gettasks().click();
		 Thread.sleep(2000);
		 oPage.getaddcustomer().click();
		 Thread.sleep(2000);
		 oPage.getallcustomer().click();
		 Thread.sleep(2000);
		 oPage.getentercus().sendKeys("java");
		 Thread.sleep(2000);
		 oPage.getcretecustomer().click();
		 Thread.sleep(2000);
	 }catch(Exception e)
	 {
		 e.printStackTrace();
	 }
 }
 private static void deletecus()
 {
	 try
	 {
		 oPage.getdeletecus().click();
		 Thread.sleep(2000);
		 oPage.getactionscus().click();
		 Thread.sleep(2000);
		 oPage.getdelcus().click();
		 Thread.sleep(2000);
		 oPage.getdelper().click();
		 Thread.sleep(2000);
		 
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


		



