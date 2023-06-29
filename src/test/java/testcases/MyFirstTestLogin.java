package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;

public class MyFirstTestLogin extends BaseTest{
	
	    @Test(dataProvider="testdata")
	    public static void loginTest(String username, String password) {
	    	
	    	driver.findElement(By.xpath(loc.getProperty("username_loc"))).sendKeys(username);
			driver.findElement(By.xpath(loc.getProperty("password_loc"))).sendKeys(password);
			driver.findElement(By.xpath(loc.getProperty("loginButton_loc"))).click();
	    }
 
	
		  @DataProvider(name="testdata") public Object[][] tData() 
		  { return new Object[][] { 
		  
		  {"standard_user","secret_sauce"},
		  {"locked_out_user","secret_sauce"}, 
		  {"problem_user","secret_sauce"},
		  {"performance_glitch_user","secret_sauce"}
		  
		  }; 
		  }
		 
}
