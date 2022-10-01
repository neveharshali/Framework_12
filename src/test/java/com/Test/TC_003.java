package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.HomePagePom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class TC_003 extends BaseClass {
	@Test
	public void tc_001() {
		HomePagePom home=PageFactory.initElements(driver, HomePagePom.class);
		
		//Library.custom_sendkeys(home.getSerchbar(),"Maven");
	}

}
