package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	//WebElement List:
	@FindBy(how = How.XPATH, using = "//*[@id=\"user_name\"]") WebElement USERNAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]") WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"login_submit\"]") WebElement SIGNIN_BUTTON_ELEMENT;
	
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//related action or methods
	public void insertUserName(String userName) {
		
		USERNAME_ELEMENT.sendKeys(userName);
	}
	
	public void insertPassword(String password) {
		
		PASSWORD_ELEMENT.sendKeys(password);
	}
	
	public void clickSignInButton() {
		
		SIGNIN_BUTTON_ELEMENT.click();
	}
	
	//combined method: less work in the beginning, but if anything fails it will be hard to figure out
	public void performLogin(String userName, String password) {
		USERNAME_ELEMENT.sendKeys(userName);
		PASSWORD_ELEMENT.sendKeys(password);
		SIGNIN_BUTTON_ELEMENT.click();
	}
	
	

}
