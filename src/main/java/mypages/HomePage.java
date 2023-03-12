package mypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class HomePage extends AbstractPage {
	@FindBy(xpath = "//a[contains(@class,'no-underline user-profile-link')]")
	private ExtendedWebElement logo;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public boolean isLogoVisible() {
		return logo.isVisible();
	}
}
