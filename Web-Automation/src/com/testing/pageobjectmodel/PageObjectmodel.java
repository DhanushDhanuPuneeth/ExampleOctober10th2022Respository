package com.testing.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectmodel {
public PageObjectmodel(WebDriver oBrowser) {
	PageFactory.initElements(oBrowser,this);
	
}
private WebElement username;
public WebElement getusername()
{
	return username;
}
private WebElement pwd;
public WebElement getpwd()
{
	return pwd;
}

 @FindBy(xpath="//div[text()='Login ']")
private WebElement Login;
public WebElement getLogin()
{
	return Login;
}
private WebElement gettingStartedShortcutsPanelId;
public WebElement getFlyoutwindow()
{
	return gettingStartedShortcutsPanelId;
}
@FindBy(xpath="//a[text()='Logout']")
private WebElement logout;
public WebElement getlogout()
{
	
	
	return logout;
}
@FindBy(xpath="//div[text()='USERS']")
private WebElement clickonusers;

public WebElement getclickonUsers()
{
	return clickonusers;
	
}
@FindBy(xpath="//*[@id=\"createUserDiv\"]/div")
private WebElement createuser;
public WebElement getcreteuser()
{
	return  createuser;
}
private WebElement firstName;
public WebElement getfirstname()
{
	return firstName;
}
private WebElement lastName;
public WebElement getlastName()
{
	return lastName;
}
private WebElement email;
public WebElement getemail()
{
	return email;
}
private WebElement userDataLightBox_usernameField;
public WebElement getuserDataLightBox_usernameField()
{
	return userDataLightBox_usernameField;
}
private WebElement userDataLightBox_passwordField;
public WebElement getuserDataLightBox_passwordField()
{
	return userDataLightBox_passwordField;
}
private WebElement userDataLightBox_passwordCopyField;
public WebElement getuserDataLightBox_passwordCopyField()
{
	return userDataLightBox_passwordCopyField;
}
@FindBy(xpath="//span[text()='Create User']")
private WebElement create;
public WebElement getcreate()
{
	return create;
}
@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
private WebElement delete;
public WebElement getdelete()
{
	return delete;
}
@FindBy(xpath="//*[@id=\"userDataLightBox_deleteBtn\"]")
private WebElement deleteuser;
public WebElement getdeleteuser()
{
	return deleteuser;
}
@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
private WebElement modify;
public WebElement getmodify()
{
	return modify;
}
@FindBy(xpath="//*[@id=\"userDataLightBox_firstNameField\"]")
private WebElement modifyname;
public WebElement getmodifyname()
{
    return modifyname;
}@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
private WebElement savechanges;
public WebElement getsavechanges()
{
	return savechanges;
}
@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[3]/a")
private WebElement tasks;
public WebElement gettasks()
{
	return tasks;
}
@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")
private WebElement addcustomer;
public WebElement getaddcustomer()
{
	return addcustomer;
}
@FindBy(xpath="/html/body/div[14]/div[1]")
private WebElement allcustomer;
public WebElement getallcustomer()
{
	return allcustomer;
}
@FindBy(xpath="//*[@id=\"customerLightBox_nameField\"]")
private WebElement entercus;
public WebElement getentercus()
{
	return entercus;
}
@FindBy(xpath="//*[@id=\"customerLightBox_commitBtn\"]/div/span")
private WebElement createcustomer;
public WebElement getcretecustomer()
{
	return createcustomer;
}
@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
private WebElement deletecus;
public WebElement getdeletecus() 
{
	return deletecus;
}
@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div/div[2]")
private WebElement actionscus;
public WebElement getactionscus()
{
	return actionscus;
}
@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")
private WebElement delcus;
public WebElement getdelcus()
{
	return delcus;
}
@FindBy(xpath="//*[@id=\"customerPanel_deleteConfirm_submitBtn\"]/div")
private WebElement delper;
public WebElement getdelper()
{
	return delper;
}
@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
private WebElement modcus;
public WebElement getmodcus()
{
	return modcus;
}
@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[3]/div/div[1]")
private WebElement modname;
public WebElement getmodname()
{
	return modname;
}
@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[3]/div/div[2]/input")
private WebElement nameenter;
public WebElement getnameenter()
{
	return nameenter;
}
@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[1]")
private WebElement into;
public WebElement getinto()
{
	return into;
}
@FindBy(xpath="/html/body/div[14]/div[2]")
private WebElement addproject;
public WebElement getaddproject()
{
	return addproject;
}
@FindBy(xpath="//*[@id=\"projectPopup_projectNameField\"]")
private WebElement addnamepro;
public WebElement getaddnamepro()
{
	return addnamepro;
}
@FindBy(xpath="//*[@id=\"projectPopup_commitBtn\"]")
private WebElement crepro;
public WebElement getcrepro()
{
	return crepro;
}
@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
private WebElement delpro;
public WebElement getdelpro()
{
	return delpro;
}
@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
		private WebElement actiondel;
public WebElement getactiondel()
{
	return actiondel;
}
@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")
private WebElement delproject;
public WebElement getdelproject()
{
	return delproject;
}
@FindBy(xpath="//*[@id=\"projectPanel_deleteConfirm_submitBtn\"]/div")
private WebElement delprepro;
public WebElement getdelprepro()
{
	return delprepro;
}
@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
private WebElement modpro;
public WebElement getmodpro()
{
	return modpro;
}
@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[2]/div/div[1]")
private WebElement modnames;
public WebElement getmodnames()
{
	return modnames;
}
@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[2]/div/div[2]/input")
private WebElement modchange;
public WebElement getmodchange()
{
	return modchange;
}
@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[1]")
private WebElement intopro;
public WebElement getintopro()
{
	return intopro;
}
@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr/td[3]/a")
private WebElement creattask;
public WebElement getcreattask()
{
	return creattask;
}
@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/div[1]/div[3]/div/div[2]")
private WebElement taskadd;
public WebElement gettaskadd()
{
	return taskadd;
}
@FindBy(xpath="/html/body/div[13]/div[1]")
private WebElement alltasks;
public WebElement getalltasks()
{
	return alltasks;
}
@FindBy(xpath="//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")
private WebElement taska;
public WebElement gettaska()
{
	return taska;
}
@FindBy(xpath="//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[2]/td[1]/input")
private WebElement taskb;
public WebElement gettaskb()
{
	return taskb;
}
@FindBy(xpath="//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[3]/td[1]/input")
private WebElement taskc;
public WebElement gettaskc()
{
	return taskc;
}
@FindBy(xpath="//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[4]/td[1]/input")
private WebElement taskd;
public WebElement gettaskd()
{
	return taskd;
}
@FindBy(xpath="//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[5]/td[1]/input")
private WebElement taske;
public WebElement gettaske()
{
	return taske;
}
@FindBy(xpath="//*[@id=\"createTasksPopup_commitBtn\"]/div")
private WebElement cretetask;
public WebElement getcretetask()
{
	return cretetask;
}

@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/div[2]/div[1]/table[1]/tbody/tr[1]/td[2]")
private WebElement a;
public WebElement geta()
{
	return a;
}
@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")
private WebElement actiona;
public WebElement getactiona()
{
	return actiona;
}
@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[3]/div[4]/div/div[3]/div")
private WebElement actiondela;
public WebElement getactiondela()
{
	return actiondela;
}
@FindBy(xpath="//*[@id=\"taskPanel_deleteConfirm_submitBtn\"]/div")
private WebElement adelper;
public WebElement getadelper()
{
	return adelper;
}
@FindBy(xpath="//*[@id=\"username\"]")
private WebElement louser1;
public WebElement getlouser1()
{
	return louser1;
}
@FindBy(xpath="//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")
private WebElement loguser1;
public WebElement getloguser1()
{
	return loguser1;
}
@FindBy(xpath="//*[@id=\"loginButton\"]/div")
private WebElement loginuser1;
public WebElement getloginuser1()
{
	return loginuser1;
}
@FindBy(xpath="//*[@id=\"username\"]")
private WebElement louser2;
public WebElement getlouser2()
{
	return louser2;
}
@FindBy(xpath="//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")
private WebElement loguser2;
public WebElement getloguser2()
{
	return loguser2;
}
@FindBy(xpath="//*[@id=\"loginButton\"]/div")
private WebElement loginuser2;
public WebElement getloginuser2()
{
	return loginuser2;
}
@FindBy(xpath="//*[@id=\"username\"]")
private WebElement louser3;
public WebElement getlouser3()
{
	return louser3;
}
@FindBy(xpath="//*[@id=\"loginFormContainer\"]/tbody/tr[1]/td/table/tbody/tr[2]/td/input")
private WebElement loguser3;
public WebElement getloguser3()
{
	return loguser3;
}
@FindBy(xpath="//*[@id=\"loginButton\"]/div")
private WebElement loginuser3;
public WebElement getloginuser3()
{
	return loginuser3;
}
@FindBy(xpath="//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")
private WebElement loginaudio;
public WebElement getloginaudio()
{
	return loginaudio;
}


@FindBy(xpath="//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")
private WebElement startexploringactitime;
public WebElement getstartexploringactitime()
{
	return startexploringactitime;
}

@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")
private WebElement useronemodify;

public WebElement getModifyuseronePassword()
{
	return useronemodify;
}

@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
private WebElement savechangesuser;

public WebElement getsavechangesuser()
{
	return savechangesuser;
}


@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")
private WebElement usertwomodify;

public WebElement getModifyusertwoPassword()
{
	return usertwomodify;
}

@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]")
private WebElement userthreemodify;

public WebElement getModifyuserthreePassword()
{
	return userthreemodify;

}

@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")
private WebElement clickonusertwo;

public WebElement getclickonusertwo()
{
	return clickonusertwo;
}

@FindBy(xpath="//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")
private WebElement clickonuserthree;
public WebElement getclickonuserthree()
{
	return clickonuserthree;
}

}



