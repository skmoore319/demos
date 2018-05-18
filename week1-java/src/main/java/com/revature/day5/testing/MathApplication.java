package com.revature.day5.testing;

public class MathApplication {
	private Calculator calc = new CacluatorImpl();

	public double myAdvancedCalculation(double one, double two, double three) {
		double result = calc.add(one, two);
		result = calc.multiply(result, three);
		return result;
	}
}
