package com.epam.training.task_1;

public class pri {
	public static void p(int[][] array) {

		for (int ii = 0; ii < array.length; ii++) {
			for (int i = 0; i < array[0].length; i++) {
				System.out.printf("%2d", array[ii][i]);
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}

	public static void pw(int[] arra) {

		System.out.print("\n");
		for (int i = 0; i < arra.length; i++) {
			System.out.printf("%2d", arra[i]);
			System.out.print(" ");
		}
	}

}
