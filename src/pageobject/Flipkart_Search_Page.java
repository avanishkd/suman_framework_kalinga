package pageobject;
/**
 * @author suman
 * @date 31/08/2018
 * @purpose storing method for Flipkart_Cart and click on logout
 *
 */
import reuseablecomponent.BaseClass;
import uistore.Flipkart_Search_UI;

public class Flipkart_Search_Page extends Flipkart_Search_UI
{
	//entering value in searchbox
	
	public static void Enter_Value_In_SearchBar(String value)
	{
		BaseClass.driver.findElement(flipkart_search_Bar).sendKeys(value);
	}
	//clicking on search button
	public static void click_On_Search()
	{
		BaseClass.driver.findElement(flipkart_search_Button).click();
	}
	

}
