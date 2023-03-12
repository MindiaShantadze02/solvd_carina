package myservices;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.db.models.GithubUser;

import mypages.LoginPage;

public class LoginService extends AbstractPage {
	private GithubUser user = new GithubUser();
	
	public LoginService(WebDriver driver) {
		super(driver);
	}

	public void login() {
		LoginPage loginPage = new LoginPage(getDriver());
		loginPage.goToLoginPage();
		loginPage.enterLogin(user.getLogin());
		loginPage.enterPassword(user.getPassword());
		loginPage.submit();
	}
}
