package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a22 {
	 public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		lanch();
		navigate();
donate();
	}
	private static void lanch()
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
			oBrowser.get("http://www.amazon.in/");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void donate()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='nav-xshop']/a[11]")).click();
			oBrowser.findElement(By.xpath("//*[@id='Covid']/span/a/div[1]/img")).click();
			Thread.sleep(1000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		}
	

