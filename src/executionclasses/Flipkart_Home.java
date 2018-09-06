package executionclasses;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageobject.Flipkart_Home_Page;
import reuseablecomponent.BaseClass;
import utility.ExcelUtils;
import utility.Log4j;
import utility.Snippet;
//@Listeners({utility.ExtentReportListener.class,utility.ToProgressBar.class})
public class Flipkart_Home extends Start_Test
{
	//storing the class name for picking value from excelsheet and other use
	String KeyVal=this.getClass().getName().substring(this.getClass().getName().indexOf(".")+1);
	@BeforeTest
	public void Before_Visit_Flipkart()
	{
		//setting sheet no
		// Log4j.debug("starting Flipkart Home");
		// try {
		// 	ExcelUtils.setExcelFile("Sheet1");
		// 	} catch (Exception e) {
		// 	e.printStackTrace();
		// 	}
	}
	//doing loggin
	@Test
	public void Visit_Flipkart()
	{
		System.out.println("Hi from linux");
		// BaseClass.Wait();
		// Log4j.debug("reading username");
		// Flipkart_Home_Page.enter_UserName(ExcelUtils.getViaTEST(KeyVal, "USERNAME"));
		// Log4j.debug("reading password");
		// Flipkart_Home_Page.enter_PassWord(ExcelUtils.getViaTEST(KeyVal, "PASSWORD"));
		// Log4j.debug("clicking on login button");
		// Flipkart_Home_Page.click_Login_Button();
		// if(Flipkart_Home_Page.verify()==true)
		// {
			
		// 	//ExcelUtils.setViaTEST(KeyVal, "RESULT","pass");
		// 	Log4j.debug("successfully searched value value");
		// }
		// else
		// {
			
		// 	//ExcelUtils.setViaTEST(KeyVal, "RESULT", "failL");
		// 	Log4j.error("reading password fail");
		// 	Assert.fail("not in that");
		// }
	}
	// @AfterTest
	// public void After_Visit_Filpkart()
	// {
	// 	Log4j.debug("ending of visit flipkart home");
	// }
	
	

}
