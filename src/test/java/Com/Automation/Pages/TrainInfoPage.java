package Com.Automation.Pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import Com.Automation.GenericUtils.DriverUtils;

public class TrainInfoPage extends BasePage {

	@FindBy(id="tLUsrname")
	WebElement user;
	

	@FindBy(id="tLMob")
	WebElement mob;


	@FindBy(xpath="//button[@id='loginjdId']")
	WebElement otp;
	

	@FindBy(id="irctcUserId")
	WebElement idIrctc;


	@FindBy(id="irctcProceed")
	WebElement proceed;

	
	@FindBy(xpath="(//select[@id=\"seladult\"])[2]")
	WebElement selectAdult;


	@FindBy(id="continuePsng")
	WebElement cont;

	
	@FindBy(xpath="//*[@id=\"adult_passen_1\"]/li[2]/span/select")
	WebElement title;

	
	@FindBy(xpath="//*[@id=\"adult_passen_1\"]/li[2]/span/select/option[2]")
	WebElement mr;

	
	@FindBy(xpath="//input[@class='form-control input-box p_fname errmsgs errFName-1']")
	WebElement FName;

	
	@FindBy(xpath="//input[@class='form-control input-box p_lname errmsgs errLName-1']")
	WebElement LName;

	
	@FindBy(xpath="//input[@class='form-control errmsgs adldob input-box errDob-1 p_age']")
	WebElement age;

	
	@FindBy(xpath="(//select[@class=\"native-select wrapper p_sel_bp\"])[1]")
	WebElement pref;
	
	
	@FindBy(xpath="//*[@id=\"pass_detail2\"]/div/div[3]/ul/li[2]/label/span/span[1]")
	WebElement insurance;

	
	@FindBy(id="emailIdVal")
	WebElement mail;

	
	@FindBy(id="submitPsngDet")
	WebElement Sbmt;

	
	public void user(String str)
	{
		user.sendKeys(str);
	}

	public void mobile(String str)
	{
		mob.sendKeys(str);
	}

	public void SenOtp()
	{
		otp.click();
	}

	public void id(String str)
	{
		idIrctc.clear();
		idIrctc.sendKeys(str);
	}

	public void proceed()
	{
		proceed.click();
	}

	public void ContPassenger()
	{
		cont.click();
	}

	public void nameTitle()
	{
		title.click();
	}


	public void mr()
	{
		mr.click();
	}

	public void detailFName(String str)
	{
		FName.sendKeys(str);
	}

	public void detailLName(String str)
	{
		LName.sendKeys(str);
	}

	public void detailAge(String str)
	{
		age.sendKeys(str);
	}

	public void insurance()
	{
		insurance.click();
	}

	public void email(String str)
	{
		mail.sendKeys(str);
		Sbmt.click();
	}
	

	public  void testname() throws InterruptedException, IOException
	{
		Thread.sleep(3000);
		TakesScreenshot tsc = (TakesScreenshot)driver;
		File src = tsc.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Testing\\Screenshots\\Name.png");
		FileUtils.copyFile(src, dest);
	}

}
