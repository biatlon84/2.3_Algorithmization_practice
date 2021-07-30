package com.epam.training.task_8;

public class Calculator {
	public static long getM(Array array) {
		Fraction f = array.getByIndex(0);
		long com = f.den / f.comD;
		long y = com;
		for (int i = 1; i < array.size(); i++) {
			f = array.getByIndex(i);
			y = Euclid.get(com, f.den / f.comD);
			com *= f.den / f.comD;
			com /= y;
		}
		return com;
	}
}
