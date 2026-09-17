package test;

import java.awt.AWTException;

import org.testng.annotations.Test;

import Base.BaseTest;
import pages.Login;

public class Testcase extends BaseTest{
	@Test
	public void naukri() throws AWTException, InterruptedException
	{
		Login login=new Login(driver);
		
		login.tapaswiniUpload();
		
	}

}
