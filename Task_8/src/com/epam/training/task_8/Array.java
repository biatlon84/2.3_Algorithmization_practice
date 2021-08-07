package com.epam.training.task_8;

public class Array {

	public Array(int z) {
		super();
		this.z = z;
		arrayIt = new Fraction[z];
	}

	private int z;
	private Fraction[] arrayIt;

	public Fraction getByIndex(int i) {
		return arrayIt[i];
	}

	public void setDr(Fraction f, int i) {
		this.arrayIt[i] = f;
	}

	public int size() {
		return z;
	}

	public void generate(int lim) {
		for (int i = 0; i < z; i++) {
			arrayIt[i] = (new Fraction((int) (Math.random() * lim + 1), (int) (Math.random() * lim + 1)));
		}
	}

	public void printAr() {
		for (int i = 0; i < z; i++) {
			System.out.println(arrayIt[i]);
		}
	}

	public long get(int index) {
		return arrayIt[index].numerator;
	}

	public boolean compB(int b, long v) {
		return arrayIt[b].numerator > v;
	}

	public boolean compS(int s, long v) {
		return arrayIt[s].numerator < v;
	}

	public void swap(int i, int j) {
		Fraction bu = arrayIt[i];
		arrayIt[i] = arrayIt[j];
		arrayIt[j] = bu;
	}
}