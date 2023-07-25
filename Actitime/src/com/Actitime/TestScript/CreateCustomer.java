package com.Actitime.TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.Actitime.GenericLibraries.Baseclass;
import com.Actitime.GenericLibraries.FileLibrary;
import com.Actitime.ObjectRepositoryPoM.Homepage;
import com.Actitime.ObjectRepositoryPoM.TaskPage;

public class CreateCustomer extends Baseclass {
@Test
public void createCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
	Homepage hp= new Homepage(driver);
	hp.getTasktab().click();
	TaskPage tp=new TaskPage(driver);
	tp.getAddnewbtn().click();
	tp.getNewcustbtn().click();
	FileLibrary f1=new FileLibrary();
	String name = f1.ReadDataFromExcel("Pawan", 1, 1);
	tp.getCustname().sendKeys(name);
	
	String desc = f1.ReadDataFromExcel("Pawan", 1, 2);
	tp.getCustdescr().sendKeys(desc);
	
	tp.getCreatecust().click();
	Thread.sleep(5000);
	
	
	
	
	
			
}




}
