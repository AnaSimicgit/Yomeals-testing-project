package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NotificationSistemPage extends BasicPage {

	public NotificationSistemPage(WebDriver driver, JavascriptExecutor js, WebDriverWait wait) {
		super(driver, js, wait);
		// TODO Auto-generated constructor stub
	}

	public WebElement getMessageElement() {
		WebElement firstMessage = null;
		WebElement secondMessage = null;

		boolean messageExist = true;
		try {
			firstMessage = driver.findElement(By.xpath("//*[contains(@class, 'alert--success')]"));

		}

		catch (Exception e) {
			secondMessage = driver
					.findElement(By.xpath("//*[contains(@class, 'alert--danger')][contains(@style,'display: block')]"));
			messageExist = false;

		}
		if (messageExist) {
			return firstMessage;
		} else {
			return secondMessage;
		}
	}

	public String getMessageText() {
		return this.getMessageElement().getText();

	}

	public void getMessageDissapear() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class, 'system_message')][contains(@style, 'display: none')]")));

	}

}
