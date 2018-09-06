package reuseablecomponent;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

/**
 * @author suman
 * @Date 31/08/2018
 * @purpose this class contains the component that can be used through out the whole framework
 *
 */
public class BaseClass {

	//default driver used through the whole framework
	public static WebDriver driver;
	public static String lastClassName;
	//constructor to set driver
	public BaseClass(WebDriver driver) {
		BaseClass.driver = driver;
	}

	//default implicit wait
	public static void Wait()
	{
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

}
