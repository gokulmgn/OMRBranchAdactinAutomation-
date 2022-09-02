package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SelectHotelPage extends BaseClass {
	
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy( xpath = "//td[text()='Select Hotel ']")
	private WebElement verifyTitle;
	
	@FindBy(id="radiobutton_0")
	private WebElement clickradiobutton;
	
    @FindBy(id="continue")
    private WebElement clickcontiune;
    
    @FindBy(id = "radiobutton_span")
    private WebElement errorSelectHotel;

	public WebElement getVerifyTitle() {
		return verifyTitle;
	}

	public WebElement getClickradiobutton() {
		return clickradiobutton;
	}

	public WebElement getClickcontiune() {
		return clickcontiune;
	}

	public WebElement getErrorSelectHotel() {
		return errorSelectHotel;
	}
	
	//1.Verifying Adactin Hotel By Select Hotel Name and Verify Book A Hotel
	public void SelectHotel() {
		elementClick(getClickradiobutton());
		elementClick(getClickcontiune());
	}

	//2.Verifying Adactin Hotel By Without Select Hotel Click Continue
	public void selectContinue() {
		elementClick(getClickcontiune());
      
	}
}
