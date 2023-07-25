package com.Actitime.ObjectRepositoryPoM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
	//Declaration
		@FindBy(xpath="//div[.='Add New']")
		private WebElement addnewbtn;

		@FindBy(xpath="//div[.='+ New Customer']")
		private WebElement newcustbtn;
		
		@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
		private WebElement custname;
		
		@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
		private WebElement custdescr;
		
		@FindBy(xpath="//div[.='Create Customer']")
		private WebElement createcust;
		
		@FindBy(xpath="//div[@class='greyButton cancelBtn']")
		private WebElement cancel;
		
		//Initialition
			public TaskPage(WebDriver driver) {
				PageFactory.initElements(driver, this);
			}
			
			//Utilization

			public WebElement getAddnewbtn() {
				return addnewbtn;
			}

			public WebElement getNewcustbtn() {
				return newcustbtn;
			}

			public WebElement getCustname() {
				return custname;
			}

			public WebElement getCustdescr() {
				return custdescr;
			}

			public WebElement getCreatecust() {
				return createcust;
			}

			public WebElement getCancel() {
				return cancel;
			}

}
