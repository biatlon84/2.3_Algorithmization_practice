package com.epam.training.task_5;

public class Insert_sorter {
	public static void sort(int[] ar) {
		int border = ar.length - 2;
		while (border >= 0) {
			int element = ar[border];
			Insert.ins(ar, border, Binary_search.search(ar, border, element), element);
			border--;
		}
	}
}
