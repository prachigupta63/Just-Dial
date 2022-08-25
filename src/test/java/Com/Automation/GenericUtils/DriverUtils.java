package Com.Automation.GenericUtils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverUtils {
	static WebDriver driver;
	public static void createDriver()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prachi.gupta2\\eclipse-workspace\\Alibaba_Test\\src\\test\\resources\\driver\\chromedriver.exe");
		 ChromeOptions option = new ChromeOptions();
			option.addArguments("start-maximized");
			option.addArguments("--disable-blink-features=AutomationControlled");
			option.addArguments("--disable-notifications");
			driver= new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	}


	public static WebDriver getDriver() {
		// TODO Auto-generated method stub
		if(driver== null)
		{
			createDriver();
		}
			return driver;
	}
}
