
public class CashRegister {
	
	private double purchase;
	
	private double payment;
	
public CashRegister()
{
	purchase = 0;
	payment = 0;
}

public CashRegister (double initialPurchase)
{
	purchase = initialPurchase;
}

public  void recordPurchase (double cost)
{
	purchase = purchase + cost;
}

public void recordPayment (double amount)
{
	payment = payment+ amount;
}

public void giveChange (double change)
{
	change = purchase - payment;
}

}
