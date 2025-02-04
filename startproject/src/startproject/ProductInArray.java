package startproject;

import java.util.Scanner;

public class ProductInArray {

	public static int product(int ar[])
	{
		int product=1;
		int res=0;
		for(int i=0;i<ar.length;i++)
		{
			product*=ar[i];
			
		}
		res=product;
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(res/ar[i]+" ");
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
			
		}
		product(ar);
		sc.close();
		}
	    
	

}
