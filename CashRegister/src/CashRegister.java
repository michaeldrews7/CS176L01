
public class CashRegister {
	
	private double purchase;
	
	private double payment;
	
public CashRegister()
{
	purchase = 0;
	payment = 0;
}

public void recordPurchase (double cost)
{
	purchase = purchase + cost;
}

public void recordPayment (double amount)
{
	payment = amount;
}

public double giveChange ()
{
	return payment - purchase;
}
public void calcDiscount (double discount, double minimumPurchase)
{
	if (purchase > minimumPurchase) {
		purchase = purchase - (purchase * discount);
	}
}
}
