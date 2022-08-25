package Com.Automation.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DocAppointmentPage extends BasePage {

	@FindBy(xpath="(//a[text()='more..'])[2]")
	private WebElement more;
	
	
	@FindBy(xpath="(//span[text()=\"General Physicians\"])[1]")
	private WebElement Doctor;
	
	@FindBy(xpath="(//a[@class=\"bookap green-btn result_loader_2 big_dn\"])[1]")
	private WebElement bookAppoint;
	
	@FindBy(xpath="//span[text()='25']")
	private WebElement date;
	
	@FindBy(xpath="/html/body/div[1]/section/section[1]/section[3]/section/ul/li[17]/a")
	private WebElement time;
	
	@FindBy(id="patnm")
	private WebElement name;
	
	@FindBy(id="patmob")
	private WebElement Pmob;
	
	@FindBy(id="altmob")
	private WebElement altmob;
	
	@FindBy(xpath="//input[@value='First time visit']")
	private WebElement nature;
	
	public void moreItem()
	{
		more.click();
	}

	public void doc()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String down = "window.scrollBy(0,1000)";
		js.executeScript(down);
		Doctor.click();
	}
	
	public void book()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String down = "window.scrollBy(0,1000)";
		js.executeScript(down);
		bookAppoint.click();
	}
	
	public void date()
	{
		date.click();
	}
	
	public void time()
	{
		time.click();
	}
	
	public void name(String str)
	{
		name.sendKeys(str);
	}
	
	public void mob1(String str)
	{
		Pmob.sendKeys(str);
	}
	
	public void mob2(String str)
	{
		altmob.sendKeys(str);
	}
	
	public void nature()
	{
		nature.click();
	}
}
