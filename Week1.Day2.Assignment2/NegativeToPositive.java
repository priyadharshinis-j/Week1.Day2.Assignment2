package week1.Day2.Assignment;

/*Problem statement: Convert a negative number to positive number
----------------------------------------------------------------
Pseudocode: 
1. Initialize an integer with a negative number like, int number = -40;
2. Check if the number is a negative number Hint : any number that is lesser than zero is a negative number
3. If so, convert the number to a positive number
4. Print as below "The number -40 is converted to 40"*/

public class NegativeToPositive
{

	public static void main(String[] args) 
	{
		int number=-40;
		if(number<0)
		{
			//***method 1 using in built Math function*** 
			System.out.println("Using built in Math function");
			System.out.println("-----------------------------");
			System.out.println("The number -40 is converted to psitive number "+Math.abs(number));
			System.out.println("Without using built in function");
			System.out.println("--------------------------------");
			//***method 2***
			number =number *(-1);
			System.out.println("The number -40 is converted to psitive number "+number);
		}
		else
		{
		System.out.println("The given number is already positive value");
		}
	}
}
