package com.epam.training.task_5;

//Insertion sort with binary search
public class Main {
	public static void main(String[] args) {
		int[] ar = Creator.array_ran(20, 2, 20);
		pri.pw(ar);
		Insert_sorter.sort(ar);
		System.out.print("\nInsertion sort:");
		pri.pw(ar);
	}
}
