package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {

WebDriver driver;
	
	public AddToCartPage(WebDriver driverl) {
		driver=driverl;
		PageFactory.initElements(driverl, this);
	}
	
	@FindBy(xpath="//div[@class='uJZex']")
	WebElement textcontinue;
	
	@FindBy(xpath="//div[@class='_3coNr']")
	WebElement textadditem;
 
	
	public void clickContinue() {
		textcontinue.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickAddItem() {
		textadditem.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
