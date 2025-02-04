package startproject;


class customer2
{
	private String name;
	private long cin;
	private float balance;
	
	public void setName(String nm)
	{
		name = nm;
	}
	public String getName()
	{
		return name;
	}
	
	public void setCin(long  c)
	{
		cin = c;
	}
	public long getCin()
	{
		return cin;
	}
	
	public void setBalance(float bal)
	{
		if(bal>1000)
		{
		balance = bal;
		}
	}
	public float getBalance()
	{
		return balance;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		customer2 c1 = new customer2();
		c1.setName("Alex");
		c1.setCin(99999999);
		c1.setBalance(4000);
		
		System.out.println(c1.getName());
		System.out.println(c1.getCin());
		System.out.println(c1.getBalance());
	}

}
