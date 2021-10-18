package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProfileTest extends BasicTest{

	
		

//	@Test
//	public void editProfile() {
//		driver.get(baseUrl + "/guest-user/login-form");
//		locationPopupPage.closingDialog();
//		loginPage.login(username, password);
//		Assert.assertEquals(notificationSistemPage.getMessageText(), "Login Successfull", "Error: Login");
//		driver.get(baseUrl + "/member/profile");
//		profilePage.changeInfo("Marko", "Markovic", "Bulevar", "061111111", "11000", "India", "Goa", "Arpora");
//		Assert.assertEquals(notificationSistemPage.getMessageText(), "Setup Successful", "Error: Setup");
//		authPage.logOut();
//		Assert.assertEquals(notificationSistemPage.getMessageText(), "Logout Successfull!", "Error: Logout");
//		
//	}
	
	@Test
	
	public void changeProfileImage() throws IOException, InterruptedException {
		driver.get(baseUrl + "guest-user/login-form");
		locationPopupPage.closingDialog();
		loginPage.login(username, password);
		Assert.assertEquals(notificationSistemPage.getMessageText(), "Login Successfull", "Error: Login");
		driver.get(baseUrl + "member/profile");
		profilePage.uploadPhoto();
		
	}
		
	
		
		
	
		
	}
	


