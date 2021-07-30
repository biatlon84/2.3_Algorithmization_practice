package com.epam.training.task_1;

public class Creator {
	public static int[] array_ran(int x, float f) {
		int[] ar = new int[x];
		for (int i = 0; i < ar.length; i++) {

			ar[i] = (int) (Math.random() * x * f);
		}

		return ar;
	}

}
