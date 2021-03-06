package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MealPage extends BasicPage {

	public MealPage(WebDriver driver, JavascriptExecutor js, WebDriverWait wait) {
		super(driver, js, wait);
		// TODO Auto-generated constructor stub
	}

	public WebElement getFavorite() {
		return driver.findElement(By.className("favourite"));
	}

	public WebElement getQuantity() {

		return driver.findElement(By.name("product_qty"));

	}

	public void addToCart(String quantity) {
		
		this.getQuantity().sendKeys(Keys.CONTROL + "a", Keys.DELETE);
		this.getQuantity().sendKeys(quantity);
		driver.findElement(By.xpath("//*[@id='body']/section[1]/div/div/div[2]/div/div[3]/div[2]/a")).click();
	}

	public void addToFavorite() {
		this.getFavorite().click();
	}
}
