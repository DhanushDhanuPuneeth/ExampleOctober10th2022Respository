package com.automation;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Flipcart {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		//LinkCollections();
		//LinksDisplay();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", ".\\Library\\driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			
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
	private static void LinkCollections()
	{
		try
		{
			List<WebElement> olink=oBrowser.findElements(By.xpath("//a[@href]"));
			int count=olink.size();
			System.out.println("# links count:"+count);
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void LinksDisplay()
	{
		try
		{
			List<WebElement> olinkink=oBrowser.findElements(By.xpath("//a[@href]"));
			for(int i=0;i<olinkink.size();i++)
			{
				String print=olinkink.get(i).getText();
				System.out.println(print);
			}
			
		}catch(Exception e)
		{
		
			e.printStackTrace();
		}
	}
}
	
	



