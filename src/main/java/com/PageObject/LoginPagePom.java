package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPagePom {
   //WebElement-->Loginpage webpage
	@FindBy(how=How.XPATH,using="//input[@id='emai']")
	private WebElement txt_email;
	
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
	private WebElement txt_password;
	
	@FindBy(how=How.XPATH,using="//button[@name='login']")
	private WebElement btn_click;

	public WebElement getTxt_email() {
		return txt_email;
	}


	public WebElement getTxt_password() {
		return txt_password;
	}

	public WebElement getBtn_click() {
		return btn_click;
	}

}