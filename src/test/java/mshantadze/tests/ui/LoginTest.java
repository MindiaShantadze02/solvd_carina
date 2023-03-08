package mshantadze.tests.ui;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;

import mypages.LoginPage;

public class LoginTest implements IAbstractTest {
	
	@Test()
	@MethodOwner(owner = "MindiaShantadze02")
	public void openLoginPage() {
		LoginPage loginPage = new LoginPage(getDriver());
		loginPage.open();
		loginPage.goToLoginPage();
		loginPage.enterLogin();
		loginPage.enterPassword();
		loginPage.submit();
	}
}
