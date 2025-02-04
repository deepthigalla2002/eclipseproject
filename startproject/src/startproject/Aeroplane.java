package startproject;

class plane
{
	void fly()
	{
		System.out.println("plane is flying");
	}
	void takeoff()
	{
		System.out.println("plane is taking off");
	}
	void land()
	{
		System.out.println("plane is landing");
	}
}

class cargoplane extends plane
{
	@Override
	void fly()
	{
		System.out.println("cargo is flying");
	}
	void carrycargo()
	{
		System.out.println("Cargo is carrying cargo");
	}
}

class passenger extends plane
{
	void carrypassenger()
	{
		System.out.println("passenger plane is carrying passenger");
	}
	@Override
	void fly()
	{
		System.out.println("passenger is flying");
	}
}
class armyplane extends plane
{
	void carryarmy()
	{
		System.out.println("Army plane is carrying army weapons");
	}
	void fly()
	{
		System.out.println("Army plane is flying");
	}
}




public class Aeroplane {

	public static void main(String[] args) 
	{
	plane cp = new cargoplane();
	passenger pp = new passenger();
	armyplane ap = new armyplane();
	
	
	cp.takeoff();
	cp.fly();
	cp.land();
	((cargoplane)(cp)).carrycargo();
	System.out.println("");
	
	pp.takeoff();
	pp.fly();
	pp.land();
	pp.carrypassenger();
	System.out.println("");

	
	ap.takeoff();
	ap.fly();
	ap.land();
	ap.carryarmy();
	System.out.println("");

	}

}
