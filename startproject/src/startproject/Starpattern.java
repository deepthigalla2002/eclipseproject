package startproject;

import java.util.Scanner;

public class Starpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<(n-1)-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0; k<=i ;k++)
			{
				if(k==0||k==i||i==(n-1))
				{
				System.out.print(k+1+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
