package com.epam.training.task_8;

public class Fraction {

	public long den = 1;
	public long numerator = 1;
	public long comD = 1;

	public Fraction(long num, long den) {
		this.den = den;
		numerator = num;
		this.comD = Euclid.get(num, den);
	}

	@Override
	public String toString() {
		return String.format("%10d", numerator) + "/" + String.format("%10d", den);
	}

	public long getComD() {
		return comD;
	}

}
