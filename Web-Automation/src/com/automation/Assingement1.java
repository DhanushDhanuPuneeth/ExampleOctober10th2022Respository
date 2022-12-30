package com.automation;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assingement1 {
	
					public static WebDriver oBrowser=null;
			public static void main(String[] args) {
				lanchBrowser();
				navigate();
				login();
				minimizeFlyoutwindow();
				createuser();
				//delectuser();
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

private static void createuser()
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
		
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
		
		Thread.sleep(2000);
		oBrowser.findElement(By.name("firstName")).sendKeys("demo");
		oBrowser.findElement(By.name("lastName")).sendKeys("user1");
		oBrowser.findElement(By.name("email")).sendKeys("demo@yahoo.com");
		oBrowser.findElement(By.name("username")).sendKeys("demoUs");
		oBrowser.findElement(By.name("password")).sendKeys("welcome1");
		oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome1");
		oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
				Thread.sleep(5000);
	}catch (Exception e)
	{
		e.printStackTrace();
		
	}
}
	
private static void delectuser() 
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_deleteBtn\"]")).click();
		Thread.sleep(2000);
		Alert oAlert=oBrowser.switchTo().alert();
		Thread.sleep(2000);
		String contentTo=oAlert.getText();
		oAlert.accept();
		Thread.sleep(2000);
	}catch (Exception e)
	{
		e.printStackTrace();
	}
	}

private static void deleteproject()
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[3]/div/div[1]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[3]/div/div[1]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id=\'projectPanel_deleteConfirm_submitBtn\']/div")).click();
		Thread.sleep(2000);
	}catch (Exception e )
	{
		e.printStackTrace();
	}
}
}