package com.Actitime.GenericLibraries;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Baseclass {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void databaseconnection() {
		Reporter.log("database connected",true);
	}
	
	
	@BeforeTest
	public void LaunchBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.actitime.com/login.do");
		Reporter.log("Browser is launched succesfully");
	}
	
	@BeforeMethod
	public void Login() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(5000);
		Reporter.log("Login done succesfully",true);
		
	}
	
	@AfterMethod
	public void Logout() {
		driver.findElement(By.id("logoutLink")).click();
		Reporter.log("Logout succesfully",true);
	}
	
	@AfterTest
	public void closeBrower() {
		driver.close();
		Reporter.log("Browser is closed",true);
	}
	
	@AfterSuite
	public void databaseDisconnected() {
		Reporter.log("Database disconnected succesfully ");
	}
	
	

}
