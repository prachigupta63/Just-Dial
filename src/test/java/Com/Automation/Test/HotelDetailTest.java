package Com.Automation.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Com.Automation.GenericUtils.DriverUtils;
import Com.Automation.GenericUtils.PropertyReader;
import Com.Automation.Pages.BookHotelPage;
import Com.Automation.Pages.HotelDetailPage;

public class HotelDetailTest extends BaseTest {

	@Test
	
	public void bookSuccess() throws InterruptedException
	{
		   DriverUtils.getDriver().get("https://www.justdial.com/");
				DriverUtils.getDriver().manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
//			   RegistrationPage rg = new RegistrationPage();
	//   
//			   rg.signIn();
//			   DriverUtils.getDriver().switchTo().frame(0);
//			   rg.name(PropertyReader.getProperty("Name"));
//			   rg.mobileNo(PropertyReader.getProperty("Mobile"));
//			   rg.submit();
//			   Thread.sleep(50000);
//			   rg.otp();
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
		       bhp.hotelslist();
		
		       
		       HotelDetailPage hdp = new HotelDetailPage();
		       hdp.search();
	       	    hdp.hotelname(PropertyReader.getProperty("Hotel"));
	       	    hdp.searchicn();
	       	    Thread.sleep(5000);
	       	       
	       	       
	       		   
	   			WebElement hotname= DriverUtils.getDriver().findElement(By.xpath("/html/body/div[2]/div[1]/div/div[1]/div[2]/div/div/h1/span/span"));
	   			String name= hotname.getText();
	   		    System.out.println(name);
	   		    System.out.println("---------------------------");
	   		 
	   			WebElement hotaddress = DriverUtils.getDriver().findElement(By.xpath("//*[@id=\"fulladdress\"]/span/span"));
	   		    String address = hotaddress.getText();
	   		    System.out.println(address);
	   		    System.out.println("---------------------------");
//	   		    
//	   			WebElement hotcontact = DriverUtils.getDriver().findElement(By.xpath("//*[@id=\"fulladdress\"]/span/span"));
//	   		    String contact = hotcontact.getText();
//	   		    System.out.println(contact);
//	   		    System.out.println("---------------------------");
	}
}
