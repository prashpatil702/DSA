package basicDsa;

import java.util.Arrays;

public class MedianOfTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,1,4,9};
		int[] arr2 = {2,3,6,10};
		
		float medi = calculateMedian(arr1,arr2);
		System.out.println("Medi....."+medi);
				
	}

	private static float calculateMedian(int[] arr1, int[] arr2) {
		int m = arr1.length;
		int n = arr2.length;
		int[] mergedArray = new int[m+n];
		
		int i = 0, j = 0, k = 0;
		while(i < m && j < n)
		{
			if(arr1[i]<arr2[j])
			{
				mergedArray[k++] = arr1[i++]; 
			}
			else
			{
				mergedArray[k++] = arr2[j++];
			}
			
		}
		
		while(i<m)
		{
			mergedArray[k++] = arr1[i++]; 
		}
		
		while(j<n)
		{
			mergedArray[k++] = arr2[j++]; 
		}
		
		Arrays.stream(mergedArray).forEach(System.out::println);
		
		int medianIndex = mergedArray.length / 2;
		System.out.println("medianIndex "+medianIndex);
		if(mergedArray.length % 2 == 0)
		{
			System.out.println("from first -");
			System.out.println(mergedArray[medianIndex]);
			System.out.println(mergedArray[medianIndex-1]);
			return (float)(mergedArray[medianIndex]+mergedArray[medianIndex-1])/2;  
			
		}
		else
		{	
			System.out.println("from second - ");
			return mergedArray[medianIndex];
		}
		
	}

}
