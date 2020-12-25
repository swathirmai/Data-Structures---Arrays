package Arrays;

public class ArrayIntersection {

	public static void main(String[] args) {

		int[]  arr1 = {1, 2, 3, 4, 5, 6};
		int[] arr2 = {2, 3, 4, 7, 8};
		int c =0;
		int[] op = new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i] == arr2[j]) {
					op[c] = arr1[i];                    
					c++;
				}
			}
		}

		for(int i=0;i<c;i++) {
			System.out.println(op[i]);

		}
	}
}