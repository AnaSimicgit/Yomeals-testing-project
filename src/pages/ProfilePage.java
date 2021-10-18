package pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage extends BasicPage{
	
	
	public ProfilePage(WebDriver driver, JavascriptExecutor js, WebDriverWait wait) {
		super(driver, js, wait);
		// TODO Auto-generated constructor stub
	}

	public WebElement getFirstName() {
		return driver.findElement(By.name("user_first_name"));
	}
	
	public WebElement getLastName() {
		return driver.findElement(By.name("user_last_name"));
	}
	
	public WebElement getEmail() {
		return driver.findElement(By.name("user_email"));
	}
	
	public WebElement getAddress() {
		return driver.findElement(By.name("user_address"));
		
	}
	
	public WebElement getPhone() {
		return driver.findElement(By.name("user_phone"));
	}
	
	public WebElement getZipCode() {
		return driver.findElement(By.name("user_zip"));
	}
	
	public WebElement getCountry() {
		return driver.findElement(By.name("user_country_id"));
	}
	
	public WebElement getState() {
		return driver.findElement(By.name("user_state_id"));
	}
	
	public WebElement getCity() {
		return driver.findElement(By.name("user_city"));
	}
	
	public WebElement getSaveButton() {
		return driver.findElement(By.name("btn_submit"));
	}
	
	
	public WebElement getUploadButton() {
		return driver.findElement(By.xpath("//*[@title = 'Uplaod']"));
	}
	
	public void uploadPhoto() throws InterruptedException, IOException {
		js.executeScript("arguments[0].click();", this.getUploadButton());
		Thread.sleep(3000);
		//File image = new File("img/cvece5.jpg");
		//String imagePath = image.getAbsolutePath();
		String imagePath = new File("img/cvece5.jpg").getCanonicalPath();
		
		driver.findElement(By.xpath("//*[@id='form-upload']/input")).sendKeys(imagePath);
	
}
	public void changeInfo(String name, String lastName, String address, String phone, String zipcode,
			
			                  String country, String state, String city) {
		
		this.getFirstName().clear();
		this.getFirstName().sendKeys(name);
		this.getLastName().clear();
		this.getLastName().sendKeys(lastName);
		this.getAddress().clear();
		this.getAddress().sendKeys(address);
		this.getPhone().clear();
		this.getPhone().sendKeys(phone);
		this.getZipCode().clear();
		this.getZipCode().sendKeys(zipcode);
		Select selectCountry = new Select(this.getCountry());
		selectCountry.selectByVisibleText(country);
		Select selectState = new Select(this.getState());
		selectState.selectByVisibleText(state);
		Select selectCity = new Select(this.getCity());
		selectCity.selectByVisibleText(city);
		
		driver.findElement(By.cssSelector("#profileInfoFrm > div:nth-child(5) > div > fieldset > input")).click();
	}
	
	
//	public void removePhoto() {
//		WebElement remove = driver.findElement(arg0)
//				js.executeScript("arguments[0].click();", remove);		
		
	}
