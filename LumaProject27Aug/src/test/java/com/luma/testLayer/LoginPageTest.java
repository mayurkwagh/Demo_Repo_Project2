package com.luma.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.luma.testBase.TestBase;

public class LoginPageTest extends TestBase {

	@Test
	public void verifyLoginTest() throws InterruptedException
	{
		String expected_result = "Welcome testacc3";
		
		home_obj.clickOnLoginLink();
		//login_obj.enterUsername(read_config.getUsername()); //by configuration
		login_obj.enterUsername(read_data.readdata("login_data", 1, 0));
		//login_obj.enterPassword(read_config.getPassword()); //by configuration
		login_obj.enterPassword(read_data.readdata("login_data", 1, 1));
		login_obj.clickOnLoginButton();
		Thread.sleep(4000);
		logger.info("User logged into the application");
		String actual_output = login_obj.getLoginStatus();
		System.out.println(actual_output);
		Assert.assertEquals(actual_output, expected_result);
	}
}
