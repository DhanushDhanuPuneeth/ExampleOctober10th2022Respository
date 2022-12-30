package com.automation;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Assingement2 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
				
						launchBrowser();
					navigate();
					login();
					minimizeFlyoutwindow();
					
					 createuser();
					 modifyuser();
					//delectuser();
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
						oBrowser.findElement(By.name("username")).sendKeys("demoq");
						oBrowser.findElement(By.name("password")).sendKeys("welcome1");
						oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome1");
						oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
								Thread.sleep(5000);
					}catch (Exception e)
					{
						e.printStackTrace();
					}
				}
					private static void modifyuser()
					{
						try
						{
							oBrowser.findElement(By.xpath("//span[text()='user1, demo']")).click();
							Thread.sleep(2000);
							oBrowser.findElement(By.name("firstName")).clear();
							oBrowser.findElement(By.name("firstName")).sendKeys("sample");
							Thread.sleep(2000);
							
							oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
							Thread.sleep(2000);
						}catch (Exception e)
						{
							e.printStackTrace();
					}	
}	


				private static void delectuser() 
				{
					try
					{
						oBrowser.findElement(By.xpath("//span[text()='user1, sample']")).click();
						Thread.sleep(2000);
						oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
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











	
