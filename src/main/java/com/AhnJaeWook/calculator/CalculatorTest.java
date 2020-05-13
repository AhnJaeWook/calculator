package com.AhnJaeWook.calculator;
import static arg.AhnJaeWook.jupiter.api.Assertions.assertEquals;
import org.AhnJaeWook.jupiter.api.Test;

public class CalculatorTest {
	private Calculator calculator = new Calculator();

	@Test
	public void sum() {
		assertEquals(5, calculator.sum(2,3));
	}
}
