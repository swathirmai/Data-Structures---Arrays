package Arrays;

/*Given an array of 0’s and 1’s in random order , you need to separate 0’s and 1’s in an array.*/

public class Separate0sAnd1sInArray {

	public static void main(String[] args) {

		int[] arr = {0,1,0,0,1,1,1,0,1};
		int[] op = separate0s1sSolution2(arr);

		for(int i=0;i<op.length;i++) {
			System.out.println(op[i]);
		}
	}

	public static int[] Separate0sAnd1s(int[] arr) {
		int count = 0;

		for(int i=0;i<arr.length;i++) {			
			if(arr[i] == 0) {
				count++;
			}
		}
		for(int i = 0; i<count;i++) {
			arr[i] = 0;
		}
		for(int i = count; i<arr.length;i++) {
			arr[i] = 1;
		}

		return arr;

	}

	public static int[] separate0s1sSolution2(int arr[])
	{
		for (int i = 0; i < arr.length; i++) {
			int left=0;
			int right=arr.length-1;
			while(arr[left]==0)
			{
				left++;
			}
			while(arr[right]==1)
			{
				right--;
			}

			if(left<right)
			{
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
			}
		}
		return arr;
	}


}
