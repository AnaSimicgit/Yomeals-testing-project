package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocationPopupPage extends BasicPage {

	public LocationPopupPage(WebDriver driver, JavascriptExecutor js, WebDriverWait wait) {
		super(driver, js, wait);
		// TODO Auto-generated constructor stub
	}

	// TODO Auto-generated constructor stub
	

	public WebElement getLocation() {
		return driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[1]/div/a"));

	}

	public WebElement getCloseButton() {
		return driver.findElement(By.cssSelector("#location-popup > div > div > div > div > a"));

	}

	public WebElement getKeyword() {
		return driver.findElement(By.xpath("//*[@id='locality_keyword']"));
	}

	public WebElement getLocationItem(String locationName) {
		return driver.findElement(By.xpath("//li/a[contains(text(), '" + locationName + "')]/.."));
	}

	public WebElement getLocationInput() {
		return driver.findElement(By.xpath("//*[@id='location_id']"));

	}

	public WebElement getSubmit() {
		return driver.findElement(By.xpath("//*[@name='btn_submit']"));

	}

	public void getPopUp() {
		this.getLocation().click();
	}

	public void setLocation(String locationName) {
		this.getLocation().click();
		this.getKeyword().click();
		String location = this.getLocationItem(locationName).getAttribute("data-value");
        this.getLocationItem(locationName).click();
		//js.executeScript("arguments[0].value=arguments[1];", this.getLocationInput(), location);
        this.getSubmit().click();
		//js.executeScript("arguments[0].click();", this.getSubmit());

	}

	public void closingDialog() {
		this.getCloseButton().click();
	}
}
