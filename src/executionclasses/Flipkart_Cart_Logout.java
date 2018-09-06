package executionclasses;
/**
 * @author sai
 * @Date 31/08/2018
 * 
 *
 */
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pageobject.Flipkart_Cart_Logout_Page;
import reuseablecomponent.BaseClass;
import utility.ExcelUtils;
import utility.Log4j;
//listener for progressbar and extentreport

@Listeners({utility.ExtentReportListener.class,utility.ToProgressBar.class})
public class Flipkart_Cart_Logout extends End_Test {

	//storing the class name for picking value from excelsheet and other use
	String KeyVal=this.getClass().getName().substring(this.getClass().getName().indexOf(".")+1);

	@BeforeTest
	public void before_Logout()
	{
		Log4j.debug("starting logout");
	}
	@Test
	public void Logout() {
		BaseClass.Wait();
		Log4j.debug("opening cart");
		Flipkart_Cart_Logout_Page.click_On_cart();
		Log4j.debug("checking bill");
		String value=Flipkart_Cart_Logout_Page.checkCartBill();
		//ExcelUtils.setViaTEST(KeyVal, "RESULT", value);
		Log4j.debug("clicking in log out");
		Flipkart_Cart_Logout_Page.Logging_Out();
		Log4j.debug("veryfying the page");
	}
	@AfterTest
	public void After_Logout()
	{
		Log4j.debug("ending logout");
	}



}
