package com.epam.training.task_8;

public class Editor {
	public static Fraction divideAll(Array arrayFractions) {
		Fraction f, f2;
		long x = 0;
		f2 = Calculator.getM(arrayFractions);
		x = f2.den / f2.numerator;
		for (int i = 0; i < arrayFractions.size(); i++) {
			f = arrayFractions.getByIndex(i);
			f.numerator *= x;
			f.numerator /= f.den;
			f.den = x;
			arrayFractions.setDr(f, i);
		}
		return f2;
	}
}
