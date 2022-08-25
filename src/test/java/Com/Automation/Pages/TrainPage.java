package Com.Automation.Pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TrainPage extends BasePage {
	
	@FindBy(xpath="//div[@class='wrapper tabs-details']")
	WebElement tap;
	
	@FindBy(xpath="")
	WebElement navbar;
	
	
	@FindBy(xpath="//a[text()='Train']")
	WebElement train;
	
	
	@FindBy(id="frm_stn")
	private WebElement from;
	
	@FindBy(id="to_stn")
	WebElement to;
	
	
	@FindBy(id="departDate")
	WebElement date;
	
	@FindBy(xpath="(//a[text()='29'])[1]")
	WebElement date25;
	
	@FindBy(xpath="//button[text()='Search']")
	WebElement search;
	
	@FindBy(id="irctcUserId")
	WebElement irctc;
	
	@FindBy(id="irctcwebProceed")
	WebElement irctcSubmit;
	
	public void BookTrain()
	{
		train.click();
	}
	
	public void departure(String str) throws InterruptedException
	{
		from.sendKeys(str);
		Thread.sleep(2000);
		tap.click();
	}
	
	public void dest(String str) throws InterruptedException
	{
		to.sendKeys(str);
		Thread.sleep(2000);
		tap.click();
		
	}
	
	public void depart()
	{
		date.click();
	}

	public void date()
	{
		date25.click();
	}
	
	public void search()
	{
		search.click();
	}
	
	public void irctc(String str)
	{
		irctc.clear();
		irctc.sendKeys(str);
	}
	
	public void irctcSubmit()
	{
		irctcSubmit.click();
	}
	
	
	public void testData() throws InterruptedException, IOException
	{
		Thread.sleep(3000);
		TakesScreenshot tsc = (TakesScreenshot)driver;
		File src = tsc.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Testing\\Screenshots\\Train.png");
		FileUtils.copyFile(src, dest);
	}
}
