package Com.Automation.StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Com.Automation.GenericUtils.DriverUtils;
import Com.Automation.GenericUtils.PropertyReader;
import Com.Automation.Pages.BookHotelPage;
import Com.Automation.Pages.HotelDetailPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookHotelSteps {

	BookHotelPage bhp = new BookHotelPage();
	HotelDetailPage hdp = new HotelDetailPage();
	
	@Given("Open Just Dial")
	public void open_just_dial() {
		DriverUtils.getDriver().get("https://www.justdial.com/");
	}

	@When("Search for hotel  Enter City")
	public void search_for_hotel_enter_city() throws InterruptedException {

		Thread.sleep(4000);
		bhp.bookTicket();
		bhp.hoteldestination();
	}

	@When("Choose CheckIn and CheckOut date")
	public void choose_check_in_and_check_out_date() {

		bhp.checkin();
		bhp.indate();
		bhp.checkout();
	}

	@When("Choose NoOfPerson")
	public void choose_no_of_person() {
		bhp.adults();
		bhp.search();
	}

	@Then("Hotel List Displayed")
	public void hotel_list_displayed() throws InterruptedException {

		Thread.sleep(3000);
		bhp.hotelslist();
	}

	@Given("Hotel List Displayig")
	public void hotel_list_displayig() {

	}

	@When("Enter Hotel Name {string}")
	public void enter_hotel_name(String string) throws InterruptedException {

		hdp.search();
		hdp.hotelname(string);
		hdp.searchicn();
		Thread.sleep(5000);
	}

	@Then("Details displayed")
	public void details_displayed() {
		WebElement hotname= DriverUtils.getDriver().findElement(By.xpath("/html/body/div[2]/div[1]/div/div[1]/div[2]/div/div/h1/span/span"));
			String name= hotname.getText();
		    System.out.println(name);
		    System.out.println("---------------------------");
		 
			WebElement hotaddress = DriverUtils.getDriver().findElement(By.xpath("//*[@id=\"fulladdress\"]/span/span"));
		    String address = hotaddress.getText();
		    System.out.println(address);
		    System.out.println("---------------------------");
	}






}
