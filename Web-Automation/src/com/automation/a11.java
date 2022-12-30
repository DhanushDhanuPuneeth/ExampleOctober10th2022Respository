package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a11 {

    public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchbrowser();
	navigate();
login();
	}
	private static void launchbrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", ".\\Library\\driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
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
		
	
	oBrowser.get("https://opensource-demo.Orangehrmlive.com/web/index.php/auth/login");
	
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
		oBrowser.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("");
	    Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//*[@id='current-password']")).sendKeys("enter699100pass");
		oBrowser.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[1]/div/div[4]/div[1]/button")).click();
		Thread.sleep(2000);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
	}








