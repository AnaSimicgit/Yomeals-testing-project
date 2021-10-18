package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.AuthPage;
import pages.BasicPage;
import pages.CartSummaryPage;
import pages.LocationPopupPage;
import pages.LoginPage;
import pages.MealPage;
import pages.NotificationSistemPage;
import pages.ProfilePage;


public abstract class BasicTest {
	
	protected WebDriver driver;
	protected WebDriverWait wait;
	protected String baseUrl = "http://demo.yo-meals.com/";
	protected String username = "customer@dummyid.com";
	protected String password = "12345678a";
	
	protected ProfilePage profilePage;
	protected CartSummaryPage cartSummaryPage;
	protected NotificationSistemPage notificationSistemPage;
	protected MealPage mealPage;
	protected AuthPage authPage;
	protected LoginPage loginPage;
	protected LocationPopupPage locationPopupPage;
	
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get(baseUrl);
		wait = new WebDriverWait(driver, 10);
		profilePage = new ProfilePage(driver, null, wait);
		cartSummaryPage = new CartSummaryPage(driver, null, wait);
		notificationSistemPage = new NotificationSistemPage(driver, null, wait);
		mealPage = new MealPage(driver, null, wait);
		authPage = new AuthPage(driver, null, wait);
		loginPage = new LoginPage(driver, null, wait);
		locationPopupPage = new LocationPopupPage(driver, null, wait);
		
		
		
		
		
		
		
		
		
		
	

}
	@AfterMethod
	public void afterMethod() {
		
	}
	}
	
	
	
