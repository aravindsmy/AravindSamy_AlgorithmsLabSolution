/**
 * 
 */
package com.greatlearning.driver;

import java.util.Scanner;

/**
 * @author AravindSamy
 *
 */
public class PayMoneyTransaction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner scn = new Scanner(System.in)) {

			System.out.println("\n Please enter the size of transaction array: ");

			// get size of the array
			int size = scn.nextInt();

			// set size of the array
			int arr[] = new int[size];

			System.out.println("\n Please enter the value of array: ");

			int i;

			// apply values into the array
			for (i = 0; i < size; i++) {
				arr[i] = scn.nextInt();
			}

			System.out.println("\n Enter the total number of targets that need to be achieved: ");

			// get the size of target
			int trgtNo = scn.nextInt();

			while (trgtNo-- != 0) {

				int flag = 0;
				Long trgtVal;
				int sum = 0;

				System.out.println("\n Enter the value of target: ");

				// get the target value
				trgtVal = scn.nextLong();

				// perform condition to check if target achieved
				for (i = 0; i < size; i++) {

					sum += arr[i];

					if (sum >= trgtVal) {

						// print the position to the console
						System.out.println("\n Target achieved after: " + (i + 1) + " transactions");

						flag = 1;
						break;

					}

				}

				if (flag == 0) {

					// print if the target is not achieved
					System.out.println("\n Given target is not achieved");
				}
			}

		}

	}

}
