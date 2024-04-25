package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {
	
	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//WebElement List:
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/section/div/div[2]/div/div/header/div/strong") WebElement DASHBOARD_VALIDATION_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/aside[1]/div/nav/ul[2]/li[2]/a/span") WebElement CUSTOMER_MENU_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"customers\"]/li[2]/a/span") WebElement ADD_CUSTOMER_ELEMENT;
	
	public void validateDashboardPage() {
		Assert.assertEquals(DASHBOARD_VALIDATION_ELEMENT.getText(), "Dashboard", "Dashboard Page Not Found");
	}
	
	public void clickOnCustomerMenuElement() {
		CUSTOMER_MENU_ELEMENT.click();
	}
	
	public void clickOnAddCustomerElement() {
		ADD_CUSTOMER_ELEMENT.click();
	}
	
	

}
