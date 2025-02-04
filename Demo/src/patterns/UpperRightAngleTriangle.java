package patterns;

import java.util.Scanner;

public class UpperRightAngleTriangle {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printTriangle(n);
	}
	
	public static void printTriangle(int n)
	{
		for(int i=0;i<n;i++)
		{
			 for(int k=0;k<i;k++)
			   {
				System.out.print(" ");   
			   }
		   for(int j=i;j<n;j++)
		   {
			   System.out.print("*");
			  
		   }
		  
		   System.out.println("");
		}
	}
}
