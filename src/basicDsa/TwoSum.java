package basicDsa;

import java.util.HashMap;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.*/
public class TwoSum {

	public static void main(String[] args) {
		
		int[] arr = {2,5,3,7,9,4};
		int target = 13;
		int[] result = twoSumFunction(arr,target);
		for(int index:result)
		{
			System.out.println(index);
		}
	}
	
	public static int[] twoSumFunction(int[] arr, int target)
	{
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for(int i=0;i<arr.length;i++)
		{
			int secInt = target - arr[i];
			if(hm.containsKey(secInt))
			{
				return new int[] {i,hm.get(secInt)};
			}
			else
			{
				hm.put(arr[i],i);
			}
		}
		return new int[] {};
		
		
	}

}
