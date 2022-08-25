package Com.Automation.Test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Com.Automation.GenericUtils.DriverUtils;
import Com.Automation.GenericUtils.PropertyReader;
import Com.Automation.Pages.BookHotelPage;

public class BookHotelTest extends BaseTest{

	  @Test
	   
	   public void hotelSuccessful() throws InterruptedException
	   {
		   DriverUtils.getDriver().get("https://www.justdial.com/");
			DriverUtils.getDriver().manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
//		   RegistrationPage rg = new RegistrationPage();
//   
//		   rg.signIn();
//		   DriverUtils.getDriver().switchTo().frame(0);
//		   rg.name(PropertyReader.getProperty("Name"));
//		   rg.mobileNo(PropertyReader.getProperty("Mobile"));
//		   rg.submit();
//		   Thread.sleep(50000);
//		   rg.otp();
		   BookHotelPage bhp = new BookHotelPage();
		 //  bt.navBar();
		   Thread.sleep(4000);
		   bhp.bookTicket();
		   bhp.hoteldestination();
		   bhp.checkin();
		   bhp.indate();
		   bhp.checkout();
			   bhp.adults();
			   bhp.search();
			   Thread.sleep(3000);
			   
			  // DriverUtils.getDriver().quit();
		   
	   }
}
