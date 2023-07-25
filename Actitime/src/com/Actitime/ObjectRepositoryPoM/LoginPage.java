package com.Actitime.ObjectRepositoryPoM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Declaration
		@FindBy(id="username")// findby to file element in webpage
		private WebElement untbx;
		
		@FindBy(name="pwd")
		private WebElement pwtbx;
		
		@FindBy(xpath="//div[.='Login ']")
		private WebElement Lbtn;
			
			// Initializations
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);// this is use for 
			
		}
		
			//Utilization
		public WebElement getUn() {
			return untbx;
		}
		
		public WebElement getPw() {
			return pwtbx;
		}
		
		public WebElement getLbtn() {
			return Lbtn;
		}
	}


