package com.epam.training.task_8;

public class Array {

	public Array(int z) {
		super();
		this.z = z;
		dr = new Fraction[z];
	}

	private int z;
	private Fraction[] dr;

	public void setDr(Fraction dr, int i) {
		this.dr[i] = dr;
	}

	public Fraction getByIndex(int i) {
		return dr[i];
	}

	public int size() {
		return z;
	}

	public void generate(int lim) {
		for (int i = 0; i < z; i++) {
			dr[i] = (new Fraction((int) (Math.random() * lim + 1), (int) (Math.random() * lim + 1)));
		}
	}

	public void printAr() {
		for (int i = 0; i < z; i++) {
			System.out.println(dr[i]);
		}
	}
}