package startproject;

import java.util.Scanner;

public class ProductCombination {
	public static void CombinationOfArray(int ar[])
	{
		int product;
		int max=ar[0];
		int min =ar[1];
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
			product =ar[i]*ar[j];
			System.out.print(product+" ");
			if(product>max)
			{
				max=product;
			}
			else if(product<max)
			{
				min =product;
			}
		   }
		}
		System.out.println(" ");
		System.out.println(max);
		System.out.println(min);
	}
	
	
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int ar[]=new int[size];
	for(int i=0;i<ar.length;i++)
	{
		ar[i]=sc.nextInt();
	}
	
	CombinationOfArray(ar);
	sc.close();
	}

}
