package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePagePom {
   //WebElement--->HomePage WebPage
	@FindBy(how=How.XPATH,using="//input[@type='text']")
	private WebElement serchbar;

	public WebElement getSerchbar() {
		return serchbar;
	}

	
}
