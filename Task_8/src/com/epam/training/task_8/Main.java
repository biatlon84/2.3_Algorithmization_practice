package com.epam.training.task_8;

//Bring fractions to a common denominator and sort
public class Main {
	public static void main(String args[]) {
		Array arrayFractions = new Array(3);
		arrayFractions.generate(4); // Filling array of fractions
		arrayFractions.printAr();
		// ---------------
		Editor.divideAll(arrayFractions);
		System.out.println("Bring fractions to a common denominator");
		arrayFractions.printAr();
		QuickSort.sort(arrayFractions);
		System.out.println("Sort");
		arrayFractions.printAr();
	}
}
