package Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		int[] inputArray = { 3, 7, 9, 6, 4 };
		for (int left = 0, right = inputArray.length - 1; left < right; left++, right--) {
			// swap the values at the left and right indices
			int temp = inputArray[left];
			inputArray[left] = inputArray[right];
			inputArray[right] = temp;
		}

		// Printing the Array after reverse

		System.out.print("Reverse Array :");
		for (int val : inputArray)
			System.out.print(" " + val);
	}

}


