package mshantadze.tests.ui;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.demo.db.models.GithubUser;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;

import mypages.LoginPage;

public class LoginTest implements IAbstractTest {
	
	@Test()
	@MethodOwner(owner = "MindiaShantadze02")
	public void openLoginPage() {
		LoginPage loginPage = new LoginPage(getDriver());
		GithubUser user = new GithubUser();
		loginPage.open();
		loginPage.goToLoginPage();
		loginPage.enterLogin(user.getLogin());
		loginPage.enterPassword(user.getPassword());
		loginPage.submit();
	}
}
