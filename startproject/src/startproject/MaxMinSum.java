package startproject;

import java.util.Scanner;

public class MaxMinSum {

	public static int  sum(int ar[])
	{
		int sum=0;
		
		for(int i=0;i<ar.length;i++)
		{
			sum+=ar[i];
		}
		return sum;
	}
	
	public static int  max(int ar[])
	{
		int max=ar[0];
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>max)
			{
			max=ar[i];
			}
			
		}
		return max;
	}
	
	public static int  min(int ar[])
	{
		int min=ar[0];
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<min)
			{
			min=ar[i];
			}
			
		}
		return min;
	}
	
	public static void MaxAndMinSum(int[] ar)
	{
		int sum=sum(ar);
		int min=min(ar);
		int max=max(ar);
		System.out.println(sum-max);
		System.out.println(sum-min);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		MaxAndMinSum(ar);
		sc.close();
	}

}
