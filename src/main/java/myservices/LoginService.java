package myservices;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.gui.AbstractPage;

import mypages.LoginPage;

public class LoginService extends AbstractPage {
	public LoginService(WebDriver driver) {
		super(driver);
	}

	public void login() {
		LoginPage loginPage = new LoginPage(getDriver());
		loginPage.goToLoginPage();
		loginPage.enterLogin();
		loginPage.enterPassword();
		loginPage.submit();
	}
}
