package startproject;

import java.util.Scanner;

public class LargestArray {

	public static int secondLargestElement(int ar[])
	{
		int largest;
		int smallest;
		if(ar[0]>ar[1])
		{
		largest=ar[0];
		smallest=ar[1];
		}
		else
		{
		largest =ar[1];
		smallest=ar[0];
		}
		
		for(int i=3;i<ar.length;i++)
		{
			if(ar[i]>largest)
			{
			smallest=largest;
			largest =ar[i];	
			}
			else if(ar[i]>smallest && ar[i]!=largest)
			{
				smallest=ar[i];
			}
		}
		return smallest;
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int n= sc.nextInt();
	int ar[]=new int[n];
	
	for(int i=0;i<ar.length;i++)
	{
		ar[i]=sc.nextInt();
		//System.out.print(" ");
	}
	
	int smallest =secondLargestElement(ar);
	System.out.println(smallest);
	sc.close();
	}

}
