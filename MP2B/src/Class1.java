import java.util.Scanner;

public class Class1 
{
	private String [] stringArray;
	private int counter;
	
	public Class1(int capicity) 
	{
		stringArray = new String [capicity];
		counter = 0;
	}
	
	public void load()
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter some words or Q to quit: ");
		String newWord;
		newWord = in.next();
		while (!newWord.equals("Q"))
		{
			stringArray[counter] = newWord;
			counter ++;
			newWord = in.next();
		}
	}
	public boolean search (String inWord)
	{
		for (int i = 0; i < counter; i++)
		{
			if (stringArray[i].equals(inWord))
			{
			 return true;	
			}
		}
		return false;
	}
	
	public String findLongest()
	{
		String longest = stringArray[0];
		
		for (int i = 1; i < counter; i++)
		{
			if (stringArray[i].length() > longest.length())
			{
				longest = stringArray[i];
			}
			
		}
		return longest;
	}
	
	
	public String findShortest()
	{
		String shortest = stringArray[0];
		
		for (int i = 1; i < counter; i++)
		{
			if (stringArray[i].length() < shortest.length())
			{
				shortest = stringArray[i];
			}
			
		}
		return shortest;
	}
	
	public int findLongestPosition()
	{
		int longestLocation = 0;
		String longest= stringArray[0];
		
		for (int i = 1; i < counter; i++)
		{
			if (stringArray[i].length() > longest.length())
			{
				longest = stringArray[i];
				longestLocation = i;
			}
		
		}
		return longestLocation;
	}

	public int findShortestPosition()
	{
		int shortestLocation = 0;
		String shortest = stringArray[0];
		
		for (int i = 1; i < counter; i++)
		{
			if (stringArray[i].length() < shortest.length())
			{
				shortest = stringArray[i];
				shortestLocation = i;
			}
		
		}
		return shortestLocation;
	}

}
