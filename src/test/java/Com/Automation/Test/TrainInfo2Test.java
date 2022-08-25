package Com.Automation.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Com.Automation.GenericUtils.DriverUtils;
import Com.Automation.GenericUtils.PropertyReader;
import Com.Automation.Pages.TrainInfoPage;
import Com.Automation.Pages.TrainPage;

public class TrainInfo2Test extends BaseTest{
	
	
	@DataProvider(name = "test-data")
  	public Object[][] RegisterData(){
		    	return new Object[][]{
                    {"Agra Fort (AF)" , "Kanpur Central (CNB)"},{"2933@", "20$39-"}};
  	}
	
	
	@Test(dataProvider="test-data")
	
	public void bookSuccessful(String t1, String t2) throws InterruptedException, IOException
	{

		    DriverUtils.getDriver().get("https://www.justdial.com/");
		    ChromeOptions option = new ChromeOptions();
			option.addArguments("start-maximized");
			option.addArguments("--disable-blink-features=AutomationControlled");
			option.addArguments("--disable-notifications");
			DriverUtils.getDriver().manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
			
//		    RegistrationPage rg = new RegistrationPage();
//		    rg.signIn();
//		    rg.name(PropertyReader.getProperty("Name"));
//		    rg.mobileNo(PropertyReader.getProperty("Mobile"));
//		    rg.submit();
//		    Thread.sleep(50000);
//		   
		   
		    TrainPage tp= new TrainPage();
			tp.BookTrain();
			tp.departure(t1);
			tp.dest(t2);
			tp.depart();
			tp.date();
			tp.testData();
			tp.search(); 
		
			Thread.sleep(3000);
			System.out.println("Invalid Inputs");
		  
			 
			
//			try {
//			
//				WebDriverWait wait = new WebDriverWait(DriverUtils.getDriver(), 10);
//				wait.until(ExpectedConditions.urlToBe("https://www.justdial.com/travel/train-booking/trainbooking?source=&jdpromote=&search=&action=trainDetails&searchId=TBE5U7W9K1M7H9P8"));
//			}
//			
//			catch(Exception E)
//			{
//				System.out.println("Invalid Inputs");
//				tinp.testData();
//				
//			}
//			
			
	}
	
	
}
	
	
	
	
	
	


