package com.epam.training.task_6;

//Shell sort  or Gnome sort
//An array of n real numbers is given. You want to order it in ascending order.
// This is done as follows: two adjacent elements are compared
// ai and ai + 1. If ai <= ai + 1, then move forward one element. If
//ai> ai + 1, then a permutation is performed and shifted one element back.
//Create an algorithm for this sorting.
public class Main {
	public static void main(String[] args) {

		int[] ar = Creator.array_ran(15, 5, 15);
		pri.pw(ar);
		int[] ar1 = ar.clone();
		int high = ar1.length - 1;
		int pos = 0;
		int bu = 0;
		int posSt = 0;
		int c = 0;

		while (pos < high) {// Gnome sort

			if (ar[pos] > ar[pos + 1]) {
				bu = ar[pos];
				ar[pos] = ar[pos + 1];
				ar[pos + 1] = bu;
				pos--;
				c++;
			} else {
				posSt = pos + 1;
				pos++;
			}
			if (pos < 0) {
				pos = posSt;
				// pos++;
			}
		}
		int sh = 0;

		int step = high / 2;
		int i = 0;
		pos = 0;
		int cu = 0;
		// Shell sort with Pratt-modified sequence
		int[] arrOfSteps = new int[(int) (Math.log(high) / Math.log(2)) + 1];
		int sz = high, q = 1;
		arrOfSteps[0] = 1;
		while (arrOfSteps[q - 1] < sz) {
			int s = arrOfSteps[q - 1];
			arrOfSteps[q++] = s * 3 + s / 3; // Pratt-modified sequence
		}
		q--;
		// Shell sort core
		while (q >= 0) {
			step = arrOfSteps[q];
			i = step;
			while (i <= high) {
				pos = i;
				cu = ar1[i];
				while ((pos >= step) && (ar1[pos - step] > cu)) {
					ar1[pos] = ar1[pos - step];
					pos -= step;
					sh++;
				}
				ar1[pos] = cu;
				i++;
			}
			// step = 2;
			q--;
		}
		// Сomb sorting
		/*
		 * for (int step = n / 2; step > 0; step /= 2) { for (int i = step; i < n; i++)
		 * { for (int j = i - step; j >= 0 && a[j] > a[j + step] ; j -= step) { if(a[j]
		 * > a[j + step]) { int x = a[j]; a[j] = a[j + step]; a[j + step] = x; } } } }
		 */
		System.out.print("\nShell sort, there were " + sh + " swaps:");
		pri.pw(ar1);

		System.out.print("\nGnome sort, there were " + c + " swaps:");
		pri.pw(ar);

	}

}
