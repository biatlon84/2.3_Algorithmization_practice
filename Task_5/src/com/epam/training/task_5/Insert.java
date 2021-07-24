package com.epam.training.task_5;

public class Insert {
	public static void ins(int[] ar, int border, int pos, int in) {
		int i = border;
		while (i < pos) {
			ar[i] = ar[i + 1];
			i++;
		}
		ar[pos] = in;
	}
}
