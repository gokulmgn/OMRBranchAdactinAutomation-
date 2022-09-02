package com.Pages;

import java.awt.AWTException;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement txtUserName;

	@FindBy(id = "password")
	private WebElement txtpassword;

	@FindBy(id = "login")
	private WebElement btnlogin;

	@FindBy(xpath = "//b[contains(text(),'Invalid Login details ')]")
	private WebElement loginErrorMsg;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}

	public WebElement getLoginErrorMsg() {
		return loginErrorMsg;
	}

	// 1.Verifying Adactin Login With Valid Credentials
	// 3.Verifying Adactin Login With InValid Credentials
	public void login(String userName, String password) {
		sendKeys(txtUserName, userName);
		sendKeys(txtpassword, password);
		elementClick(btnlogin);

	}

	// 2.Verifying Adactin Login With Valid Credentials With Enter Key
	public void loginWithEnter(String userName, String password) throws AWTException {
		sendKeys(txtUserName, userName);
		sendKeys(txtpassword, password);
//		keypressactionbyRobot(KeyEvent.VK_TAB);
//		keyreleactionbyRobot(KeyEvent.VK_TAB);
//		keypressactionbyRobot(KeyEvent.VK_TAB);
//		keyreleactionbyRobot(KeyEvent.VK_TAB);
		keypressactionbyRobot(KeyEvent.VK_ENTER);
		keyreleactionbyRobot(KeyEvent.VK_ENTER);
	}

}
