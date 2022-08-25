package Com.Automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookTicketPage extends BasePage{

	@FindBy(xpath="(//a[text()=\"Flights\"])[1]")
	private WebElement flight;
	
	@FindBy(xpath="//*[@id=\"__next\"]/div/main/div[2]/main/div/div/div[2]/div[1]/div[2]/input")
	private WebElement city1;
	
	
	@FindBy(xpath="//*[@id=\"__next\"]/div/main/div[2]/main/div/div/div[2]/div[2]/div[2]/input")
	private WebElement city2;
	
	
	@FindBy(xpath="//*[@id=\"__next\"]/div/main/div[2]/main/div/div/div[3]/div[1]/div/div[2]/input")
	private WebElement date;
	
	@FindBy(id="fourth_2022-08-25")
	private WebElement date29;
	
	public void ticket()
	{
		flight.click();
	}
	
	public void departure(String str)
	{
		city1.sendKeys(str);
	}
	
	public void destination(String str)
	{
		city2.sendKeys(str);
	}
	
	public void chooseDate()
	{
		date.click();
	}
	
	public void date()
	{
		date29.click();
	}
	
}
