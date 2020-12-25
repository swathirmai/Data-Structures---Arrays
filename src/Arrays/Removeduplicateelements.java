package Arrays;
import java.util.*;

public class Removeduplicateelements {

	public static void main(String[] args) {

		int[] arr = {4, 4,3, 2};
		int k = arr.length;
		int n = removeDuplicatesSolution(arr,k);
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

	public static int removeDuplicatesSolution(int[] arr,int n) {
		{ 
			if (n == 0 || n == 1) 
				return n; 

			// To store index of next unique element 
			int j = 0; 

			// Doing same as done in Method 1 
			// Just maintaining another updated index i.e. j 
			for (int i = 0; i < n-1; i++) 
				if (arr[i] != arr[i+1]) 
					arr[j++] = arr[i]; 

			arr[j++] = arr[n-1]; 

			return j; 
		} 
	}

	static void removeDuplicates(int[] arrayWithDuplicates)
	{
		System.out.println("Array With Duplicates : "+Arrays.toString(arrayWithDuplicates));

		//Assuming all elements in input array are unique

		int noOfUniqueElements = arrayWithDuplicates.length;

		//Comparing each element with all other elements

		for (int i = 0; i < noOfUniqueElements; i++) 
		{
			for (int j = i+1; j < noOfUniqueElements; j++)
			{
				//If any two elements are found equal

				if(arrayWithDuplicates[i] == arrayWithDuplicates[j])
				{
					//Replace duplicate element with last unique element

					arrayWithDuplicates[j] = arrayWithDuplicates[noOfUniqueElements-1];

					//Decrementing noOfUniqueElements

					noOfUniqueElements--;

					//Decrementing j

					j--;
				}
			}
		}

		//Copying only unique elements of arrayWithDuplicates into arrayWithoutDuplicates

		int[] arrayWithoutDuplicates = Arrays.copyOf(arrayWithDuplicates, noOfUniqueElements);

		//Printing arrayWithoutDuplicates

		//System.out.println("Array Without Duplicates : "+Arrays.toString(arrayWithoutDuplicates));
		System.out.println("Array Without Duplicates : "+ arrayWithoutDuplicates);

		System.out.println("==============================");
	}

}
