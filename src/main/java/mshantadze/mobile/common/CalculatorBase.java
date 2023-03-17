package mshantadze.mobile.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public abstract class CalculatorBase extends AbstractPage {
	public CalculatorBase(WebDriver driver) {
		super(driver);
	}

	public abstract void clickOk();
	public abstract boolean isClickOnBtnVisible();

	public abstract void selectFive();

	public abstract void selectThree();

	public abstract void selectPlus();
	
	public abstract void selectEquals();
	
	public abstract String getResult();
	
	public abstract void selectMinus();
	
	public abstract void selectMultiply();
	
	public abstract void selectDivide();
}
