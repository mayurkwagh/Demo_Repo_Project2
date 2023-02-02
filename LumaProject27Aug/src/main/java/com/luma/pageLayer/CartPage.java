package com.luma.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luma.testBase.TestBase;

public class CartPage extends TestBase {

	public CartPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//-------------- Obj repo -----------------
	
	@FindBy(xpath="//button[contains(text(),'Place Order')]")
	private WebElement place_order_btn;
	
	@FindBy(xpath="//input[@id='name']")  
	private WebElement username_txtbox;
	
	@FindBy(xpath="//input[@id='country']")
	private WebElement country_txtbox;
	
	@FindBy(xpath="//input[@id='city']")
	private WebElement city_txtbox;
	
	@FindBy(xpath="//input[@id='card']")
	private WebElement credit_card_txtbox;
	
	@FindBy(xpath="//input[@id='month']")
	private WebElement month_txtbox;
	
	@FindBy(xpath="//input[@id='year']")
	private WebElement year_txtbox;
	
	@FindBy(xpath="//button[contains(text(),'Purchased')]") //forced fail
	private WebElement purchase_btn;
	
	// ------------- Action methods -----------
	public void clickOnPlaceOrderButton()
	{
		place_order_btn.click();
	}	
	
	public void fillDetails()
	{
		//username_txtbox.sendKeys(read_data.readdata("user_details", 2, 0));
		//country_txtbox.sendKeys(read_data.readdata("user_details", 2, 1));
		//city_txtbox.sendKeys(read_data.readdata("user_details", 2, 2));
		//credit_card_txtbox.sendKeys(read_data.readdata("user_details", 2, 3));
		//month_txtbox.sendKeys(read_data.readdata("user_details", 2, 4));
		//year_txtbox.sendKeys(read_data.readdata("user_details", 2, 5));
		//purchase_btn.click();
		
		username_txtbox.sendKeys("mayur@11");
		country_txtbox.sendKeys("india");
		city_txtbox.sendKeys("phaltan");
		credit_card_txtbox.sendKeys("45676");
		month_txtbox.sendKeys("January23");
		year_txtbox.sendKeys("2023");
		purchase_btn.click();
	}
	
}
