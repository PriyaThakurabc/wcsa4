
package testPackage;

import java.io.IOException;

import org.junit.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.UsersPage;

public class ActiTimeCreateUser extends BaseTest{
	
	
	@Test
	public void createValidUser() throws InterruptedException, IOException
	{
		

		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		lp.actiTimeValidLogin(flib.readPropertyData(PROP_PATH, "Username"),flib.readPropertyData(PROP_PATH, "Password"));
		Thread.sleep(2000);
		HomePage hm = new HomePage(driver);
		
		
		hm.clickOnUser();
		UsersPage userPage= new UsersPage(driver);
		usersPage.clickOnTab();
		 userPage.validUsn(flib.readExcelData(EXCEL_PATH, "uservaliddata", 1, 0));
		 userPage.validpass(flib.readExcelData(EXCEL_PATH, "uservaliddata", 1, 1));
		 userPage.firstName(flib.readExcelData(EXCEL_PATH, "uservaliddata", 1, 2));
		 userPage.lastName(flib.readExcelData(EXCEL_PATH, "uservaliddata", 1, 3));
		 userPage.clickOnCreateButton();
		 Thread.sleep(2000);
		 userPage.
		 
		
		
		
		
	}
	

}
