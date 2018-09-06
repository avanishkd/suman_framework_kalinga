package uistore;
/**
 * @author suman
 * @date 31/08/2018
 * @purpose storing locator for Flipkart_Home
 *
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import reuseablecomponent.BaseClass;

public class Flipkart_Home_UI 
{

	//locators
	protected static By userName=By.className("_2zrpKA");
	protected static By password=By.xpath("//div[@class='_39M2dM']//input[@type='password']");
	protected static By Button=By.xpath("//div[@class='_1avdGP']//button[@type='submit']");
	protected static By VerifyElement=By.xpath("//div[@class='_2cyQi_']");
}
