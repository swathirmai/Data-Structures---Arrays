package Arrays;

import java.util.*;
import java.util.Map.Entry;

/*You are given a array of integer. All numbers occur even number of times except one. You need to find the number which occurs odd number of time.*/

public class GetOddTimesElementInArray {

	public static void main(String[] args) {

		int array[] = new int[]{20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20};
		System.out.println("Number which occurs odd number of times is : "+ getOddTimesElementHashing(array));

	}

	public static int getOddTimesElementHashing(int ar[]) 
	{
		int i;

		HashMap<Integer,Integer> elements=new HashMap<Integer,Integer>();
		for (i = 0; i < ar.length; i++) 
		{
			int element=ar[i];
			if(elements.get(element)==null)
			{
				elements.put(element, 1);
			}
			else
				elements.put(element, elements.get(element)+1);
		}
		for (Entry<Integer,Integer> entry:elements.entrySet()) { 
			if(entry.getValue()%2==1)
			{
				return entry.getKey();
			}

		} 
		return -1;
	}

}
