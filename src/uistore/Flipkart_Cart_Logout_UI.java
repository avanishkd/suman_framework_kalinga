package uistore;
/**
 * @author sai
 * @date 31/08/2018
 * @purpose storing locator for Flipkart_Cart and click on logout
 *
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import reuseablecomponent.BaseClass;


public class Flipkart_Cart_Logout_UI  {

	//locators
	protected static By cart=By.xpath("//div[@class='_2f5Jjv']//span[contains(text(),'Cart')]");
	protected static By cart_amount = By.xpath("//div[@class='hJYgKM' and contains(text(),'Amount Payable')]//span");
	protected static By hover_to = By.xpath("//div[@class='_2f5Jjv']");
	protected static By logout= By.xpath("//div//li//div[contains(text(),'Logout')]");

}
