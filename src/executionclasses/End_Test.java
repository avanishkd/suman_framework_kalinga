package executionclasses;
/**
 * @author suman
 * @date 31/08/2018
 * @purpose storing the after class 
 *
 */
import org.testng.annotations.AfterClass;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import reuseablecomponent.BaseClass;
import utility.OpenReport;

public class End_Test 
{
	@AfterClass
	public void EndTest()
	{
		//closing driver
		BaseClass.driver.close();
		
		
	}

}
