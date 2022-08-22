package com.Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.LoginPagePom;
import com.Utility.BaseClass;

public class TC_001 extends BaseClass {
	@Test
	public void Verify_TestLogin_validCredential() {
		//WebElement
		LoginPagePom login=PageFactory.initElements(driver, LoginPagePom.class);
		//login.getTxt_email().sendKeys("Test@gmail.com");
		//login.getTxt_password().sendKeys("13456");
		//login.getBtn_click();
		
		//excel testdata
		login.getTxt_email().sendKeys(excel.getStringData("Sheet1", 0, 0));
		login.getTxt_password().sendKeys(excel.getStringData("Sheet1", 0, 1));
		login.getBtn_click();
		
		
	}

}
