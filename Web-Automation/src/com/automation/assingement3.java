package com.automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assingement3 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimize();
        createuser1();
        createuser2();
        createuser3();
        logoutadmin1();
        loginuser1();
        logoutuser1();
        loginuser2();
        logoutuser2();
        loginuser3();
        logoutuser3();
        loginuser11();
       modifypasworduser1();
       logoutuser11();
       loginuser22();
       modifypasworduser2();
       logoutuser22();
       loginuser33();
       modifypasworduser3();
       logoutuser33();
       login1();
      modify1();
       modify2();
       modify3();
      logout1();
      loginuser1new();
      logout2();
      loginuser2new();
     logout3();
       loginuser3new();
       logout4();
       deleteuser1();
       deleteuser2();
       deleteuser3();
       logout44();
        
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
private static void minimize()
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

private static void createuser1()
{
  try
  {
	  oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
	  Thread.sleep(2000);
	  oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
	  Thread.sleep(2000);
	  oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("program");
	  oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("a");
	  oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("program@123");
	  oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("programa");
	  oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("program1");
	  oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("program1");
	  oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
	  Thread.sleep(2000);
  } catch (Exception e)
  {
	  e.printStackTrace();
  }
}
private static void createuser2()
{
  try
  {
	  oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
	  Thread.sleep(2000);
	  oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
	  Thread.sleep(2000);
	  oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("selenium");
	  oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("b");
	  oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("selenium@123");
	  oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("seleniumb");
	  oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("selenium1");
	  oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("selenium1");
	  oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
	  Thread.sleep(2000);
  } catch (Exception e)
  {
	  e.printStackTrace();
  }
}
private static void createuser3()
{
  try
  {
	  oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
	  Thread.sleep(2000);
	  oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
	  Thread.sleep(2000);
	  oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("java");
	  oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("c");
	  oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("java@123");
	  oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("javac");
	  oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("java1");
	  oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("java1");
	  oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
	  Thread.sleep(2000);
  } catch (Exception e)
  {
	  e.printStackTrace();
  }
}
private static void logoutadmin1()
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
		Thread.sleep(1000);
	}catch (Exception e)
	{
		e.printStackTrace();
	}
}
private static void loginuser1()
{
	try
	{
		oBrowser.findElement(By.id("username")).sendKeys("programa");
		oBrowser.findElement(By.name("pwd")).sendKeys("program1");
		oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
  		Thread.sleep(2000);
  		
		}catch (Exception e)
	{
      e.printStackTrace();
	}
}
private static void logoutuser1()
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
		Thread.sleep(1000);
		
	}catch (Exception e)
	{
		e.printStackTrace();
	}
}
private static void loginuser2()
{
	try
	{
		oBrowser.findElement(By.id("username")).sendKeys("seleniumb");
		oBrowser.findElement(By.name("pwd")).sendKeys("selenium1");
		oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
  		Thread.sleep(2000);
  		
			}catch (Exception e)
	{
      e.printStackTrace();
	}
}
private static void logoutuser2()
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
		Thread.sleep(1000);
	}catch (Exception e)
	{
		e.printStackTrace();
	}
}

private static void loginuser3()
{
	try
	{
		oBrowser.findElement(By.id("username")).sendKeys("javac");
		oBrowser.findElement(By.name("pwd")).sendKeys("java1");
		oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
  		Thread.sleep(2000);
  		
		}catch (Exception e)
	{
      e.printStackTrace();
	}
}
private static void logoutuser3()
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
		Thread.sleep(1000);
	}catch (Exception e)
	{
		e.printStackTrace();
	}
}
private static void loginuser11()
{
	try
	{
		oBrowser.findElement(By.id("username")).sendKeys("programa");
		oBrowser.findElement(By.name("pwd")).sendKeys("program1");
		oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(1000);
		//oBrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
  		//Thread.sleep(2000);
  		
		}catch (Exception e)
	{
      e.printStackTrace();
	}
}
private static void modifypasworduser1()
{
	 try
	 {
		 oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[1]")).click();
		 Thread.sleep(1000);
		 oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
		 Thread.sleep(1000);
		 oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_passwordField']")).sendKeys("program2");
		 oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_passwordCopyField']")).sendKeys("program2");
		  oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
		 Thread.sleep(1000);
	 }catch (Exception e)
	 {
	    e.printStackTrace();
}
}
private static void logoutuser11()
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
		Thread.sleep(1000);
	}catch (Exception e)
	{
		e.printStackTrace();
	}
}
private static void loginuser22()
{
	try
	{
		oBrowser.findElement(By.id("username")).sendKeys("seleniumb");
		oBrowser.findElement(By.name("pwd")).sendKeys("selenium1");
		oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(1000);
		}catch (Exception e)
	{
      e.printStackTrace();
	}
}

