package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchpage {

WebDriver driver;
	
	public Searchpage(WebDriver driverl) {
		driver=driverl;
		PageFactory.initElements(driverl, this);
	}
	
	@FindBy(xpath="//input[@class='_2FkHZ']")
	WebElement searchitem;
	
	@FindBy(xpath="//div[@class='_2f0cx']")
	WebElement clickitem;
	
	@FindBy(xpath="//div[@class='_1RPOp']")
	WebElement additem;
	
	
	public void enterSearchItem(String item) {
		searchitem.click();
		searchitem.sendKeys(item);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	public void clickSearchItem(){
		clickitem.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	public void addItem(){
		additem.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
