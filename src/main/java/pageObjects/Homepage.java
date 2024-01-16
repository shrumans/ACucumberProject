package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

WebDriver driver;
	
	public Homepage(WebDriver driverl) {
		driver=driverl;
		PageFactory.initElements(driverl, this);
	}
	
	//search icon locator
	@FindBy(xpath="//a[@href='/search' and @class='_1T-E4']")
	WebElement searchicon;
	//view cart locator
	@FindBy(xpath="//a[@href='/checkout' and @class='_1T-E4']")
	WebElement cart;
	
	public void clickSearchIcon() {
		searchicon.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	public void clickViewCart() {
		cart.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
