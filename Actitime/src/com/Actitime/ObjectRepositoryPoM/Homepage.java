package com.Actitime.ObjectRepositoryPoM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	//Declaration
		@FindBy(id="container_tt")
		private WebElement timetracktab;
		
		@FindBy(id="container_tasks")
		private WebElement tasktab;
		
		@FindBy(id="container_reports")
		private WebElement reportstab;
		
		@FindBy(id="container_users")
		private WebElement userstab;
		
		@FindBy(id="logoutLink")
		private WebElement lolink;
		
		// Initializations
			public Homepage(WebDriver driver) {
				PageFactory.initElements(driver, this); 
			}

			//Utilization
			public WebElement getTimetracktab() {
				return timetracktab;
			}

			public WebElement getTasktab() {
				return tasktab;
			}

			public WebElement getReportstab() {
				return reportstab;
			}

			public WebElement getUserstab() {
				return userstab;
			}

			public WebElement getLolink() {
				return lolink;
			}
}
