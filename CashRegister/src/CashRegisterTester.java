
import java.util.Scanner;

public class CashRegisterTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		final int sentinel = -1;
		double purchase1 = 0;
		int threshold = 50;
		double discount = 8.18;
		double amount = 73.69;
		
		CashRegister mainRegister = new CashRegister();
		
		//System.out.println("Please enter a purchase amount or -1 to proceed to purchase: ");
		//purchase1 = in.nextDouble();
		
		
		while (purchase1 != sentinel) {
			System.out.println("Please enter a purchase amount or -1 to proceed to purchase: ");
			purchase1 = in.nextDouble();
			if (purchase1 == sentinel)
				break;
			mainRegister.recordPurchase(purchase1);
		}
		
		System.out.println("Please enter the payment amount: ");
		mainRegister.recordPayment(in.nextDouble());
		
		System.out.println("Your total purchases were " + purchase1 + " and because you spent over " + threshold + ", you are entitled to a 10% discount of " + discount + "%, reducing to your balance to " + amount); 
		System.out.printf("%.2f", mainRegister.giveChange());
		
		

	}

}
