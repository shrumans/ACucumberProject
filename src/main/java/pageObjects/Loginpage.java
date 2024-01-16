package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

WebDriver driver;
	
	public Loginpage(WebDriver driverl) {
		driver=driverl;
		PageFactory.initElements(driverl, this);
	}
	
	@FindBy (xpath="//input[@class='_381fS _1oTLG _3BIgv']")
	WebElement searchcity;
	
	@FindBy (xpath="//span[@class='icon-location _1HNsg']")
	WebElement clickFirstCity;
	
	public void enterlocation(String city) {
		searchcity.sendKeys(city);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void selectcity() {
		clickFirstCity.click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
}
