package Com.Automation.Test;

import org.testng.annotations.Test;
import Com.Automation.GenericUtils.DriverUtils;
import Com.Automation.GenericUtils.PropertyReader;
import Com.Automation.Pages.DocAppointmentPage;

public class DocAppointmentTest extends BaseTest{

	@Test
	
	public void AppointSuccess() throws InterruptedException
	{
		DriverUtils.getDriver().get("https://www.justdial.com/");
		DocAppointmentPage da = new DocAppointmentPage();
		da.moreItem();
		Thread.sleep(3000);
		da.doc();
		da.book();
		da.date();
		da.time();
		da.name(PropertyReader.getProperty("Patient"));
		da.mob1(PropertyReader.getProperty("PatNumber"));
		da.mob2(PropertyReader.getProperty("AltNum"));
		da.nature();
	}
	
	
}
