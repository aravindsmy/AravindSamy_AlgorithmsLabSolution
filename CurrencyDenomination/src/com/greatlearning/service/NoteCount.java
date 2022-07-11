/**
 * 
 */
package com.greatlearning.service;

/**
 * @author AravindSamy
 *
 */
public class NoteCount {

	public void noteCounterImplementation(int notes[], int amount) {

		// set new array with array size
		int noteCounter[] = new int[notes.length];

		try {

			for (int i = 0; i < notes.length; i++) {

				if (amount >= notes[i]) {

					// get count of the note
					noteCounter[i] = amount / notes[i];
					amount = amount - noteCounter[i] * notes[i];
				}
			}

			if (amount > 0) {

				System.out.println("\n Amount can't be given in highest denomination");

			} else {

				System.out.println("\n Your payment approach in order to give min no of notes will be: ");

				for (int i = 0; i < notes.length; i++) {

					if (noteCounter[i] != 0) {

						System.out.println(" " + notes[i] + " : " + noteCounter[i]);
					}
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
