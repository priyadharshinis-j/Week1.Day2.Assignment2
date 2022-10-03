package week1.Day2.Assignment;

import java.util.Arrays;

//Find the Second smallest number in the array {23,45,67,32,89,22 }
public class SecondSmallest {
	
	public static void main(String[] args) 
	{
		
		int[] arr={23,45,67,32,89,22};
		System.out.println("Without Using Sorting Method1");
		System.out.println("------------------------------");
		// Find the first smallest element
		//initialize small =arr[0]
		int smallest =arr[0];
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]<smallest)
			{
				//first smallest value
				smallest=arr[i];
			}
		}
		//likewise find second smallest number
		int secondSmallest = arr[0];
		for(int i=0;i<=arr.length-1;i++)
		{
			
			if(arr[i]<secondSmallest && arr[i]!=smallest)
			{
				secondSmallest=arr[i];
			}
		}
		System.out.println("The second smallest number is "+secondSmallest);
		
		System.out.println("Using sorting Method2");
		System.out.println("------------------------");
		Arrays.sort(arr);
		System.out.println("the sorted array is "+Arrays.toString(arr));
		System.out.println("The second smallest number is "+arr[1]);
		
		
		
		
		
	}

}
