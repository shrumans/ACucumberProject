package stepDefinition;

import java.lang.reflect.Method;
import java.net.URL;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pageObjects.AddToCartPage;
import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.Searchpage;


public class Steps{
	
	public Searchpage sp;
	public Homepage hp;
	public AddToCartPage ap;
	public Loginpage lp;
	
	WebDriver driver = null;
	
	//@Before
	//public void setup() {

	
//		DesiredCapabilities caps = new DesiredCapabilities();
//		//caps.setCapability("zal:name", m.getName());
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("disable-infobars"); 
//		options.addArguments("--disable-extensions"); 
//		options.addArguments("--disable-gpu"); 
//		options.addArguments("--disable-dev-shm-usage"); 
//		options.addArguments("--no-sandbox"); 
//		options.addArguments("window-size=1440,900");
//
//		caps.setCapability(ChromeOptions.CAPABILITY, options);
//		try {
//			driver = new RemoteWebDriver(new URL("http://54.152.83.213:4444/wd/hub"), caps);
//			driver.manage().window().maximize();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	
//		lp=new Loginpage(driver);
//	    hp=new Homepage(driver);
//	    sp=new Searchpage(driver);
//	    ap=new AddToCartPage(driver);
//	
//		}
	
	// prerequisite to run on local
	@Before
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\driver\\\\chromedriver.exe");
		driver=new ChromeDriver();
        driver.manage().window().maximize();
		lp=new Loginpage(driver);
    	hp=new Homepage(driver);
		sp=new Searchpage(driver);
		ap=new AddToCartPage(driver);
	}
	
	
	@After
	public void closebrowser() {
		driver.quit();
	}
	
	@Given("User enters swiggy url {string}")
	public void swiggyurl(String url) {
		driver.get(url);
	}
	
	@When("Enter location as {string}")
    public void entercity(String city) {
		lp.enterlocation(city);	
	}
	
	@And("select first location from suggested location in suggestion-box")
	public void selectthecity() {
		lp.selectcity();
	}
	
	@And("click on search icon")
	public void clicksearchicon() {
		
		hp.clickSearchIcon();
	}
	
	@And("Enter item as {string}")
	public void enterpizza(String item1) {
		
	    sp.enterSearchItem(item1);
	}
	
	@And("click on first suggested pizza")
	public void selectpizza() {
		sp.clickSearchItem();
	}
	
	@And("Add first item to cart")
	public void addtocart() {
		sp.addItem();
		ap.clickContinue();
		ap.clickAddItem();
	}
	
	@Then("click on viewCart")
	public void viewcart() {
		hp.clickViewCart();
	}
	
}
