package com.epam.training.task_8;

public class Calculator {
	public static Fraction getM(Array array) {

		Fraction f = array.getByIndex(0);
		long minM = f.den;
		long maxD = f.den;
		long maxN = f.numerator;
		for (int i = 1; i < array.size(); i++) {
			f = array.getByIndex(i);
			maxD = Evclid.get(maxD, f.den);
			maxN = Evclid.get(maxN, f.numerator);

			minM *= f.den;
			minM /= maxD;
		}
		f = new Fraction(Evclid.get(maxD, maxN), minM);
		System.out.println("Least common multiple  : " + minM + "\nGreatest common factors: " + maxN + " , " + maxD);
		return f;
	}
}
