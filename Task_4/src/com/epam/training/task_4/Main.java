package com.epam.training.task_4;

//Bubble sort
public class Main {
	public static void main(String[] args) {

		int[] ar = Creator.array_ran(15, 5, 15);
		pri.pw(ar);
		bubble.sort(ar, 0, 14);
		pri.pw(ar);
		System.out.print("\nPassages: " + bubble.coun);
		System.out.print("\nSwaps   : " + bubble.counS);
		System.out.print("\n" + (double) bubble.counS / bubble.coun);
	}
}
