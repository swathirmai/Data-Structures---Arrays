package Arrays;
import java.util.*;

public class SumTarget {

	public static void main(String[] args) {

		int[] inputArray = new int[] { 4, 6, 5, -10, 8, 5, 20 };
		int inputNumber = 10;
		int[] arr = getVal(inputArray,inputNumber);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);

	}

	public static int[] getVal(int[] inputArray, int inputNumber) {
		HashMap<Integer,Integer> hm = new HashMap();
		for(int i=0;i<inputArray.length;i++) {
			int rem = inputNumber - inputArray[i];
			if(hm.containsKey(rem)) {
				return new int[] {hm.get(rem),i};
			}
			hm.put(inputArray[i], i);
		}
		return inputArray;

	}

}
