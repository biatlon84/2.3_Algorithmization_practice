package com.epam.training.task_5;

public class Binary_search {
	public static int search(int[] ar, int l, int element) {

		int high = ar.length - 1;
		int low = l + 1;
		int pos = high;

		while (low <= high) {
			pos = (high + low) / 2;
			if (element > ar[pos]) {
				low = pos + 1;
			}
			if (element < ar[pos]) {
				high = pos - 1;
			}
			if (ar[pos] == element) {
				return pos - 1;
			}
		}
		return low - 1;
	}
}
