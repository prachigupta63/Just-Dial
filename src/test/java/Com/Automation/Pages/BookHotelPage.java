package Com.Automation.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class BookHotelPage extends BasePage{
	
//Initialization
//	@FindBy(id = "navIc")
//	private WebElement navId;
//
	
	@FindBy(xpath="//a[@title=\"Book Online Hotels\"]")
	private WebElement hotel;
	
	@FindBy(xpath="//input[@class='form-control autocomp_pop ui-autocomplete-input']") 
	WebElement hoteldestination;
	
	@FindBy(xpath="//li[text()='Hotels (Rs 501 To Rs 1000) in Agra']") 
	WebElement selectCity;
	
	@FindBy(id="checkInDt")
	private WebElement inDate;
	
	@FindBy(xpath="//a[text()='29']")
	private WebElement date29;
	
	@FindBy(id="checkOutDt")
	private WebElement outdate;
	
	@FindBy(xpath="//a[text()='31']")
	private WebElement date31;
	
	@FindBy(xpath="//*[@id=\"dAdultsCountSelector_Htl1\"]/span[2]")
	private WebElement adults1;
	
	@FindBy(xpath="//input[@id='hsearch']")
	private WebElement search;

//	//Utilization
//	
//	public void navBar()
//	{
//		navId.click();
//	}
	
	public void bookTicket()
	{
		hotel.click();
	}
	

	public void hoteldestination() {
		hoteldestination.sendKeys("Agra");
		
		Actions act = new Actions(driver);
		WebElement basket = driver.findElement(By.xpath("//input[@class='form-control autocomp_pop ui-autocomplete-input']"));
	    act.moveToElement(basket).perform();
	    driver.findElement(By.xpath("//li[text()='Hotels (Rs 501 To Rs 1000) in Agra']")).click();
	}
	
	public void hotel()
	{
		selectCity.click();
	}
	
	public void checkin()
	{
		inDate.click();
	}
	
	public void indate()
	{
		date29.click();
	}
	
	public void checkout()
	{
		outdate.click();
	}
	public void outdate()
	{
		date31.click();
	}

	public void adults()
	{
		adults1.click();
	}
	
	public void search()
	{
		search.click();
	}
	
	public void hotelslist() throws InterruptedException
	{
		List <WebElement> el = driver.findElements(By.xpath("//span[contains(text(),'Hotel')]"));
		int count = el.size();
		System.out.println(count);

			    for(int i=0; i<5; i++)
			    {
			    	Thread.sleep(3000);
			    	WebElement el1 = el.get(i);
			    	Thread.sleep(2000);
			    	System.out.println(el1.getText());
			    }

	}
	
}
