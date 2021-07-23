package com.epam.training.task_2;

public class Joiner {
	public static int[] join(int[] ar1, int[] ar2) {
		int a = 0;
		int b = 0;
		int[] array = new int[ar1.length + ar2.length];

		for (int i = 0; i < ar1.length + ar2.length; i++) {
			if ((ar2.length > b) && (ar1.length > a)) {
				if (ar2[b] > ar1[a]) {
					array[i] = ar1[a];
					a++;
				} else {
					array[i] = ar2[b];
					b++;
				}
			} else {
				if (ar1.length > (a)) {
					array[i] = ar1[a];
					a++;
				}
				if (ar2.length > (b)) {
					array[i] = ar2[b];
					b++;
				}
			}
		}
		return array;
	}

	static void join2(int[] ar1, int point) {
		// Joining without an extra array
		int buf = 0;
		int j = 0;
		int x = point;
		while (x < ar1.length) {
			buf = ar1[x];
			while ((ar1[j] <= buf) && (j < x)) {
				j++;
			}
			move(ar1, j, x);
			ar1[j] = buf;
			x++;
		}
	}

	private static void move(int[] ar1, int st, int end) {
		int i = end - 1;
		while (i >= st) {
			ar1[i + 1] = ar1[i];
			i--;
		}
	}

	public static int[] join3(int[] ar1, int[] ar2) {
		int a = 0;
		int b = 0;
		int c = 0;
		int len1 = ar1.length;
		int len2 = ar2.length;
		int[] array = new int[len1 + len2];
		while ((a < len1) && (len2 > b)) {

			if (ar1[a] < ar2[b]) {
				array[c] = ar1[a];
				a++;
				c++;
			} else {
				array[c] = ar2[b];
				b++;
				c++;
			}
		}
		if (a >= len1) {
			for (int i = b; i < len2; i++) {
				array[c] = ar2[i];
				c++;
			}
		} else {
			for (int i = a; i < len1; i++) {
				array[c] = ar1[i];
				c++;
			}
		}

		return array;
	}

}
