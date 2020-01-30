
import java.util.Scanner;

public class CashRegisterTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		final int sentinel = -1;
		double purchase;
		double payment;
		
		CashRegister mainRegister = new CashRegister();
		
		System.out.println("Please enter a purchase amount or -1 to proceed to purchase");
		purchase = in.nextDouble();
		
		
		while (in.nextDouble() != sentinel)
			mainRegister.recordPurchase(in.nextDouble());
			
			
		mainRegister.recordPayment(in.nextDouble());
		
		System.out.println(mainRegister.giveChange());
		
		

	}

}
