package startproject;

import java.util.Scanner;

abstract class shape 
{
	float area;
	abstract void acceptInput();
	abstract void area();
	
	public void display()
	{
		System.out.println("Area: "+area);
	}
}

class rectangle extends shape
{
	private float length;
	private float breadth;
	public void acceptInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length: ");
		length=sc.nextFloat();
		System.out.println("Enter breadth: ");
		breadth = sc.nextFloat();
		sc.close();
	}
	public void area()
	{
		area =length*breadth;
		//System.out.println(area);
		
	}
	
	
}

class square extends shape
{
	float side;
	
	public void acceptInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side:");
		side=sc.nextFloat();
		sc.close();
	}
	
	public void area()
	{
		area =side*side;
		
	}	
	
}

class circle extends shape
{
	float radius;
	public void acceptInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius:");
		radius=sc.nextFloat();
		sc.close();
	}
	
	public void area()
	{
		area = 3.142f*radius*radius;
		System.out.println(area);
		
	}	
}


class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		shape sp = new square();
		sp.acceptInput();
		sp.area();
		sp.display();
		sc.close();
	}

}
