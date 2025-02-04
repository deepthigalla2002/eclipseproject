package startproject;

import java.util.Scanner;

public class ArrayCombination {

	public static void CombinationOfArray(int ar[])
	{
		int sum=0;
		int max=ar[0];
		int min =ar[1];
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
			sum =ar[i]+ar[j];
			//System.out.print(sum+" ");
			if(sum>max)
			{
				max=sum;
			}
			else if(sum<max)
			{
				min =sum;
			}
		   }
		}
		//System.out.println(" ");
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
