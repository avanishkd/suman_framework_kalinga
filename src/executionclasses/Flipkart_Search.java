package executionclasses;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pageobject.Flipkart_Search_Page;
import reuseablecomponent.BaseClass;
import utility.ExcelUtils;
import utility.Log4j;
import utility.Snippet;
@Listeners({utility.ExtentReportListener.class,utility.ToProgressBar.class})
public class Flipkart_Search 
{
	//storing the class name for picking value from excelsheet and other use
	String KeyVal=this.getClass().getName().substring(this.getClass().getName().indexOf(".")+1);
	@BeforeTest
	public void Before_Visit_Flipkart()
	{
		Log4j.debug("before test of  visit flipkart");
		//setting sheet no of excel sheet
		try {
			ExcelUtils.setExcelFile("Sheet1");
			} catch (Exception e) {
			e.printStackTrace();
			Log4j.error("error in opening excel");;
			}
	}
	@Test
	public void Search_For_Mobile()
	{
		Log4j.debug("searching mobile");
		//reading value from excel sheet
		String to_search=ExcelUtils.getViaTEST(KeyVal, "VALUE");
		Flipkart_Search_Page.Enter_Value_In_SearchBar(to_search);
		Log4j.debug("clicking on button");
		Flipkart_Search_Page.click_On_Search();
		//validating page
		if(BaseClass.driver.getCurrentUrl().contains(to_search)==true)
		{
			Log4j.debug("search successfully");			
			//ExcelUtils.setViaTEST(KeyVal, "RESULT","pass");
		}
		else
		{
			
			Log4j.debug("search is not successful");
		//	ExcelUtils.setViaTEST(KeyVal, "RESULT","fail");
			Assert.fail("search is not successful");
		}
		
	}


}
