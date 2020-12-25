package Arrays;

/*Given an array of integers, you need to segregate odd and even numbers in an array.*/

public class SeparateEvenOddNumbers {

	public static void main(String[] args) {

		int arr[]={12, 17, 70, 15, 22, 65, 21, 90};

		arr=SeparateEvenOddNumbers(arr);
		System.out.println("Array after separating even and odd numbers : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

	public static int[] SeparateEvenOddNumbers(int arr[])
	{
		int left=0;
		int right=arr.length-1;
		for (int i = 0; i < arr.length; i++) {

			while(arr[left]%2==0)
			{
				left++;
			}
			while(arr[right]%2==1)
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
