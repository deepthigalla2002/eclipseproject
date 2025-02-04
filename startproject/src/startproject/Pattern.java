package startproject;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int count=i;
			for(int j=1; j<=(n-i)+1;j++)
			{
				if(i==1||j==1||j==(n-i)+1) 
				{
				System.out.print(count+++" ");
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
