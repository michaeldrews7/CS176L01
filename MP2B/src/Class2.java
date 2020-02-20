
import java.util.Scanner;
public class Class2 
{
	private int [] integerArray;
	private int howMany;
	/**
	 * constructs an integer array with a maximum capacity
	 */
	public Class2(int capacity)
	{
		integerArray = new int[capacity];
		howMany = 0;
	}
	public void load()
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the values, or 'Q' to quit: ");
		while (in.hasNextInt())
		{
				integerArray[howMany] = in.nextInt();
				howMany++;
		}
	}
	public boolean search(int inNum) //allows the user to search for a number to test to see if it is embedded in the loop. use a for loop to test against
	{
		for (int i = 0; i < howMany; i++)
		{
			if (integerArray[i] == inNum)
			{
				return true;
			}
		}
		return false;
	}
	public int findMax() //should print out and return the maximum value of the highest value in the array
	{
		int largest = integerArray[0];
		
		for (int i =1; i < howMany; i++)
			if (integerArray[i] > largest)
			{
				largest = integerArray[i];
			}
		return largest;
	}
	public int findMin() //should print out and return the minimum value of the lowest value in the array
	{
		int smallest = integerArray[0];
		for (int i = 1; i < howMany; i++)
			if (integerArray[i] < smallest)
			{
				smallest = integerArray[i];
			}
		return smallest;
	}
	public int findMaxPos() //should print out where the highest number is located in the array (the positioning of where it is)
	{
		int largestLocation = 0;
		int largest = integerArray[0];
		for (int i = 1; i < howMany; i++)
			if (integerArray[i] > largest)
			{
				largest = integerArray[i];
				largestLocation = i;
			}
		return largestLocation;
	}
	public int findMinPos() //should print out where the lowest number is located in the array (the positioning of where it is)
	{
		int smallestLocation = 0;
		int smallest = integerArray[0];
		for (int i = 1; i < howMany; i++)
			if (integerArray[i] < smallest)
			{
				smallest = integerArray[i];
				smallestLocation = i;
			}
		return smallestLocation;
	}
}

