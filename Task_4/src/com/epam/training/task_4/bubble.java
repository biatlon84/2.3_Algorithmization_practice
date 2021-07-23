package com.epam.training.task_4;

public class bubble {
	public static int coun = 0;

	public static void sort(int[] array, int low, int high) {
		boolean w = true;
		int i, bu;
		while (w) {
			coun++;
			w = false;
			i = low + 1;
			while (high >= i) {
				if (array[i - 1] > array[i]) {
					bu = array[i];
					array[i] = array[i - 1];
					array[i - 1] = bu;
					w = true;
				}
				i++;
			}
		}
	}

	public static void sortB(int[] array, int low, int high) {
		boolean w = true;
		int i, bu;
		while (w) {
			coun++;
			w = false;
			i = low + 1;
			while (high >= i) {
				if (array[i - 1] < array[i]) {
					bu = array[i];
					array[i] = array[i - 1];
					array[i - 1] = bu;
					w = true;
				}
				i++;
			}
		}
	}
}
