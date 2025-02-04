package startproject;
class calc
{
	int add(int a,int b)
	{
		System.out.println("add_1");
		int res = a+b;
		return res;
	}
	double add(double a,double b)
	{
		System.out.println("add_2");
		double res = a+b;
		return res;
	}
	double add(double a,float b)
	{
		System.out.println("add_3");
		double res = a+b;
		return res;
	} 
	float add(int a,float b)
	{
		System.out.println("add_4");
		float res = a+b;
		return res;
	}
}
public class method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc calc = new calc();
		System.out.println(calc.add(10,10));
	}

}