private static void modifypasworduser2()
{
	 try
	 {
		 oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[1]")).click();
		 Thread.sleep(1000);
		 oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
		 Thread.sleep(1000);
		 oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_passwordField']")).sendKeys("selenium2");
		 oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_passwordCopyField']")).sendKeys("selenium2");
		  oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
		 Thread.sleep(1000);
	 }catch (Exception e)
	 {
	    e.printStackTrace();
}
}
private static void logoutuser22()
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
		Thread.sleep(1000);
	}catch (Exception e)
	{
		e.printStackTrace();
	}
}
private static void loginuser33()
{
	try
	{
		oBrowser.findElement(By.id("username")).sendKeys("javac");
		oBrowser.findElement(By.name("pwd")).sendKeys("java1");
		oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(1000);
		}catch (Exception e)
	{
      e.printStackTrace();
	}
}

private static void modifypasworduser3()
{
	 try
	 {
		 oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[1]")).click();
		 Thread.sleep(1000);
		 oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
		 Thread.sleep(1000);
		 oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_passwordField']")).sendKeys("java2");
		 oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_passwordCopyField']")).sendKeys("java2");
		  oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
		 Thread.sleep(1000);
	 }catch (Exception e)
	 {
	    e.printStackTrace();
}
}
private static void logoutuser33()
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
		Thread.sleep(1000);
	}catch (Exception e)
	{
		e.printStackTrace();
	}
}
private static void login1()
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
private static void modify1()
{
	 try
	 {
		 oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a")).click();
		 Thread.sleep(1000);
		 oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
		 Thread.sleep(1000);
		 oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_passwordField']")).sendKeys("program3");
		 oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_passwordCopyField']")).sendKeys("program3");
		  oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
		 Thread.sleep(1000);
	 }catch (Exception e)
	 {
	    e.printStackTrace();
}
}
private static void modify2()
{
	 try
	 {
		 oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[1]")).click();
		 Thread.sleep(1000);
		 oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
		 Thread.sleep(1000);
		 oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_passwordField']")).sendKeys("selenium3");
		 oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_passwordCopyField']")).sendKeys("selenium3");
		  oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
		 Thread.sleep(1000);
	 }catch (Exception e)
	 {
	    e.printStackTrace();
}
}
private static void modify3()
{
	 try
	 {
		 oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[1]")).click();
		 Thread.sleep(1000);
		 oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
		 Thread.sleep(1000);
		 oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_passwordField']")).sendKeys("java3");
		 oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_passwordCopyField']")).sendKeys("java3");
		  oBrowser.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
		 Thread.sleep(1000);
	 }catch (Exception e)
	 {
	    e.printStackTrace();
}
}
private static void logout1()
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
		Thread.sleep(1000);
	}catch (Exception e)
	{
		e.printStackTrace();
	}
}
private static void loginuser1new()
{
	try
	{
		oBrowser.findElement(By.id("username")).sendKeys("programa");
		oBrowser.findElement(By.name("pwd")).sendKeys("program3");
		oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(1000);
		}catch (Exception e)
	{
      e.printStackTrace();
	}
}
	private static void logout2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			Thread.sleep(1000);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginuser2new()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("seleniumb");
			oBrowser.findElement(By.name("pwd")).sendKeys("selenium3");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(1000);
			}catch (Exception e)
		{
	      e.printStackTrace();
		}
	}
		private static void logout3()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
				Thread.sleep(1000);
			}catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void loginuser3new()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("javac");
				oBrowser.findElement(By.name("pwd")).sendKeys("java3");
				oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
				Thread.sleep(1000);
				}catch (Exception e)
			{
		      e.printStackTrace();
			}
		}
			private static void logout4()
			{
				try
				{
					oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
					Thread.sleep(1000);
				}catch (Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void login2()
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

			private static void deleteuser1()
			{
				try
				{
					oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
					Thread.sleep(2000);
					oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
					Thread.sleep(2000);
					Alert ole=oBrowser.switchTo().alert();
					String info=ole.getText();
					System.out.println(info);
					ole.accept();
					Thread.sleep(2000);
				}catch (Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void deleteuser2()
			{
				try
				{
					oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
					Thread.sleep(2000);
					oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
					Thread.sleep(2000);
					Alert ole=oBrowser.switchTo().alert();
					String info=ole.getText();
					System.out.println(info);
					ole.accept();
					Thread.sleep(2000);
				}catch (Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void deleteuser3()
			{
				try
				{
					oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
					Thread.sleep(2000);
					oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
					Thread.sleep(2000);
					Alert ole=oBrowser.switchTo().alert();
					String info=ole.getText();
					System.out.println(info);
					ole.accept();
					Thread.sleep(2000);
				}catch (Exception e)
				{
					e.printStackTrace();
				}
			}
			private static void logout44()
			{
				try
				{
					oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
					Thread.sleep(1000);
				}catch (Exception e)
				{
					e.printStackTrace();
				}
			}
}