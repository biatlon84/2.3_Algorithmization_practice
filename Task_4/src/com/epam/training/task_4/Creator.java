package com.epam.training.task_4;

public class Creator {
	public static int[] array_ran(int x, float f, int n) {
		int[] ar = new int[n];
		for (int i = 0; i < x; i++) {

			ar[i] = (int) (Math.random() * x * f);
		}

		return ar;
	}

}
