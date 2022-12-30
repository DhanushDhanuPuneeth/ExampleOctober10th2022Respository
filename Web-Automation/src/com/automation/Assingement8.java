package com.automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assingement8 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyoutwindow();
		createcustomer();
		createproject();
		createtask();
		deletetask();
		//deletecustomer();
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
private static void createproject()
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id=\'projectPopup_projectNameField\']")).sendKeys("assingement");
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//*[@id=\'projectPopup_commitBtn\']/div")).click();
		Thread.sleep(2000);
		
	}catch (Exception e)
	{
		e.printStackTrace();
	}
}
		private static void createtask()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("/html/body/div[13]/div[1]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")).sendKeys("java");
				oBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[2]/td[1]/input")).sendKeys("sample");
				oBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[2]/td[1]/input")).sendKeys("programming");
				oBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[4]/td[1]/input")).sendKeys("language");
				oBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[5]/td[1]/input")).sendKeys("injava");
				oBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_commitBtn\"]/div/span")).click();
				Thread.sleep(2000);
			}catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void minimize()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\"gettingStartedShortcutsPanelId\"]")).click();
				Thread.sleep(2000);
				
			}catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		
		private static void deletetask()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[2]/div[1]/table[1]/tbody/tr[1]/td[2]/div/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[3]/div[4]/div/div[3]/div")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"taskPanel_deleteConfirm_submitBtn\"]/div")).click();
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


