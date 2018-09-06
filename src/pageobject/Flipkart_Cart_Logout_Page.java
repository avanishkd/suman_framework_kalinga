package pageobject;
/**
 * @author sai
 * @date 31/08/2018
 * @purpose storing method for Flipkart_Cart and click on logout
 *
 */
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import reuseablecomponent.BaseClass;
import uistore.Flipkart_Cart_Logout_UI;
import utility.Log4j;

public class Flipkart_Cart_Logout_Page extends Flipkart_Cart_Logout_UI {

//clicking on cart
	public static void click_On_cart()
	{
		BaseClass.driver.findElement(cart).click();
	}
//taking  the total cart value
	public static String checkCartBill() {
		Log4j.info("Checking the bill amount");
			
			System.out.println(BaseClass.driver.findElement(cart_amount).getText());
			Log4j.debug("clicking on log_out button");
			return BaseClass.driver.findElement(cart_amount).getText();
		
		
	}
//logging out from flipkart
	public static void Logging_Out() {
		Log4j.info("Logging Out Started");
		
		Actions action = new Actions(BaseClass.driver);
		WebElement Hover = BaseClass.driver.findElement(hover_to);
		action.moveToElement(Hover).click().build().perform();
		WebElement element = Hover.findElement(logout);
		element.click();
	}
}