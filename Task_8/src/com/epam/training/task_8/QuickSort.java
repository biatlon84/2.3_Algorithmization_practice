package com.epam.training.task_8;

public class QuickSort {
	public static void sort(Array arL) {
		quickSort(arL, 0, arL.size() - 1);
	}

	private static void quickSort(Array ar, int low, int high) {
		if (low >= high)
			return;
		long ref = ar.get(low + (high - low) / 2);
		int i = low, j = high;
		while (i <= j) {
			while (ar.compS(i, ref)) {
				i++;
			}
			while (ar.compB(j, ref)) {
				j--;
			}
			if ((i <= j)) {
				ar.swap(i, j);
				i++;
				j--;
			}
		}
		if (low < j)
			quickSort(ar, low, j);

		if (high > i)
			quickSort(ar, i, high);
	}
}
