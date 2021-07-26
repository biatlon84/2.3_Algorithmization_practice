package com.epam.training.task_7;

import java.util.Arrays;

//Let two non-decreasing sequences of real numbers a1 <= a2 <= ... <= an and b1 <= b2 <= ... <= bn be given.
//It is required to indicate the places where you want to insert an element of the sequence b1 <= b2 <= ... <= bn in the first sequence so,
//to keep the new sequence ascending.
public class Main {
	public static void main(String[] args) {
		int n = 12;
		int[] ar1 = Creator.array_ran(n, 3, n);
		int[] ar2 = Creator.array_ran(n, 3, n);
		int[] ar1In = new int[n + n];
		int i = 0;
		int pos = 0;
		int pos2 = 0;
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		pri.pw(ar1);
		pri.pw(ar2);
		while (i < ar1.length) {// take intermediate sequence
			while ((pos < ar2.length) && (ar1[i] >= ar2[pos])) {
				ar1In[pos2] = -(pos + 1);
				pos++;
				pos2++;
			}
			ar1In[pos2] = i + 1;
			pos2++;
			i++;
		}
		while (pos < ar2.length) {
			ar1In[pos2] = -(pos + 1);
			pos++;
			pos2++;
		}
		System.out.println(
				"Answer: this are the positions in the first sequence where I should enter new numbers from second sequence");
// the positions in the first sequence where I should enter new numbers
		Display.pos1(ar1In, ar2.length + ar1.length);
		System.out.print("<PLs1\n");
		Display.e(ar2.length + ar1.length);// Display just ------------
		System.out.print("\n");
		Display.sequ1(ar1In, ar1, ar2);// Display first sequence
		System.out.print("<SQ1\n");
		Display.ar(ar1In, ar2.length + ar1.length);// Display just "/\"
		System.out.print("\n");
		Display.sequ2(ar1In, ar1, ar2);// Display second sequence
		System.out.print("<SQ2\n");
		Display.e(ar2.length + ar1.length);// Display just ------------
		System.out.print("\n");
		// the positions in the second sequence where I should enter new numbers
		Display.pos2(ar1In, ar1.length + ar2.length);
		System.out.print("<PLs2\nSpecial intermediate sequence");
		pri.pw(ar1In);
		System.out.print("\nWe replace this with a resulting array");
		pos = 0;
		pos2 = 0;
		// Replace the intermediate sequence with the resulting array
		for (i = 0; i < ar2.length + ar1.length; i++) {
			if (ar1In[i] > 0) {
				ar1In[i] = ar1[pos];
				pos++;
			} else {
				ar1In[i] = ar2[pos2];
				pos2++;
			}
			System.out.print(" ");
		}
		pri.pw(ar1In);
	}
}
