package com.sgtesting.testng;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class assingement7 {
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
							oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
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
	               
	        						
	                @Test(priority = 5)
	                private static void createcustomer()
	            	{
	            		try
	            		{
	            			String excepted,actual;
	        				excepted="Customers & Projects";
	            			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a")).click();
	            			Thread.sleep(2000);
	            			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
	            			Thread.sleep(2000);
	            			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
	            			Thread.sleep(2000);
	            			oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_nameField\']")).sendKeys("java");
	            			Thread.sleep(2000);
	            			oBrowser.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']")).click();
	            			Thread.sleep(2000);
	            			WebElement oEle=oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[1]"));
    						actual=oEle.getText();
    						Assert.assertTrue(excepted.contains(actual));
	            		}catch (Exception e)
	            		{
	            			e.printStackTrace();
	            		}
	            	}
	                @Test(priority = 6)
	                private static void createproject()
					{
						try
						{
							String excepted,actual;
	        				excepted="assingement";
							oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")).click();
							Thread.sleep(2000);
							oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
							Thread.sleep(2000);
							oBrowser.findElement(By.xpath("//*[@id=\'projectPopup_projectNameField\']")).sendKeys("assingement");
							Thread.sleep(2000);
							oBrowser.findElement(By.xpath("//*[@id=\'projectPopup_commitBtn\']/div")).click();
							Thread.sleep(2000);
							WebElement oEle=oBrowser.findElement(By.xpath("//div[text()='assingement']"));
    						actual=oEle.getText();
    						Assert.assertTrue(excepted.contains(actual));
						}catch (Exception e)
						{
							e.printStackTrace();
						}
					}
	                
	                @Test(priority = 7)
	                private static void modproject()
	                {
						try
						{
							String excepted,actual;
	        				excepted="java";
	        				oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[2]")).click();
							Thread.sleep(2000);
							oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
							Thread.sleep(2000);
							oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")).sendKeys("Assingement");
							Thread.sleep(2000);
							oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[1]")).click();
							Thread.sleep(2000);
							WebElement oEle=oBrowser.findElement(By.xpath("//a[text()='java']"));
    						actual=oEle.getText();
    						Assert.assertTrue(excepted.contains(actual));
						}catch (Exception e )
						{
							e.printStackTrace();
						}
					}
	                          
	                
	                
	                
	                @Test(priority = 8)
	                private static void deleteproject()
					{
						try
						{
							String excepted,actual;
	        				excepted="assingement";
							oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
							Thread.sleep(2000);
							oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div")).click();
							Thread.sleep(2000);
							oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")).click();
							Thread.sleep(2000);
							oBrowser.findElement(By.xpath("//*[@id=\'projectPanel_deleteConfirm_submitBtn\']/div")).click();
							Thread.sleep(2000);
							WebElement oEle=oBrowser.findElement(By.xpath("//div[text()='assingement']"));
    						actual=oEle.getText();
    						Assert.assertTrue(excepted.contains(actual));
						}catch (Exception e )
						{
							e.printStackTrace();
						}
					}
	              
	                @Test(priority = 9)
	            	private static void deletecustomer()
	            	{
	            		try
	            		{
	            			String excepted,actual;
	        				excepted="Customers & Projects";
	            			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
	            			Thread.sleep(2000);
	            			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div")).click();
	            			Thread.sleep(2000);
	            			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
	            			Thread.sleep(2000);
	            			oBrowser.findElement(By.xpath("//*[@id=\'customerPanel_deleteConfirm_submitBtn\']/div")).click();
	            			Thread.sleep(2000);
	            			WebElement oEle=oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[1]"));
    						actual=oEle.getText();
    						Assert.assertTrue(excepted.contains(actual));
	            		}catch (Exception e)
	            		{
	            			e.printStackTrace();
	            		}
	            	}
	               
	   
	                @Test(priority = 10)
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
	                
	               
	                @Test(priority = 11)
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
}