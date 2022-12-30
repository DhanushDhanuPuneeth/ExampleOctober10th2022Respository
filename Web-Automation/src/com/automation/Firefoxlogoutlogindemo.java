package com.automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Firefoxlogoutlogindemo {
		public static WebDriver oBrowser=null;
		public static void main(String[] args) {
			launchBrowser();
			navigate();
			login();
			minimizeFlyoutwindow();
			logout();
			closeapp();
		}
		private static void launchBrowser()
		{
			try
			{
				oBrowser=new FirefoxDriver();
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
		private static void logout()
		{
			try
			{
				oBrowser.findElement(By.linkText("logout")).click();
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










