package com.epam.training.task_7;

public class Display {
	public static void pos1(int ar1In[], int length) {
		for (int i = 0; i < length; i++) {
			if (ar1In[i] < 0) {
				System.out.printf("%2d", i + 1);
			} else
				System.out.print("  ");
			System.out.print(" ");
		}
	}

	public static void pos2(int ar1In[], int length) {

		for (int i = 0; i < length; i++) {
			if (ar1In[i] > 0) {
				System.out.printf("%2d", i + 1);
			} else
				System.out.print("  ");
			System.out.print(" ");
		}

	}

	public static void ar(int ar1In[], int length) {

		for (int i = 0; i < length; i++) {
			if (ar1In[i] < 0) {
				System.out.print("/\\");
			} else
				System.out.print("  ");
			System.out.print(" ");
		}

	}

	public static void sequ1(int ar1In[], int[] ar1, int[] ar2) {
		int pos = 0;
		for (int i = 0; i < ar2.length + ar1.length; i++) {
			if (ar1In[i] > 0) {
				System.out.printf("%2d", ar1[pos]);
				pos++;
			} else
				System.out.print("  ");
			System.out.print(" ");
		}

	}

	public static void sequ2(int ar1In[], int[] ar1, int[] ar2) {
		int pos = 0;
		for (int i = 0; i < ar2.length + ar1.length; i++) {
			if (ar1In[i] < 0) {
				System.out.printf("%2d", ar2[pos]);
				pos++;
			} else
				System.out.print("  ");
			System.out.print(" ");
		}

	}

	public static void e(int length) {

		for (int i = 0; i < length; i++) {
			System.out.print("---");
		}
	}

}
