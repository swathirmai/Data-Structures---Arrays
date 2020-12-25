package Arrays;

import java.util.Arrays;

/*You are given arrival and departure time of trains reaching to a particular station. 
You need to find minimum number of platforms required to accommodate the trains at any point of time.*/

public class TrainPlatformSolution {

	public static void main(String[] args) {

		int arr[] = {100, 140, 150, 200, 215, 400};
		int dep[] = {110, 300, 210, 230,315, 600};
		System.out.println("Minimum platforms needed: "+ findPlatformsRequiredForStation(arr,dep,6));
	}

	public static int findPlatformsRequiredForStation(int arr[], int dep[], int n)
	{
		int platform_needed = 0, maxPlatforms = 0;
		Arrays.sort(arr);
		Arrays.sort(dep);
		int i = 0, j = 0;
		while (i < n && j < n)
		{
			if (arr[i] < dep[j])
			{
				platform_needed++;
				i++;
				if (platform_needed > maxPlatforms) 
					maxPlatforms = platform_needed;
			}
			else 
			{
				platform_needed--;
				j++;
			}
		}
		return maxPlatforms;
	}

}
