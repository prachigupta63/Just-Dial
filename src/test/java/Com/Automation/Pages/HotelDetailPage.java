package Com.Automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelDetailPage extends BasePage {
	
     	@FindBy(xpath="//input[@id='srchbx']")
         private WebElement searchBox;;
         
     
         @FindBy(xpath="//span[@id='srIcon']")
         private WebElement searchicon;
         
         public void search()
         {
        	 searchBox.click();
        	 searchBox.clear();
         }
         
         public void hotelname(String str)
         {
        	 searchBox.sendKeys(str);
         }
         
         public void searchicn()
         {
        	 searchicon.click();
         }

}
