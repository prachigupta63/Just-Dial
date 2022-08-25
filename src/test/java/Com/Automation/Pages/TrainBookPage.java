package Com.Automation.Pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TrainBookPage extends BasePage{

	@FindBy(xpath="//li[@id=\"20802_1A\"]/..//a[text()='1AC']")
	private WebElement seatClass;
	
	@FindBy(xpath="//*[@id=\"faredate_xs\"]/span[1]/span[2]/button")
	WebElement booknow;
	
	@FindBy(xpath="//button[text()='Yes']")
	WebElement confirm;
	
	
	
	public void trainClass()
	{
		seatClass.click();
	}
	
	public void bookseat()
	{
		booknow.click();
	}
	
	public void confirmBook()
	{
		confirm.click();
	}

}
