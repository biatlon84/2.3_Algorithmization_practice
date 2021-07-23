package com.epam.training.task_3;

//Sort by selection. You are given a sequence of numbers a1 <= a2 <= ... <= an. It is required to rearrange the elements so that
//so that they are in descending order. To do this, in the array, starting from the first, the largest element is selected and put in first place,
//and the first - in the place of the greatest. Then, starting from the second, this procedure is repeated. Write a selection sorting algorithm

public class Main {

	public static void main(String[] args) {

		int[] ar = Creator.array_ran(15, 5, 15);
		pri.pw(ar);
		for (int i = 0; i < ar.length; i++) {
			int n = i;
			int max = ar[i];
			int ii = i + 1;
			while (ii < ar.length) {
				if (ar[ii] > max) {
					n = ii;
					max = ar[ii];
				}
				ii++;
			}
			ar[n] = ar[i];
			ar[i] = max;
		}
		pri.pw(ar);
	}

}
