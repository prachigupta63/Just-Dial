package Com.Automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

	// Initialization

	@FindBy(xpath="//span[@id='h_login']") 
	WebElement loginclick;
	
	@FindBy(xpath="//input[@name='name']") 
	WebElement name;
	
	@FindBy(xpath="//input[@name='em']") 
	WebElement number;
	
	@FindBy(xpath="//button[@id='lgn_smtn']") 
	WebElement sendotp;
	
	@FindBy(xpath="//button[@id='otp_submit']") 
	WebElement submitotp;

	// Utilization
	public void signIn() {
		loginclick.click();
	}

	public void name(String str) {
		name.sendKeys(str);
	}

	public void mobileNo(String str)
	{
		number.sendKeys(str);
	}

	public void submit()
	{
		sendotp.click();
	}
	
	public void otp()
	{
		submitotp.click();
	}
	
}
