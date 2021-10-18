package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthPage extends BasicPage {

	public AuthPage(WebDriver driver, JavascriptExecutor js, WebDriverWait wait) {
		super(driver, js, wait);
		// TODO Auto-generated constructor stub
	}

	public WebElement getUser() {
		return driver.findElement(By.cssSelector(
				"#header > div.container > div > div.right-head > div.accounts-link.accounts-popup > ul > li > a"));
	}

	public void logOut() {
		this.getUser().click();
		driver.findElement(By.cssSelector(
				"#header > div.container > div > div.right-head > div.accounts-link.accounts-popup > ul > li > div > ul > li:nth-child(2) > a"))
				.click();
	}
}