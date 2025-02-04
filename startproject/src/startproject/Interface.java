package startproject;

import java.util.Scanner;

interface Calculator
	{
		void add();
		void sub();
	}
	
	class calculator1 implements  Calculator
	{
		public void add()
		{
			int a=100;
			int b=200;
			System.out.println(a+b);
		}
		
		public void sub()
		{
			int a=100;
			int b=200;
			System.out.println(a-b);
		}
	}
	
	class calculator2 implements  Calculator
	{
		Scanner sc =new Scanner(System.in);
		public void add()
		{
		//Scanner sc=new Scanner(System.in);
		System.out.println("Enter a: ");
		int a= sc.nextInt();
		System.out.println("Enter b: ");
		int b= sc.nextInt();
		System.out.println(a+b);
		
		
		}
		public void sub()
		{
		//	Scanner sc=new Scanner(System.in);
			System.out.println("Enter a: ");
			int a= sc.nextInt();
			System.out.println("Enter b: ");
			int b= sc.nextInt();
			System.out.println(a-b);
			sc.close();
		}
		
		
	}
	
	class calculator3 implements  Calculator
	{
		Scanner sc =new Scanner(System.in);
		public void add()
		{
		//Scanner sc=new Scanner(System.in);
		System.out.println("Enter a: ");
		int a= sc.nextInt();
		System.out.println("Enter b: ");
		int b= sc.nextInt();
		System.out.println("Enter c: ");
		int c= sc.nextInt();
		System.out.println(a+b+c);
		
		
		}
		public void sub()
		{
		//	Scanner sc=new Scanner(System.in);
			System.out.println("Enter a: ");
			int a= sc.nextInt();
			System.out.println("Enter b: ");
			int b= sc.nextInt();
			System.out.println("Enter c: ");
			int c= sc.nextInt();
			System.out.println(a-b-c);
			sc.close();
		}
		
	}

	
	
public class Interface {
	
	public static void main(String[] args) {
		Calculator c1=new calculator3();
//		calculator2 c2=new calculator2();
//		calculator3 c3=new calculator3();
		c1.add();
		c1.sub();
//		c2.add();
//		c2.sub();
//		c3.add();
//		c2.sub();
		
	}

}
