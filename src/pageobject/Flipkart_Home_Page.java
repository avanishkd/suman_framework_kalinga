package pageobject;
/**
 * @author suman
 * @date 31/08/2018
 * @purpose storing method for Flipkart_Home_Page
 *
 */
import org.openqa.selenium.support.ui.ExpectedConditions;

import reuseablecomponent.BaseClass;
import uistore.Flipkart_Home_UI;

public class Flipkart_Home_Page extends Flipkart_Home_UI
{
	//entering username
	public static void enter_UserName(String value)
	{
		BaseClass.driver.findElement(userName).sendKeys(value);
	}
	//entering password
	public static void enter_PassWord(String value)
	{
		BaseClass.driver.findElement(password).sendKeys(value);
	}
	//clicking on login button
	public static void click_Login_Button()
	{
		BaseClass.driver.findElement(Button).click();
	}
	//verifying the page
	public static boolean verify()
	{
		return BaseClass.driver.findElement(VerifyElement).isDisplayed();
	
	}

}

