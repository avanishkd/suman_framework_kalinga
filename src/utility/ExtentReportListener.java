package utility;

import java.io.File;
import java.util.List;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
/**
 * @author Suman Kundu
 * @purpose Creating Extend Report
 * @Date 22/08/2018
 */
public class ExtentReportListener implements ISuiteListener,ITestListener {
	private ExtentReports exReport = null;
	private ExtentTest exTest = null;
	private String repo=null;
//closing extend report when suite stops
	public void onFinish(ISuite arg0) {
		try {
			exReport.flush();
		} finally {
			exReport.close();
			
			new TestSendMail(System.getProperty("user.dir")+ repo.substring(1));
			new OpenReport(System.getProperty("user.dir")+ repo.substring(1));
			OpenReport.open();
			TestSendMail.sendMain();
			
		}
	}
//starting extend report when suite start
	public void onStart(ISuite suite) {
		repo=".\\report\\"	+ "ExtendReport" + Snippet.getcurrentdateandtime() +".html";
		exReport = new ExtentReports(repo);
		exReport.loadConfig(new File(".\\report.xml"));
	}
//end test when test finish
	public void onFinish(ITestContext test) {
		exReport.endTest(exTest);
	}
//start test when test start
	public void onStart(ITestContext test) {
		exTest = exReport.startTest(test.getName());
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
	}
//when test fails
	public void onTestFailure(ITestResult test) {
		exTest.log(LogStatus.FAIL, "  <a href='" + Snippet.takeScreenShot() + "'>" + test.getTestClass().getName() + "</a>");
	}
//when test skips
	public void onTestSkipped(ITestResult test) {
		exTest.log(LogStatus.SKIP, "  <a href='" + Snippet.takeScreenShot() + "'>" + test.getTestClass().getName() + "</a>");
	}
	public void onTestStart(ITestResult arg0) {
	}
//when test success
	public void onTestSuccess(ITestResult test) {
		exTest.log(LogStatus.PASS,  "  <a href='" + Snippet.takeScreenShot() + "'>" + test.getTestClass().getName() + "</a>" );
	}
}
