package week1.Day2.Assignment;

public class FindIntersection {

	/*
	 * Pseudo Code
	
	 * a) Declare An array for {3,2,11,4,6,7};	 
	 * b) Declare another array for {1,2,8,4,9,7};
	 * c) Declare for loop iterator from 0 to array length
	 * d) Declare a nested for another array from 0 to array length
	 * e) Compare Both the arrays using a condition statement
	 
	 *  f) Print the first array (should match item in both arrays)
	 */
	
	public static void main(String[] args) {
		
		int[] a={3,2,11,4,6,7};
		int[] b={1,2,8,4,9,7};
		
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=b.length-1;j++)
			{
				if(a[i]==b[j] && i==j)
				{
					System.out.println("The element "+a[i]+" present in an array 'A' with index postiton "+i  );
					System.out.println("The element "+b[j]+" present in an array 'B' with index postiton "+j  );
				}
			}
		}
		
	}
}
