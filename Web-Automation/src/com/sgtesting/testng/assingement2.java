package com.sgtesting.testng;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class assingement2 {
	public static WebDriver oBrowser=null;
	
	                @Test(priority = 1)
					private static void lanchBrowser()
					{
						try
						{
							System.setProperty("webdriver.chrome.driver",".\\Library\\driver\\chromedriver.exe");
							oBrowser=new ChromeDriver();
							Assert.assertNotNull(oBrowser);
							Thread.sleep(2000);
						}catch (Exception e) {
							e.printStackTrace();
						}
					}
	                @Test(priority = 2)
					private static void navigate()
					{
					try
					{
						String expected,actual;
						expected="actiTIME - Login";
			      		oBrowser.get("http://localhost/login.do");
						Thread.sleep(5000);
						actual=oBrowser.getTitle();
						Assert.assertEquals(expected, actual);
					}catch (Exception e)
					{
						e.printStackTrace();
					}
				}
	                @Test(priority = 3)
					private static void login()
					{
						try
						{
							oBrowser.findElement(By.id("username")).sendKeys("admin");
							Thread.sleep(2000);
							oBrowser.findElement(By.name("pwd")).sendKeys("manager");
							Thread.sleep(2000);
							oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
							Thread.sleep(5000);
							WebElement oEle=oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
		        			Assert.assertTrue(oEle.isDisplayed());
					}catch (Exception e)
						{
						e.printStackTrace();
						}
					}
	           	        			        		
	                @Test(priority = 4)
				private static void minimizeFlyoutwindow()
				{
					try
					{
						String expected,actual;
	        			expected="Getting Started Shortcuts";
						oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
						Thread.sleep(2000);
						WebElement oEle=oBrowser.findElement(By.xpath("//div[text()='Getting Started Shortcuts']"));
	        			actual=oEle.getText();
	        			Assert.assertTrue(expected.contains(actual));
					}catch (Exception e)
					{
						e.printStackTrace();
					}
					}
	                @Test(priority = 5,dataProvider = "users")
	                private static void createuser(String fname,String lname,String email,String username,String pwd,String retype) 
	            	{
	            		try
	            		{
	            			String expected,actual;
	            			expected="User List";
	            			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
	            			Thread.sleep(2000);
	            			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
	            			Thread.sleep(2000);
	            			Thread.sleep(2000);
	            			oBrowser.findElement(By.name("firstName")).sendKeys(fname);
	            			oBrowser.findElement(By.name("lastName")).sendKeys(lname);
	            			oBrowser.findElement(By.name("email")).sendKeys(email);
	            			oBrowser.findElement(By.name("username")).sendKeys(username);
	            			oBrowser.findElement(By.name("password")).sendKeys(pwd);
	            			oBrowser.findElement(By.name("passwordCopy")).sendKeys(retype);
	            			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
	            			Thread.sleep(5000);
	            			WebElement oEle=oBrowser.findElement(By.xpath("//span[text()='User List']"));
	            			actual=oEle.getText();
	            			Assert.assertTrue(expected.contains(actual));
	            			
	            		}catch (Exception e)
	            		{
	            			e.printStackTrace();

	            		}
	            	}
	                
	   
				
	                @Test(priority = 6,dataProvider = "modify")
	                private static void modifyuser(String fname)
					{
						try
						{
							String excepted,actual;
							excepted="a, demo";
							oBrowser.findElement(By.xpath("//span[text()='a, demo']")).click();
							Thread.sleep(2000);
							oBrowser.findElement(By.name("firstName")).clear();
							oBrowser.findElement(By.name("firstName")).sendKeys(fname);
							Thread.sleep(2000);
							
							oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
							Thread.sleep(2000);
							WebElement oEle=oBrowser.findElement(By.xpath("//span[text()='a, demo']"));
							actual=oEle.getText();
							Assert.assertTrue(excepted.contains(actual));
						}catch (Exception e)
						{
							e.printStackTrace();
					}	
}	
	                @Test(priority = 7)
	                private static void delectuser() 
	            	{
	            		try
	            		{
	            			String expected,actual;
	            			expected="a, demo";
	            			oBrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
	            			Thread.sleep(2000);
	            			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
	            			Thread.sleep(2000);
	            			Alert oAlert=oBrowser.switchTo().alert();
	            			Thread.sleep(2000);
	            			oAlert.getText();
	            			oAlert.accept();
	            			Thread.sleep(2000);
	            			WebElement oEle=oBrowser.findElement(By.xpath("//span[text()='a, demo']"));
	            			actual=oEle.getText();
	            			Assert.assertTrue(expected.contains(actual));
	            		}catch (Exception e)
	            		{
	            			e.printStackTrace();
						}	

	            		}
	                @Test(priority = 8)
	                private static void logout()
	                {
	                	try
	                	{
	                		String expected,actual;
		        			expected="actiTIME - Login";
	                		oBrowser.findElement(By.id("logoutLink")).click();
	                		Thread.sleep(2000);
	                		actual=oBrowser.getTitle();
		        			Assert.assertEquals(expected, actual);
	                	}catch(Exception e)
	                	{
	                		e.printStackTrace();
	                	}
	                }
	                
	               
	                @Test(priority = 9)
	                private static void closeapp()
	                {
	                	
	                	try
	                	{
	                		oBrowser.quit();
	                		oBrowser=null;
		        			Thread.sleep(2000);
		        			Assert.assertNull(oBrowser);
	                	}catch (Exception e)
	                {
	                	e.printStackTrace();
	                }
	                }
	                @DataProvider(name="users")
	            	public Object[][] usersData()
	            	{
	            		return new Object[][] {{"demo","a","demo@gmail.com","demoa","demo1","demo1"}};
	            		}
	            	
	                @DataProvider(name="modify")
	            	public Object[][] modifydata()
	            	{
	            		return new Object[][] {{"Sample"}};
	            		}
	            	}
