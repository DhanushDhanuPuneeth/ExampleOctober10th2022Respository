package com.testing.pageobjectmodel;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
public class assingement8 {
public static WebDriver oBrowser=null;
public static PageObjectmodel oPage=null;
	public static void main(String[] args) {
		launch();
		navigate();
		login();
		minimize();
		cretecus();
		creproject();
		cretetask();
		deletetask();
		deleteproject();
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
 private static void creproject()
 {
	 try
	 {
		 oPage.gettasks().click();
		 Thread.sleep(2000);
		 oPage.getaddcustomer().click();
		 Thread.sleep(2000);
		 oPage. getaddproject().click();
		 Thread.sleep(2000);
		 oPage.getaddnamepro().sendKeys("sample");
		 Thread.sleep(2000);
		 oPage.getcrepro().click();
		 Thread.sleep(2000);
	 } catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
 private static void cretetask()
 {
	 try
	 {
		 oPage.getcreattask().click();
		 Thread.sleep(2000);
		 oPage.gettaskadd().click();
		 Thread.sleep(2000);
		 oPage.getalltasks().click();
		 Thread.sleep(2000);
		 oPage.gettaska().sendKeys("a");
		 Thread.sleep(2000);
		 oPage.gettaskb().sendKeys("b");
		 Thread.sleep(2000);
		 oPage.gettaskc().sendKeys("c");
		 Thread.sleep(2000);
		 oPage.gettaskd().sendKeys("d");
		 Thread.sleep(2000);
		 oPage.gettaske().sendKeys("e");
		 Thread.sleep(2000);
		 oPage.getcretetask().click();
		 Thread.sleep(2000);
		 
	 } catch(Exception e)
		 {
			 e.printStackTrace();
		 }
 }
 private static void deletetask()
 {
	 try
	 {
		 oPage.geta().click();
		 Thread.sleep(2000);
		 oPage.getactiona().click();
		 Thread.sleep(2000);
		 oPage.getactiondela().click();
		 Thread.sleep(2000);
		 oPage.getadelper().click();
		 Thread.sleep(2000);
		
	 } catch(Exception e)
		 {
			 e.printStackTrace();
		 }
 }
 
 private static void deleteproject()
 {
	 try
	 {
		 oPage.getdelpro().click();
		 Thread.sleep(2000);
		 oPage.getactiondel().click();
		 Thread.sleep(2000);
		  oPage.getdelproject().click();
		 Thread.sleep(2000);
		 oPage.getdelprepro().click();
		 Thread.sleep(2000);
	 } catch(Exception e)
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


		





	





