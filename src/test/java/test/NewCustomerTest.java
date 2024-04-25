package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import page.NewCustomerPage;
import util.BrowserFactory;

public class NewCustomerTest {
	
	WebDriver driver;
	String userName = "demo@codefios.com";
	String password = "abc123";
	String newCustomerPageText = "New Customer";
	String fullName = "Selenium";
	String company = "Techfios";
	
	@Test
	public void userShouldBeAbleToAddNewCustomer() {
		
		driver = BrowserFactory.init();
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.performLogin(userName, password);
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardPage();
		dashboardPage.clickOnCustomerMenuElement();
		dashboardPage.clickOnAddCustomerElement();
		
		NewCustomerPage newCustomerPage = PageFactory.initElements(driver, NewCustomerPage.class);
		newCustomerPage.validateNewCustomerPage(newCustomerPageText);
		newCustomerPage.insertFullName(fullName);
		newCustomerPage.selectCompanyFromDropdown(company);
		
		
	}

}
