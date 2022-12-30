package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Third {
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
lanch();
navigate();
top();


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
			oBrowser.get("https://www.flipkart.com/");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void top()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div/div[1]/a/div[1]/div/img")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='container']/div/div[3]/div[1]/h1")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
