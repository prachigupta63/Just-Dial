package Com.Automation.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import Com.Automation.GenericUtils.DriverUtils;
import Com.Automation.GenericUtils.PropertyReader;
import Com.Automation.Pages.RegistrationPage;

public class RegistrationTest extends BaseTest{
	
   @Test
   
   public void registerSuccessful() throws InterruptedException
   {
	   DriverUtils.getDriver().get("https://www.justdial.com/");
	   ChromeOptions option = new ChromeOptions();
		option.addArguments("start-maximized");
		option.addArguments("--disable-blink-features=AutomationControlled");
		option.addArguments("--disable-notifications");
		DriverUtils.getDriver().manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	   RegistrationPage rg = new RegistrationPage();

	   rg.signIn();
	   rg.name(PropertyReader.getProperty("Name"));
	   rg.mobileNo(PropertyReader.getProperty("Mobile"));
	   rg.submit();
	   Thread.sleep(50000);
	   
		
   }
   
}
