package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasicPage {

	protected WebDriver driver;

	protected JavascriptExecutor js = (JavascriptExecutor) driver;
	protected WebDriverWait wait;
	
	public BasicPage(WebDriver driver, JavascriptExecutor js, WebDriverWait wait) {
		super();
		this.driver = driver;
		this.js = js;
		this.wait = wait;
	}
	
		
	}

	
	


