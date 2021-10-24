package ua.yaremechko.CollectionArray.FillObject;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int size1array = getRandomValueRange(1, 5);
		int size2array = getRandomValueRange(1, 5);

		Car[][] arrayOfCar = new Car[size1array][size2array];

		while (true) {
			System.out.println();
			menu();
			switch (sc.nextInt()) {
			case 1: {
				Car[][] arrayOfCarNew = new Car[size1array][size2array];
				for (int i = 0; i < size1array; i++) {
					for (int j = 0; j < size2array; j++) {
						arrayOfCarNew[i][j] = new Car(getRandomValueRange(100, 300), getRandomValueRange(1990, 2020));

					}

				}
				arrayOfCar = arrayOfCarNew;
				break;
			}
			case 2: {
				System.out.println(Arrays.deepToString(arrayOfCar));
				break;
			}
			case 3: {
				Car[][] arrayOfCarNew = new Car[size1array][size2array];
				for (Car[] cars : arrayOfCarNew) {
					Arrays.fill(cars, new Car(200, 2000));
				}
				arrayOfCar = arrayOfCarNew;
				break;
			}
			case 0: {
				System.out.println("GOOD BYE");
				System.exit(0);
			}

			default:
				throw new IllegalArgumentException("Unexpected value: " + sc.nextInt());
			}
		}

	}

	public static int getRandomValueRange(int min, int max) {
		if (min > max) {
			throw new IllegalArgumentException("min value must be smalled than max value");
		}

		Random r = new Random();

		return r.nextInt(max - min + 1) + min;
	}

	static void menu() {
		System.out.println("Press 1 to fill the array with  objects of class Car");
		System.out.println(
				"Press 2 to Display toString () of the data elements of the array on the console. (deepToString ())");
		System.out.println(
				"Press 3 to For all objects of the given array to notice identical object of class Car (fill ())");
		System.out.println("Press 0 to EXIT");
	}
}
