package Com.Automation.Test;

import org.testng.annotations.Test;

import Com.Automation.GenericUtils.DriverUtils;
import Com.Automation.GenericUtils.PropertyReader;
import Com.Automation.Pages.BookTicketPage;

public class BookTicketTest extends BaseTest {

	@Test

	public void  ticketBook() throws InterruptedException
	{
      DriverUtils.getDriver().get("https://www.justdial.com/");
      BookTicketPage btp = new BookTicketPage();
    		  btp.ticket();
    		 // btp.departure(PropertyReader.getProperty("Departure"));
    		//  btp.destination(PropertyReader.getProperty("Destination"));
    		  
    		  Thread.sleep(10000);
    		  btp.chooseDate();
    		  btp.date();
	}
}
