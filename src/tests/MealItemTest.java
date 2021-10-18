package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MealItemTest extends BasicTest{
	
	
	
//	
//	@Test
//	public void addMealToCart() throws InterruptedException {
////		
//		driver.get(baseUrl + "meal/lobster-shrimp-chicken-quesadilla-combo");
//		locationPopupPage.closingDialog();
//		mealPage.addToCart(3);
//    	Thread.sleep(5000);
//		
////    	Assert.assertEquals(notificationSistemPage.getMessageText(), "The Following Errors Occurred:", "Error: Add meal to cart failed");
////    	Assert.assertEquals(notificationSistemPage.getMessageText(),"Please Select Location", "Error: Add meal to cart failed");
////    	
////    	//notificationSistemPage.getMessageDissapear();
//     	locationPopupPage.setLocation("City Center - Albany");
//		mealPage.addToCart(3);
//		Assert.assertEquals(notificationSistemPage.getMessageText(), "Meal Added To Cart", "Error: Try again to add meal to cart.");
////		
//	}

//	
//   @Test
//      public void addMealToFavorite() {
//	   
//	   driver.get(baseUrl + "meal/lobster-shrimp-chicken-quesadilla-combo");
//	   locationPopupPage.closingDialog();
//	   mealPage.addToFavorite();
//	  // Assert.assertEquals(notificationSistemPage.getMessageText(), "Please login first", "Error: Add to favorite");
//	   driver.get(baseUrl + "guest-user/login-form");
//	   
//	   loginPage.login(username, password);
//	   driver.get(baseUrl + "meal/lobster-shrimp-chicken-quesadilla-combo");
//	   mealPage.addToFavorite();
//	   Assert.assertEquals(notificationSistemPage.getMessageText(),"Product has been added to your favorites.", "Error: Add to favorite");
//	   		
	   
		
		
//	}
   
   @Test
   public void clearCart() throws IOException {
	   driver.get(baseUrl + "meals");
	   locationPopupPage.setLocation("City Center - Albany");
	   File file = new File("data/data.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheetMeals = wb.getSheet("Meals");
		SoftAssert sa = new SoftAssert();
		for (int i = 1; i <= sheetMeals.getLastRowNum(); i++) {
			String meal = sheetMeals.getRow(i).getCell(0).getStringCellValue();
			driver.get(meal);
			locationPopupPage.setLocation("City Center - Albany");
			String quantity = sheetMeals.getRow(i).getCell(1).getStringCellValue();
			mealPage.addToCart(quantity);
			break;

	   
	   
   }
}
   }
