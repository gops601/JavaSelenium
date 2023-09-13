package com.test.scripts;
import java.io.IOException;
import org.ictkerala.constants.AutomationConstants;
import org.ictkerala.pages.LoginPage;
import org.ictkerala.utilities.ExcelUtility;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends TestBase {

	LoginPage loginp ;
	@Test
	public void verifyinvalidLogin() throws IOException
	{	
		loginp=new LoginPage(driver);
		String username=ExcelUtility.getCellData(0, 0);
		String passwrd=ExcelUtility.getCellData(0, 1);
		System.out.println(username);
		loginp.setUsername(username);
		loginp.setPass(passwrd);
		loginp.loginclick();
		String ActualError=loginp.getError();
		System.out.println(ActualError);
		Assert.assertEquals(ActualError,AutomationConstants.passwordError );	
	}
	@Test
	public void verifyvalidLgin() throws IOException
	{
		String username=ExcelUtility.getCellData(1, 0);
		String passwrd=ExcelUtility.getCellData(1, 1);
		System.out.println(username);
		loginp.setUsername(username);
		loginp.setPass(passwrd);
		loginp.loginclick();
		String Actualprod=loginp.getLogotext();
		System.out.println(Actualprod);
		Assert.assertEquals(Actualprod,"Products");
	}
	
		
	}
	

