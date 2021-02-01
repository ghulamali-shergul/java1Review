/**
 * Implement each of the 10 methods tested in JUnitTests.java. Study the tests
 * to determine how the methods should work.
 */

import java.util.Arrays;


public class Java1Review {

	public static void main(String[] args) {
		// If you want to write your own tests, do so here. (Do not modify
		// JUnitTests.java.) To run this method in Eclipse, right-click
		// Java1Review.java in the Package Explorer and select "Run As" >
		// "Java Application" from the context menu.

}
	public static boolean isDivisibleBy7 (int a)
	{
		if (a%7 == 0)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public static int divide (int a, int b)
	{
		int c = a/b;
		return c;
	}
	
	public static double divide (double a, double b)
	{
		double c = a/b;
		return c;
	}
	
	public static String main(String a)
	{
		String result = "Overloaded main method was passed \"" + a + "\".";
		return result;
	}
	
	public static int findMin(int a, int b, int c)
	{
		int minValue = Math.min(Math.min(a, b), c);
		return minValue;
	}
	
	public static int findMin(int [] a)
	{
		int arrayMinValue = a[0];;
		for (int i = 0; i < a.length; ++i)
		{
			
			if (a[i] < arrayMinValue)
			{
				arrayMinValue = a[i];
			}
		}
		return arrayMinValue;
	}
	
	public static double average(int [] a)
	{
		int sum = 0;
		for (int i = 0; i < a.length; i++)
		{
			sum = sum + a[i];
		}
		
		double averageValue = (double) sum/a.length;
		return averageValue;
	}
	
	public static void toLowerCase(String [] a)
	{
		for (int i = 0; i<a.length; i++)
		{
			a[i] = a[i].toLowerCase();
		}
	}
	
	public static String [] toLowerCaseCopy(String [] a)
	{
		String [] b = new String [a.length];
		for (int i = 0; i<a.length; ++i)
		{
			b[i] = a[i].toLowerCase(); 
		}
		return b;
	}
	
	public static int [] removeDuplicates(int [] a)
	{
		int temp;
		for (int i = 0; i<a.length; ++i)
		{
			temp = a[i];
			for (int j = i + 1; j<a.length; ++j)
			{
				if (temp  == a[j])
				{
					a[i] = 0;
					a[j]= 0;
				}
			}
		}
		return a;
	}
	
	
}
