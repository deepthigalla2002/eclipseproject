package startproject;
class bankaccount 
{
	private float bal;
	public void setbal(float c)
	{
		if(c>0)
		{
			bal=c;
		}
	}
	public float getbal()
	{
		return bal;
	}
}
public class encap_bankaccount {

	public static void main(String[] args) {
		bankaccount b = new bankaccount();
		
		
		b.setbal(-10000);
		System.out.println(b.getbal());

	}

}