package Arrays;

public class Equalityoftwoarrays {

	public static void main(String[] args) {

		int[] arrayOne = {21, 57, 11, 37, 24};

		int[] arrayTwo = {21, 57, 11, 37, 24,123};

		boolean status = true;
		if(arrayOne.length != arrayTwo.length) {
			status = false;
		}
		else {
			for(int i=0;i<arrayOne.length;i++) {
				if(arrayOne[i] != arrayTwo[i]) {
					status = false;
				}

			}
		}
		System.out.println(status);
	}

}
