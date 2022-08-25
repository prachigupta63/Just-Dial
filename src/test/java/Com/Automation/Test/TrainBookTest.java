package Com.Automation.Test;

import org.testng.annotations.Test;

import Com.Automation.GenericUtils.DriverUtils;
import Com.Automation.GenericUtils.PropertyReader;
import Com.Automation.Pages.TrainBookPage;
import Com.Automation.Pages.TrainPage;

public class TrainBookTest extends BaseTest {
	
	@Test
	
	public void TicketBook() throws InterruptedException
	{
		DriverUtils.getDriver().get("https://www.justdial.com/");
		Thread.sleep(3000);
		TrainPage tp= new TrainPage();
		tp.BookTrain();
		tp.departure(PropertyReader.getProperty("From"));
		tp.dest(PropertyReader.getProperty("To"));
		tp.depart();
		tp.date();
		tp.search();
	//	DriverUtils.getDriver().switchTo().frame(0);
		tp.irctc(PropertyReader.getProperty("IRCTC"));
		tp.irctcSubmit();
		
		TrainBookPage tbp = new TrainBookPage();
		tbp.trainClass();
		tbp.bookseat();
		tbp.confirmBook();
	}

}
