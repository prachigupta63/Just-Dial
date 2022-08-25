package Com.Automation.StepDef;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Com.Automation.GenericUtils.DriverUtils;
import Com.Automation.Pages.RegistrationPage;
import Com.Automation.Pages.TrainBookPage;
import Com.Automation.Pages.TrainInfoPage;
import Com.Automation.Pages.TrainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TrainInfoSteps {

      RegistrationPage rps = new RegistrationPage();
      TrainPage tps = new TrainPage();
      TrainInfoPage tips = new TrainInfoPage();
      TrainBookPage tbps = new TrainBookPage();
	
      @Given("Open the Browser")
  	public void open_the_browser() {
  		DriverUtils.getDriver().get("https://www.justdial.com/");    
  	}

  	@When("Enter Name {string} and PhoneNo {string}")
  	public void enter_name_and_phone_no(String string, String string2) {
//  		rps.signIn();
//  		rps.name(string);
//  		rps.mobileNo(string2);
//  		rps.submit();
//  		rps.otp();
  	}

  	@Then("Execute Success")
  	public void execute_success() {
  	 System.out.println(DriverUtils.getDriver().getTitle());
  	}

  	@Given("Click on Train")
  	public void click_on_train() {
  	  tps.BookTrain();
  	 
  	}

  	@When("Enter Departure {string} Destination Cities {string}")
  	public void enter_departure_destination_cities(String string, String string2) throws InterruptedException {
  		 tps.departure(string);
  		 tps.dest(string2);
  		 tps.depart();
  		 
  	}

  	@When("choose date and search")
  	public void choose_date_and_search() {
  		 tps.date();
  		 tps.search();
  		
  	}

  	@Then("Train List Displayed")
  	public void train_list_displayed() {
  	   System.out.println("Choose Any Train");
  	}
  	
  	
  	@Given("Enter IRCTC ID {string} and Choose Any Train")
  	public void enter_irctc_id_and_choose_any_train(String string) {
  		 tps.irctc(string);
  		 tps.irctcSubmit();
  	}

  	@When("Choose any Class")
  	public void choose_any_class() throws InterruptedException {
  		tbps.trainClass();
  		Thread.sleep(2000);
  		
  	}

  	@When("Click on Book Now")
  	public void click_on_book_now() {
  		tbps.bookseat();
  		tbps.confirmBook();
  		
  	}

  	@Then("Execution Success")
  	public void execution_success() {
      System.out.println("Fill Details");
  	}
  	
  	
  	@Given("Enter name {string}  Number {string} Click on SendOTP")
  	public void enter_name_number_click_on_send_otp(String string, String string2) throws InterruptedException {
  		tips.user(string);
		tips.mobile(string2);
		tips.SenOtp();
		Thread.sleep(50000);
  	}

  	@When("Enter IRCTC ID {string} Click Process")
  	public void enter_irctc_id_click_proceed(String string) throws InterruptedException {
  		
		tips.id(string);
		tips.proceed();
		Thread.sleep(3000);
		WebElement dropdown =  DriverUtils.getDriver().findElement(By.xpath("(//select[@id=\"seladult\"])[2]"));
		Select sel = new Select(dropdown);
		sel.selectByValue("1");
  	}

  	@When("Enter Passenger Details count")
  	public void enter_passenger_details_count() throws InterruptedException {
  		tips.ContPassenger();
		Thread.sleep(3000);
		
  	}

  	@When("title")
  	public void title() {
  		tips.nameTitle();
		tips.mr();
  	}

  	@When("FirstName {string}")
  	public void first_name(String string) {
  	   tips.detailFName(string);
  	}

  	@When("LastName {string}")
  	public void last_name(String string) {
  	    tips.detailLName(string);
  	}

  	@When("Age {string}")
  	public void age(String string) {
  	   tips.detailAge(string);
  	}

  	@When("Email {string}")
  	public void email(String string) {
  		tips.insurance();
  	  tips.email(string);
  	}

  	@When("Click Submit")
  	public void click_submit() {
  	  
  	}

  	@Then("Payment Option Displayed")
  	public void payment_option_displayed() {
  		
		WebElement tktfare= DriverUtils.getDriver().findElement(By.xpath("//*[@id=\"BOOKSUM\"]/div/div/div[3]/div[2]/div/ul/li[1]/label"));
		String tkt1= tktfare.getText();
		WebElement amount1 = DriverUtils.getDriver().findElement(By.xpath("//*[@id=\"BOOKSUM\"]/div/div/div[3]/div[2]/div/ul/li[1]/span"));
	    String amounttkt = amount1.getText();
	    System.out.println("---------------------------");
	    System.out.println(tkt1+ ":" + amounttkt);
	   
	   
	   
		WebElement insure= DriverUtils.getDriver().findElement(By.xpath("//*[@id=\"BOOKSUM\"]/div/div/div[3]/div[2]/div/ul/li[2]/label"));
		String tkt2= insure.getText();
		WebElement amount2 = DriverUtils.getDriver().findElement(By.xpath("//*[@id=\"BOOKSUM\"]/div/div/div[3]/div[2]/div/ul/li[2]/span"));
	    String amountinsure = amount2.getText();
	    System.out.println("---------------------------");
	    System.out.println(tkt2+ ":" + amountinsure);
	   
	   
	   
		WebElement convi= DriverUtils.getDriver().findElement(By.xpath("//*[@id=\"BOOKSUM\"]/div/div/div[3]/div[2]/div/ul/li[3]/label"));
		String tkt3= convi.getText();
		WebElement amount3 = DriverUtils.getDriver().findElement(By.xpath("//*[@id=\"BOOKSUM\"]/div/div/div[3]/div[2]/div/ul/li[3]/span"));
	    String  amountconvi= amount3.getText();
	    System.out.println("---------------------------");
	    System.out.println(tkt3+ ":" + amountconvi);
	   
	   
	   
	   
		WebElement service= DriverUtils.getDriver().findElement(By.xpath("//*[@id=\"BOOKSUM\"]/div/div/div[3]/div[2]/div/ul/li[4]/label"));
		String tkt4= service.getText();
		WebElement amount4 = DriverUtils.getDriver().findElement(By.xpath("//*[@id=\"BOOKSUM\"]/div/div/div[3]/div[2]/div/ul/li[4]/span"));
	    String amountservice = amount4.getText();
	    System.out.println("---------------------------");
	    System.out.println(tkt4+ ":" + amountservice);
	   
	   
	   
		WebElement pg= DriverUtils.getDriver().findElement(By.xpath("//*[@id=\"BOOKSUM\"]/div/div/div[3]/div[2]/div/ul/li[5]/label"));
		String tkt5= pg.getText();
		WebElement amount5 = DriverUtils.getDriver().findElement(By.xpath("//*[@id=\"BOOKSUM\"]/div/div/div[3]/div[2]/div/ul/li[5]/span"));
	    String amountpg = amount5.getText();
	    System.out.println("---------------------------");
	    System.out.println(tkt5+ ":" + amountpg);
	   
	   
	   
		WebElement totfare= DriverUtils.getDriver().findElement(By.xpath("//*[@id=\"BOOKSUM\"]/div/div/div[3]/div[2]/div/ul/li[6]/label"));
		String tkt6= totfare.getText();
		WebElement amount6 = DriverUtils.getDriver().findElement(By.xpath("//*[@id=\"BOOKSUM\"]/div/div/div[3]/div[2]/div/ul/li[6]/span"));
	    String amounttot = amount6.getText();
	    System.out.println("---------------------------");
	    System.out.println("---------------------------");
	    System.out.println(tkt6+ ":" + amounttot);
	
  	}
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	

		
		
	
}
