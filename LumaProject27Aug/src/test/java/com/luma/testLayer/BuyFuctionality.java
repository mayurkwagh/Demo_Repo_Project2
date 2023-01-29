package com.luma.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.luma.testBase.TestBase;

public class BuyFuctionality extends TestBase {
	
	@Test
	public void verifyBuyFunctionalityWithoutLogin() throws InterruptedException
	{
		String expected_output = "Thank you for your purchase!";
		//------------------------------
		home_obj.clickOnPhonesLink();
		home_obj.clickOnSamsungGalaxyS6Link();
		product_obj.clickOnAddToCartButton();
		Thread.sleep(2000);
		logger.info("Product added to cart");
		util_obj.acceptAlert();
		home_obj.clickOnCartLink();
		cart_obj.clickOnPlaceOrderButton();
		cart_obj.fillDetails();
		logger.info("Order placed successfully");
		//-------------------------------------
		String actual_output = confirm_obj.getStatus();
		Assert.assertEquals(actual_output, expected_output);	
	}
	
	
	@Test
	public void verifyBuyFunctionalityWithLogin() throws InterruptedException
	{
		String expected_output = "Thank you for your purchase!";
		//------------------------------
		home_obj.clickOnLoginLink();
		login_obj.enterUsername("testacc3");
		login_obj.enterPassword("test");
		login_obj.clickOnLoginButton();
		Thread.sleep(4000);
		
		home_obj.clickOnPhonesLink();
		home_obj.clickOnSamsungGalaxyS6Link();
		product_obj.clickOnAddToCartButton();
		Thread.sleep(2000);
		logger.info("Product added to cart");
		util_obj.acceptAlert();
		home_obj.clickOnCartLink();
		cart_obj.clickOnPlaceOrderButton();
		cart_obj.fillDetails();
		logger.info("Order placed successfully");
		//-------------------------------------
		String actual_output = confirm_obj.getStatus();
		Assert.assertEquals(actual_output, expected_output);	
	}

}
