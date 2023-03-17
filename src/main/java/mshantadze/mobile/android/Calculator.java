package mshantadze.mobile.android;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.utils.factory.DeviceType.Type;

import mshantadze.mobile.common.CalculatorBase;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = CalculatorBase.class)
public class Calculator extends CalculatorBase {
	@FindBy(id = "com.tricolorcat.calculator:id/btOK")
	ExtendedWebElement okBtn;
	
	@FindBy(id = "com.tricolorcat.calculator:id/five")
	ExtendedWebElement fiveBtn;
	
	@FindBy(id = "com.tricolorcat.calculator:id/three")
	ExtendedWebElement threeBtn;
	
	@FindBy(id = "com.tricolorcat.calculator:id/plus")
	ExtendedWebElement plusBtn;
	
	@FindBy(id = "com.tricolorcat.calculator:id/equal")
	ExtendedWebElement equalsBtn;
	
	@FindBy(id = "com.tricolorcat.calculator:id/display")
	ExtendedWebElement resultLbl;
	
	@FindBy(id = "com.tricolorcat.calculator:id/minus")
	ExtendedWebElement minusBtn;
	
	@FindBy(id = "com.tricolorcat.calculator:id/divide")
	ExtendedWebElement divideBtn;
	
	@FindBy(id = "com.tricolorcat.calculator:id/times")
	ExtendedWebElement multiplyBtn;
	
	public Calculator(WebDriver driver) {
		super(driver);
	}

	@Override
	public void clickOk() {
		okBtn.click();
	}
	
	@Override
	public boolean isClickOnBtnVisible() {
		return okBtn.isVisible();
	}
	
	@Override
	public void selectFive() {
		fiveBtn.click();
	}
	
	@Override
	public void selectThree() {
		threeBtn.click();
	}
	
	@Override
	public void selectPlus() {
		plusBtn.click();
	}
	
	@Override
	public void selectEquals() {
		equalsBtn.click();
	}
	
	@Override
	public String getResult() {
		return resultLbl.getText().trim();
	}
	
	@Override
	public void selectMinus() {
		minusBtn.click();
	}
	
	@Override
	public void selectDivide() {
		divideBtn.click();
	}

	@Override
	public void selectMultiply() {
		multiplyBtn.click();
	}
}
