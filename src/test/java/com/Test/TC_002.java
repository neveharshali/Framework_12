package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.LoginPagePom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class TC_002 extends BaseClass {
	@Test
	public void Verify_TestLogin_validCredential() {
		LoginPagePom login=PageFactory.initElements(driver, LoginPagePom.class);
		Library.custom_sendkeys( login.getTxt_email(),excel.getStringData("Sheet1", 0, 0), "Email");
		Library.custom_sendkeys(login.getTxt_password(),excel.getStringData("Sheet1", 0, 1),"Password");
		Library.custom_click(login.getBtn_click(),"Login");
		
		//login.getTxt_email().sendKeys(excel.getStringData("Sheet1", 0, 0));
		//login.getTxt_password().sendKeys(excel.getStringData("Sheet1", 0, 1));
		//login.getBtn_click();
	}

}
