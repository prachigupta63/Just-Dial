package Com.Automation.Test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import Com.Automation.GenericUtils.DriverUtils;
import Com.Automation.GenericUtils.PropertyReader;
import Com.Automation.Pages.RegistrationPage;
import Com.Automation.Pages.TrainBookPage;
import Com.Automation.Pages.TrainInfoPage;
import Com.Automation.Pages.TrainPage;

public class TrainInfoTest extends BaseTest{
	
	@Test(priority=1)
	
	public void bookSuccessful() throws InterruptedException
	{
		    DriverUtils.getDriver().get("https://www.justdial.com/");
		    ChromeOptions option = new ChromeOptions();
			option.addArguments("start-maximized");
			option.addArguments("--disable-blink-features=AutomationControlled");
			option.addArguments("--disable-notifications");
			DriverUtils.getDriver().manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		    String UrlActual = "Justdial - Local Search, Social, News, Videos, Shopping";
		    String UrlEXpect = DriverUtils.getDriver().getTitle();
		    Assert.assertEquals(UrlActual, UrlEXpect);
			
//		    RegistrationPage rg = new RegistrationPage();
//		    rg.signIn();
//		    rg.name(PropertyReader.getProperty("Name"));
//		    rg.mobileNo(PropertyReader.getProperty("Mobile"));
//		    rg.submit();
//		    Thread.sleep(50000);
//		   
		   
		    TrainPage tp= new TrainPage();
			tp.BookTrain();
			tp.departure(PropertyReader.getProperty("From"));
			tp.dest(PropertyReader.getProperty("To"));
			tp.depart();
			tp.date();
			tp.search();
			tp.irctc(PropertyReader.getProperty("IRCTC"));
			tp.irctcSubmit();
			
			
			TrainBookPage tbp = new TrainBookPage();
			tbp.trainClass();
			Thread.sleep(2000);
			tbp.bookseat();
			tbp.confirmBook();
			
		 	
	        TrainInfoPage tip = new TrainInfoPage();
			tip.user(PropertyReader.getProperty("Name"));
			tip.mobile(PropertyReader.getProperty("Mobile"));
			tip.SenOtp();
			Thread.sleep(50000);
			
			tip.id(PropertyReader.getProperty("IRCTC"));
			tip.proceed();
			Thread.sleep(3000);
			WebElement dropdown =  DriverUtils.getDriver().findElement(By.xpath("(//select[@id=\"seladult\"])[2]"));
			Select sel = new Select(dropdown);
			sel.selectByValue("1");
			
		
			tip.ContPassenger();
			Thread.sleep(3000);
			tip.nameTitle();
			tip.mr();
			tip.detailFName(PropertyReader.getProperty("FName"));
			tip.detailLName(PropertyReader.getProperty("LName"));
			tip.detailAge(PropertyReader.getProperty("Age"));
			tip.insurance();
			tip.email(PropertyReader.getProperty("Email"));
	
			
			
			
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
	
	
	
	
	
	


