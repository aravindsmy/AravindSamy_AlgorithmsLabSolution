/**
 * 
 */
package com.greatlearning.service;

/**
 * @author AravindSamy
 *
 */
public class QuickSort {
	// method to find the partition position
	static int partition(int array[], int low, int high) {

		// choose the rightmost element
		int element = array[high];

		// pointer for greater element
		int i = (low - 1);

		// compare each element with element
		for (int j = low; j < high; j++) {
			if (array[j] > element) {

				// swapping with the greater element pointed by i
				i++;

				// swapping element at i with element at j
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}

		}

		// swap the array element with the greater element specified by i
		int temp = array[i + 1];
		array[i + 1] = array[high];
		array[high] = temp;

		// return the position from where partition is done
		return (i + 1);
	}

	public void quickSort(int array[], int low, int high) {
		if (low < high) {

			// find element such that
			int elem = partition(array, low, high);

			// recursive call on the left
			quickSort(array, low, elem - 1);

			// recursive call on the right
			quickSort(array, elem + 1, high);
		}
	}
}
