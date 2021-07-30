package com.epam.training.task_1;

import java.util.Arrays;

//Two one-dimensional arrays with different number of elements 
//and a natural number k are given.
//Combine them into one array, including the second array 
//between the k-th and (k + 1) -th elements of the first,
//without using an additional array.
public class Main {
	public static void main(String args[]) {

		int e = 10;
		int y = 3;
		int k = 4;

		int[] ar1 = Creator.array_ran(e, 1);
		int[] ar2 = Creator.array_ran(y, 1);
		sort(ar1, 0, ar1.length - 1);
		sort(ar2, 0, ar2.length - 1);
		ar1 = Arrays.copyOf(ar1, e + y);
		pri.pw(ar2);
		System.out.print("\n");
		for (int i = 0; i < e + y; i++) {
			if (i >= k && i < k + y) {
				System.out.print("\\/ ");
			} else {
				System.out.print("   ");
			}
		}
		Joiner.join3(ar1, ar2, k);
		pri.pw(ar1);
	}

	private static void sort(int[] ar, int start, int finish) {
		if (start >= finish)
			return;
		int ref = ar[(finish - start) / 2 + start];
		int i = start;
		int q = finish;
		while (i < q) {
			while (ar[i] < ref) {
				i++;
			}
			while (ar[q] > ref) {
				q--;
			}
			if (i <= q) {
				int bu = 0;
				bu = ar[q];
				ar[q] = ar[i];
				ar[i] = bu;
				q--;
				i++;
			}
		}
		if (q > start) {
			sort(ar, start, q);
		}
		if (i < finish) {
			sort(ar, i, finish);
		}
	}
}
