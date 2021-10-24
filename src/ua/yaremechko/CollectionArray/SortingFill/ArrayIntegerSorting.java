package ua.yaremechko.CollectionArray.SortingFill;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArrayIntegerSorting {

	public static void main(String[] args) {

		Integer[] array = new Integer[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = getRandomValueRange(0, 100);
		}

		System.out.println("Before sorting: " + Arrays.toString(array));

		Arrays.sort(array);
		System.out.println("After sorting (asc): " + Arrays.toString(array));

		Arrays.sort(array, Collections.reverseOrder());
		System.out.println("After sorting (desc): " + Arrays.toString(array));

		Arrays.fill(array, 11);
		System.out.println("After fill: " + Arrays.toString(array));
	}

	public static int getRandomValueRange(int min, int max) {
		if (min > max) {
			throw new IllegalArgumentException("min value must be smalled than max value");
		}

		Random r = new Random();

		return r.nextInt(max - min + 1) + min;
	}

}
