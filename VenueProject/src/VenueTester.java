import java.util.Random;
import java.util.Scanner;

public class VenueTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		Venue prudentialCenter = new Venue(4,5,10);
		Random numbers= new Random();
		
		int cap = 100;
		
		for (int i = 0; i < cap; i++)
		{
			int section = numbers.nextInt(4);
			int row = numbers.nextInt(5);
			int seats = numbers.nextInt(10);
			
			section += 1;
			row += 1;
			seats += 1;
			
			if (prudentialCenter.seatLookup(section-1, row-1, seats-1))
			{
				System.out.println(section + " - " + row + " - " + seats + " seat awarded");
			}
			else 
			{
				System.out.println(section + " - " + row + " - " + seats + " seat taken");
			}
		}
		
		

	}

}
