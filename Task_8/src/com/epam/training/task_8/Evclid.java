package com.epam.training.task_8;

public class Evclid {
	public static long get(long a, long b) {
		while ((a != 0) && (b != 0)) {
			if (a > b) {
				a = a % b;
			} else {
				b = b % a;
			}
		}
		return a + b;
	}
}
