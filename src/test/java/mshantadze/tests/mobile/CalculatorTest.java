package mshantadze.tests.mobile;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;

import mshantadze.mobile.common.CalculatorBase;

public class CalculatorTest extends AbstractTest {
	@Test
	public void plusTest() {
		CalculatorBase calculator = initPage(getDriver(), CalculatorBase.class);
		calculator.clickOk();
		Assert.assertFalse(calculator.isClickOnBtnVisible());
		calculator.selectFive();
		calculator.selectPlus();
		calculator.selectThree();
		calculator.selectEquals();
		Assert.assertEquals(calculator.getResult(), "8");
	}
	
	@Test
	public void minusTest() {
		CalculatorBase calculator = initPage(getDriver(), CalculatorBase.class);
		calculator.clickOk();
		Assert.assertFalse(calculator.isClickOnBtnVisible());
		calculator.selectFive();
		calculator.selectMinus();
		calculator.selectThree();
		calculator.selectEquals();
		Assert.assertEquals(calculator.getResult(), "2");
	}
	
	@Test
	public void divideTest() {
		CalculatorBase calculator = initPage(getDriver(), CalculatorBase.class);
		calculator.clickOk();
		Assert.assertFalse(calculator.isClickOnBtnVisible());
		calculator.selectFive();
		calculator.selectDivide();
		calculator.selectThree();
		calculator.selectEquals();
		Assert.assertTrue(calculator.getResult().contains("1.6"));
	}
	
	@Test
	public void multiplyTest() {
		CalculatorBase calculator = initPage(getDriver(), CalculatorBase.class);
		calculator.clickOk();
		Assert.assertFalse(calculator.isClickOnBtnVisible());
		calculator.selectFive();
		calculator.selectMultiply();
		calculator.selectThree();
		calculator.selectEquals();
		Assert.assertEquals(calculator.getResult(), "15");
	}
}
