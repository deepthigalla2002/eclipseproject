package startproject;

class test1 
{
	int x,y;
	test1()
	{
		x=100;
		y = 200;
	}
	test1(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
}

class test2 extends test1
{
	int a,b;
	test2()
	{
		a=300;
		b=400;
	}
	test2(int a ,int b)
	{
		this.a = a;
		this.b = b;
		
	}
	void display()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
	}
}

public class Inheritance {

	public static void main(String[] args) 
	{
		test2 t2 = new test2(9,1009);
		t2.display();

	}

}
