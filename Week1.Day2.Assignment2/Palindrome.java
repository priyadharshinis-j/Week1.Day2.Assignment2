package week1.Day2.Assignment;

/*Assignment:2

Check the given number is palindrome or not 

Int num =34343

Initialize a  temporary variable.

Reverse the number (using for loop and add to the temporary variable)

Compare the temporary number with reversed number

If both numbers are same, print "palindrome number"

Else print "not palindrome number"*/

public class Palindrome 
{

	public static void main(String[] args) 
	{
		int num =34343;
		int n=num;
		int temp=0;
		// num already initialized with value 34343
		for(;num!=0;num=num/10)
		{
			int temp1=num%10;
			temp=(temp*10)+temp1;
		}
		
		if(temp==n)
		{
			System.out.println("The given number is palindrome");
		}
		else
		{
			System.out.println("The given number is not palindrome");
		}
	}
}
