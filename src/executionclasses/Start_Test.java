package executionclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;


public class Start_Test 
{
	
	@BeforeClass
	public void visitPage()
	{
		// Log4j.startTestCase("before class");
		// FileReader reader=null;
		// Properties p=null;
		// //reading the property file
		// try {
		// 	reader = new FileReader("./CustomizeThings.properties");
		// 	p=new Properties();  
		// 	p.load(reader);
		// 	} catch (FileNotFoundException e) {
		// 				Log4j.error("property file load fail");
		// 												e.printStackTrace();
		// 	} catch (IOException e) {
		// 												e.printStackTrace();
		// 				Log4j.error("property file load fail");
		// 	}
		System.out.println(System.getProperty("user.dir")+"Driver");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Driver/chromedriver");
		
	ChromeOptions options = new ChromeOptions();
				options.addArguments("--headless");
				options.addArguments("--no-sandbox");
				
				
				DesiredCapabilities capabilities = DesiredCapabilities.chrome();
				capabilities.setCapability(ChromeOptions.CAPABILITY, options);
				WebDriver driver =new ChromeDriver(capabilities); 
			  

		
//    	WebDriver driver = new ChromeDriver();
		// Log4j.debug("opening url");
		// //opening url from propertyfile
		driver.get("https://www.google.co.in/");
		// new BaseClass(driver);
		// BaseClass.driver.manage().window().maximize();
		// Log4j.debug("maximizing window");
		

	}
}
