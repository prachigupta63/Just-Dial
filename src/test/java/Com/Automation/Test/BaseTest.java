package Com.Automation.Test;

import org.testng.annotations.BeforeMethod;
import Com.Automation.GenericUtils.DriverUtils;
import Com.Automation.GenericUtils.PropertyReader;

public class BaseTest {
	@BeforeMethod
	public void Precondition()
	{
		{
			DriverUtils.createDriver();
			PropertyReader.initproperty();
		}
		
	}

}
