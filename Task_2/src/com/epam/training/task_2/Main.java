package com.epam.training.task_2;

import java.util.Arrays;

//Two sequences are given a1 <= a2 <= ... <= an, and b1 <= b2 <= ... <= bn. Form a new sequence of numbers from them so,
//so that it is also non-decreasing. Note. Do not use an additional array.
public class Main {

	public static void main(String args[]) {

		int m = 5;// Length of the first sequence
		int n = 7;// Length of the second sequence
		int[] ar1 = Creator.array_ran(m, 1, m);
		int[] ar2 = Creator.array_ran(n, 1, n + m);
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		for (int i = 0; i < m; i++) {
			ar2[i] = ar1[i];
		}
		// ---------
		pri.pw(ar2);
		Joiner.join2(ar2, m);
		pri.pw(ar2);
	}
}
