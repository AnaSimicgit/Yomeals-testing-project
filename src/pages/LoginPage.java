package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasicPage{

	
	public LoginPage(WebDriver driver, JavascriptExecutor js, WebDriverWait wait) {
		super(driver, js, wait);
		// TODO Auto-generated constructor stub
	}


	public WebElement getUsername() {
		return driver.findElement(By.name("username"));
		
	}

	
	public WebElement getPassword() {
		return driver.findElement(By.name("password"));
	}
	
	public WebElement getLogin() {
		return driver.findElement(By.name("btn_submit"));
	}
	
	public void login(String username, String password) {
		this.getUsername().clear();
		this.getUsername().sendKeys(username);
		this.getPassword().clear();
		this.getPassword().sendKeys(password);
		this.getLogin().click();
	}
}
