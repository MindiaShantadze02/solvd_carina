package mshantadze.tests.ui;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;

import mypages.HomePage;
import myservices.LoginService;

public class HomePageTest extends AbstractTest {
	@Test()
	@MethodOwner(owner = "MindiaShantadze02")
	public void verifyLogo() {
		LoginService loginService = new LoginService(getDriver());
		HomePage homePage = new HomePage(getDriver());
		homePage.open();
		loginService.login();
		Assert.assertTrue(homePage.isLogoVisible(), "Logo doesn't exist");
	}
}
