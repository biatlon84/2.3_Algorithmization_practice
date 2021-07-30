package com.epam.training.task_8;

public class Editor {
	public static long divideAll(Array arrayFractions) {
		Fraction f;
		long x = Calculator.getM(arrayFractions);
		for (int i = 0; i < arrayFractions.size(); i++) {
			f = arrayFractions.getByIndex(i);
			f.numerator *= x;
			f.numerator /= f.den;
			f.den = x;
			arrayFractions.setDr(f, i);
		}
		return x;
	}
}
