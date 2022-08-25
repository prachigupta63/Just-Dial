package Com.Automation.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Com.Automation.GenericUtils.DriverUtils;
import Com.Automation.GenericUtils.PropertyReader;
import Com.Automation.Pages.TrainBookPage;
import Com.Automation.Pages.TrainInfoPage;
import Com.Automation.Pages.TrainPage;

public class TrainInfo3Test {

	@DataProvider(name = "test-data")
  	public Object[][] RegisterData(){
		    	return new Object[][]{
                    {"Agra Fort (AF)", "Kanpur Central (CNB)","shubhamlogani1710" ,"Prachi Gupta" , "9639025834"}, {"Agra Fort (AF)", "Kanpur Central (CNB)" , "shubhamlogani1710" ,"2933@", "9639025834"}};
  	}
	
	
	@Test(dataProvider="test-data")
	public void bookTkt(String t1, String t2, String t3, String t4, String t5) throws InterruptedException, IOException
	{
		  DriverUtils.getDriver().get("https://www.justdial.com/");
		    ChromeOptions option = new ChromeOptions();
			option.addArguments("start-maximized");
			option.addArguments("--disable-blink-features=AutomationControlled");
			option.addArguments("--disable-notifications");
			DriverUtils.getDriver().manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		    String UrlActual = "Justdial - Local Search, Social, News, Videos, Shopping";
		    String UrlEXpect = DriverUtils.getDriver().getTitle();
		    Assert.assertEquals(UrlActual, UrlEXpect);
			
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
			tp.search();
			tp.irctc(t3);
			tp.irctcSubmit();
			
			
			TrainBookPage tbp = new TrainBookPage();
			tbp.trainClass();
			tbp.bookseat();
			tbp.confirmBook();
			
		 	
	        TrainInfoPage tip = new TrainInfoPage();
			tip.user(t4);
			tip.mobile(t5);
			tip.SenOtp();
			tip.testname();
	}
}
