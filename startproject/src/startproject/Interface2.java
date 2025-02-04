package startproject;


interface os
{
	void boot();
	void shutDown();
	static void InstallApp()
	{
		System.out.println("verify and install");
	}
	default void update()
	{
		System.out.println("update and install");
	}
	
}

class windows implements os
{
	public void boot()
	{
		System.out.println("Windows System is booting");
	}
	public void shutDown()
	{
		System.out.println(" Windows System is shutting Down");
	}
}
class mac implements os
{
	public void boot()
	{
		System.out.println("Mac System is booting");
	}
	public void shutDown()
	{
		System.out.println("Mac System is shutting Down");
	}
}


class linux extends mac implements os
{
	public void boot()
	{
		System.out.println("linux System is booting");
	}
	public void shutDown()
	{
		System.out.println("linux System is shutting Down");
	}
}



public class Interface2 {

	public static void main(String[] args) {
	mac s=new linux();
	os o=new mac();
	s.boot();
	s.shutDown();
	s.update();
	
	
	o.update();
	o.shutDown();
	o.boot();
	
	
	os.InstallApp();
	

	}
	
}
