// SEIT Question 3:

package WWQuestion3;

import java.util.Random;

public class WWQuestion3 {

	public static void main(String[] args) {

		// Instantiate Random Method to retrieve random numbers 
		// Declare an array of 500 to store random numbers
		Random rand = new Random();
		int[] arr = new int[500];

		// Use for loop to populate the array with random numbers
		
		// rand.nextInt has value of (5000) + 1 to not get a 0 value and have large enough numbers to find a conclusive min
		// If we remove the value of (5000) + 1, to get the size of numbers allowed by int datatype (Number is too big) 
		for (int i = 0; i < 500; i++) {
			int n = rand.nextInt(5000) + 1;
			arr[i] = n;
			System.out.println(n);
		}
		
		// Declare int min and set it to the first value of the randomized array
		int min = arr[0];
		
		// Traverse through the array to find which number is the smallest
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		
		// Print the min number to console
		System.out.println("Min Number: " + min);
	}

}
