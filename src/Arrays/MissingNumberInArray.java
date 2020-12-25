package Arrays;

/*You are given an integer array containing 1 to n but one of the number from 1 to n in the array is missing. 
  You need to provide optimum solution to find the missing number. Number can not be repeated in the arry.
 */
public class MissingNumberInArray {

	public static void main(String[] args) {

		int[] arr = new int[] {5,3,1,2};
		int missingNumber = getMissingNumber(arr);
		System.out.println("Missing Number in array : " + missingNumber);
	}

	public static int getMissingNumber(int[] arr) {

		int n = arr.length+1;
		int sum=n*(n+1)/2;
		int totalSum = 0;

		for (int i=0;i<arr.length;i++) {
			totalSum+=arr[i];
		}	
		int missingNumber = sum - totalSum;
		return missingNumber;

	}

}
