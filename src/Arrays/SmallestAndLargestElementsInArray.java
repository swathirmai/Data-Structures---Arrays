package Arrays;

/*You are given an array of numbers. You need to find smallest and largest numbers in the array.*/

public class SmallestAndLargestElementsInArray {

	public static void main(String[] args) {

		int[] arr = new int[] {4,78,23,15,96};
		getSmallestAndLargest(arr);

	}

	public static void getSmallestAndLargest(int[] arr) {

		int small = arr[0];
		int large = arr[0];

		for (int i=0;i<arr.length;i++) {
			if(arr[i] > large) {
				large = arr[i];
			}
			else if (arr[i] < small) {
				small = arr[i];
			}
		}
		System.out.println("Largest Number : " + large);
		System.out.println("Smallest Number : " + small);

	}

}
