package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginPageTest {
	
	WebDriver driver;
	String userName = "demo@codefios.com";
	String password = "abc123";
	
	@Test
	public void validUserShoulBeAbleToLogin() {
		
		driver = BrowserFactory.init();
		
		//Login:
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName(userName);
		loginPage.insertPassword(password);
		loginPage.clickSignInButton();
		
		//Validate landing on the dashboard page:
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardPage();
		
		//Close the browser:
		BrowserFactory.tearDown();
		
		
		
	
		
	}

}
