package mypages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.zebrunner.carina.utils.Configuration;
import com.zebrunner.carina.utils.R;

public class LoginPage extends AbstractPage {
	@FindBy(xpath = "//a[contains(text(), 'Sign in')]")
	ExtendedWebElement btnLoginHyperlink;
	
	@FindBy(id = "login_field")
	ExtendedWebElement inptEmail;
	
	@FindBy(id = "password")
	ExtendedWebElement inptPassword;
	
	@FindBy(xpath = "//input[@value='Sign in']")
	ExtendedWebElement btnLogin;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		setPageAbsoluteURL("https://github.com/");
	}
	
	public void goToLoginPage() {
		btnLoginHyperlink.click();
	}
	
	public void enterLogin(String login) {
		inptEmail.type(login);
	}
	
	public void enterPassword(String password) {
		inptPassword.type(password);
	}
	
	public void submit() {
		btnLogin.click();
	}
}
