package com.testing.pageobjectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assingement3 {
public static WebDriver oBrowser=null;
public static PageObjectmodel oPage=null;
	public static void main(String[] args) {
		launch();
		navigate();
		login();
		minimize();
		createuser1();
		createuser2();
		createuser3();
		logoutad();
		loginuser1();
		logoutuser1();
		loginuser2();
		logoutuser2();
		loginuser3();
		logoutuser3();
		loginuser11();
		 modifyuser1();
		 loginuser22();
		 modifyuser2();
		 loginuser33();
		 modifyuser3();
		 loginuser1new();
		 loginuser2new();
		 loginuser3new();
		 loginadmin();
		 modifyuser11();
		 modifyuser22();
		 modifyuser33();
		 loginuser11new();
		 loginuser22new();
		 loginuser33new();
		loginadmin1();
		delete1();
		delete2();
		delete3();
		logout333();
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
	 
	 private static void createuser1()
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
	 private static void createuser2()
	 {
		 try
		 {
			oPage.getclickonUsers().click();
			Thread.sleep(2000);
			oPage.getcreteuser().click();
			Thread.sleep(2000);
			oPage.getfirstname().sendKeys("program");
			oPage.getlastName().sendKeys("b");
			oPage.getemail().sendKeys("program@1");
			oPage.getuserDataLightBox_usernameField().sendKeys("programb");
			oPage.getuserDataLightBox_passwordField().sendKeys("program1");
			oPage.getuserDataLightBox_passwordCopyField().sendKeys("program1");
			oPage. getcreate().click();
			Thread.sleep(2000);
	 }catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 }	 
	 private static void createuser3()
	 {
		 try
		 {
			oPage.getclickonUsers().click();
			Thread.sleep(2000);
			oPage.getcreteuser().click();
			Thread.sleep(2000);
			oPage.getfirstname().sendKeys("demo");
			oPage.getlastName().sendKeys("c");
			oPage.getemail().sendKeys("demo@1");
			oPage.getuserDataLightBox_usernameField().sendKeys("democ");
			oPage.getuserDataLightBox_passwordField().sendKeys("demo1");
			oPage.getuserDataLightBox_passwordCopyField().sendKeys("demo1");
			oPage. getcreate().click();
			Thread.sleep(2000);
	 }catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 }	 
	 private static void logoutad()
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
private static void loginuser1()
{
	try
	{
       oPage.getlouser1().sendKeys("javaa");
       Thread.sleep(2000);
       oPage.getloguser1().sendKeys("java1");
       Thread.sleep(2000);
       oPage.getloginuser1().click();
       Thread.sleep(2000);
       oPage.getstartexploringactitime().click();
       Thread.sleep(2000);
       
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void logoutuser1()
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





private static void loginuser2()
{
	try
	{
       oPage.getlouser2().sendKeys("programb");
       Thread.sleep(2000);
       oPage.getloguser2().sendKeys("program1");
       Thread.sleep(2000);
       oPage.getloginuser2().click();
       Thread.sleep(2000);
       oPage.getstartexploringactitime().click();
       Thread.sleep(2000);
       
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void logoutuser2()
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
private static void loginuser3()
{
	try
	{
       oPage.getlouser3().sendKeys("democ");
       Thread.sleep(2000);
       oPage.getloguser3().sendKeys("demo1");
       Thread.sleep(2000);
       oPage.getloginuser3().click();
       Thread.sleep(2000);
       oPage.getstartexploringactitime().click();
       Thread.sleep(2000);
       
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void logoutuser3()
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
private static void loginuser11()
{
	try
	{
       oPage.getlouser1().sendKeys("javaa");
       Thread.sleep(2000);
       oPage.getloguser1().sendKeys("java1");
       Thread.sleep(2000);
       oPage.getloginuser1().click();
       Thread.sleep(2000);
       
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}

private static void modifyuser1()
{
	try
	{
		oPage.getclickonUsers().click();
		Thread.sleep(2000);
		oPage.getModifyuseronePassword().click();
		Thread.sleep(2000);
		oPage.getuserDataLightBox_passwordField().sendKeys("java2");
		oPage.getuserDataLightBox_passwordCopyField().sendKeys("java2");
		oPage.getsavechangesuser().click();
		Thread.sleep(2000);
		 oPage.getlogout().click();
		 Thread.sleep(2000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void loginuser22()
{
	try
	{
       oPage.getlouser1().sendKeys("programb");
       Thread.sleep(2000);
       oPage.getloguser1().sendKeys("program1");
       Thread.sleep(2000);
       oPage.getloginuser1().click();
       Thread.sleep(2000);
       
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}

private static void modifyuser2()
{
	try
	{
		oPage.getclickonUsers().click();
		Thread.sleep(2000);
		oPage.getModifyusertwoPassword().click();
		Thread.sleep(2000);
		oPage.getuserDataLightBox_passwordField().sendKeys("program2");
		oPage.getuserDataLightBox_passwordCopyField().sendKeys("program2");
		oPage.getsavechangesuser().click();
		Thread.sleep(2000);
		 oPage.getlogout().click();
		 Thread.sleep(2000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void loginuser33()
{
	try
	{
       oPage.getlouser1().sendKeys("democ");
       Thread.sleep(2000);
       oPage.getloguser1().sendKeys("demo1");
       Thread.sleep(2000);
       oPage.getloginuser1().click();
       Thread.sleep(2000);
       
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}

private static void modifyuser3()
{
	try
	{
		oPage.getclickonUsers().click();
		Thread.sleep(2000);
		oPage.getModifyuserthreePassword().click();
		Thread.sleep(2000);
		oPage.getuserDataLightBox_passwordField().sendKeys("demo2");
		oPage.getuserDataLightBox_passwordCopyField().sendKeys("demo2");
		oPage.getsavechangesuser().click();
		Thread.sleep(2000);
		 oPage.getlogout().click();
		 Thread.sleep(2000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void loginuser1new()
{
	try
	{
       oPage.getlouser1().sendKeys("javaa");
       Thread.sleep(2000);
       oPage.getloguser1().sendKeys("java2");
       Thread.sleep(2000);
       oPage.getloginuser1().click();
       Thread.sleep(2000);
       oPage.getlogout().click();
		 Thread.sleep(2000);
       
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void loginuser2new()
{
	try
	{
       oPage.getlouser1().sendKeys("programb");
       Thread.sleep(2000);
       oPage.getloguser1().sendKeys("program2");
       Thread.sleep(2000);
       oPage.getloginuser1().click();
       Thread.sleep(2000);
       oPage.getlogout().click();
		 Thread.sleep(2000);
       
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void loginuser3new()
{
	try
	{
       oPage.getlouser1().sendKeys("democ");
       Thread.sleep(2000);
       oPage.getloguser1().sendKeys("demo2");
       Thread.sleep(2000);
       oPage.getloginuser1().click();
       Thread.sleep(2000);
       oPage.getlogout().click();
		 Thread.sleep(2000);
       
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void loginadmin()
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
private static void modifyuser11()
{
	try
	{
		oPage.getclickonUsers().click();
		Thread.sleep(2000);
		oPage.getModifyuseronePassword().click();
		Thread.sleep(2000);
		oPage.getuserDataLightBox_passwordField().sendKeys("java3");
		oPage.getuserDataLightBox_passwordCopyField().sendKeys("java3");
		oPage.getsavechangesuser().click();
		Thread.sleep(2000);
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void modifyuser22()
{
	try
	{
		
		oPage.getModifyusertwoPassword().click();
		Thread.sleep(2000);
		oPage.getuserDataLightBox_passwordField().sendKeys("program3");
		oPage.getuserDataLightBox_passwordCopyField().sendKeys("program3");
		oPage.getsavechangesuser().click();
		Thread.sleep(2000);
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void modifyuser33()
{
	try
	{
		
		oPage.getModifyuserthreePassword().click();
		Thread.sleep(2000);
		oPage.getuserDataLightBox_passwordField().sendKeys("demo3");
		oPage.getuserDataLightBox_passwordCopyField().sendKeys("demo3");
		oPage.getsavechangesuser().click();
		Thread.sleep(2000);
		oPage.getlogout().click();
		 Thread.sleep(2000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void loginuser11new()
{
	try
	{
       oPage.getlouser1().sendKeys("javaa");
       Thread.sleep(2000);
       oPage.getloguser1().sendKeys("java3");
       Thread.sleep(2000);
       oPage.getloginuser1().click();
       Thread.sleep(2000);
       oPage.getlogout().click();
		 Thread.sleep(2000);
       
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void loginuser22new()
{
	try
	{
       oPage.getlouser1().sendKeys("programb");
       Thread.sleep(2000);
       oPage.getloguser1().sendKeys("program3");
       Thread.sleep(2000);
       oPage.getloginuser1().click();
       Thread.sleep(2000);
       oPage.getlogout().click();
		 Thread.sleep(2000);
       
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void loginuser33new()
{
	try
	{
       oPage.getlouser1().sendKeys("democ");
       Thread.sleep(2000);
       oPage.getloguser1().sendKeys("demo3");
       Thread.sleep(2000);
       oPage.getloginuser1().click();
       Thread.sleep(2000);
       oPage.getlogout().click();
		 Thread.sleep(2000);
       
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
private static void loginadmin1()
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
private static void delete1()
{
	 try
	 {
		    oPage.getclickonUsers().click();
			Thread.sleep(2000);
			oPage.getModifyuseronePassword().click();
			Thread.sleep(2000);
			oPage.getdeleteuser().click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			oAlert.accept();
			Thread.sleep(2000);
	 }catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 }
private static void delete2()
{
	 try
	 {
		 
			oPage.getclickonusertwo().click();
			Thread.sleep(2000);
			oPage.getdeleteuser().click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			oAlert.accept();
			Thread.sleep(2000);
	 }catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 }
private static void delete3()
{
	 try
	 {
		 oPage.getclickonuserthree().click();
			Thread.sleep(2000);
			oPage.getdeleteuser().click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			oAlert.accept();
			Thread.sleep(2000);
	 }catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 }
private static void logout333()
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
}







