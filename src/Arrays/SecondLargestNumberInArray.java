package Arrays;

/*Given an unsorted array, you need to find the second largest element in the array in o(n) time complexity.*/

public class SecondLargestNumberInArray {

	public static void main(String[] args) {

		int[] arr = new int[] {4,178,23,15,9};
		int second = getSecondLargest(arr);
		System.out.println("Second Largest Number in array : " + second);

	}

	public static int getSecondLargest(int[] arr) {

		int first = arr[0];
		int second = arr[0];

		for (int i=0;i<arr.length;i++) {
			if(arr[i] > first) {
				second = first;
				first = arr[i];				
			}
			else if (arr[i] > second && arr[i] != first) {
				second = arr[i];;
			}
		}	
		return second;

	}

}
