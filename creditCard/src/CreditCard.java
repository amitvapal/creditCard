
public class CreditCard
{
	
	private Money balance;
	private Money creditLimit;
	private Person owner;

	public CreditCard(Person newCardHolder, Money limit)
	{
		owner = newCardHolder;
		balance = new Money(0);
		creditLimit = new Money(limit);	
	}
	
	public Money getBalance()
	{
	return new Money(balance);
	}

	public Money getCreditLimit()
	{
	return new Money(creditLimit);
	}

	public String getPersonals()
	{
	return owner.toString();
	}
	
	public void charge(Money amount)
	{
		Money possibleLimit = new Money(balance.add(amount));
		
		if (possibleLimit.compareTo(this.creditLimit) > 0)
		{
		System.out.println("Over Credit limit ");
		}
		else
			
		{
			this.balance=new Money(this.balance).add(new Money(amount));
			System.out.println("Charge: " + amount);
		}
		
	}
	
	public void payment(Money amount)
	{
		this.balance = new Money(balance.subtract(amount));
	}
	
	

}
