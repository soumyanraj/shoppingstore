package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class BaseClass {

	public static Properties config = new Properties();
	public static WebDriver driver = null;
	public static Logger app_logs = Logger.getLogger("qaLogger");
	
	

	@BeforeSuite()
	public static void init() throws IOException {
		if (driver == null) {
			FileInputStream fis = new FileInputStream(
			System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties");
			config.load(fis);
			app_logs.debug("loading the config property file");

				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\src\\test\\resources\\driverexecutables\\chromedriver.exe");
				driver = new ChromeDriver();
				app_logs.debug("chrome browser launched");
				driver.get(config.getProperty("testsiteURL"));
			   driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		}
	}
	
	@AfterSuite()
	public void tearDown() throws AddressException, MessagingException, IOException {
		
		if(driver!=null) {
		  driver.quit();
		 	}
	}
}


