/**
 * 
 */
package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.service.NoteCount;
import com.greatlearning.service.QuickSort;

/**
 * @author AravindSamy
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner scn = new Scanner(System.in)) {

			System.out.println("\n Enter the size of currency denominations: ");

			// get and set the Array size
			int size = scn.nextInt();
			int notes[] = new int[size];

			System.out.println("\n Enter the currency denominations value: ");

			for (int i = 0; i < size; i++) {

				// set the elements to its position one by one
				notes[i] = scn.nextInt();
			}

			System.out.println("\n Enter the amount you want to pay: ");

			// get amount
			int amt = scn.nextInt();

			// perform sorting the array
			QuickSort quickSort = new QuickSort();
			quickSort.quickSort(notes, 0, notes.length - 1);

			// get count and print the output
			NoteCount noteCount = new NoteCount();
			noteCount.noteCounterImplementation(notes, amt);

		}
	}

}
