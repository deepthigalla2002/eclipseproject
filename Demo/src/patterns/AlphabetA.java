package patterns;

import java.util.Scanner;

public class AlphabetA {


	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printAlphabet(n);
	}
	
	public static void printAlphabet(int n)
	{
		for(int i=0;i<n;i++)
		{
//			 for(int k=i;k<i;k++)
//			   {
//				System.out.print(" ");   
//			   }
		   for(int j=0;j<=n;j++)
		   {
			   if(j==n/2 & n%2==0) {
			   System.out.print("*");
			   }
			   else if(j==n/2 && n%2!=0){
				   System.out.print(" *");
			   }
			   else {
				   System.out.print(" ");
			   }
			  
		   }
		  
		   System.out.println("");
		}
	}
}
