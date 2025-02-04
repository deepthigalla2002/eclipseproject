package startproject;
import java.util.Scanner;

public class Triangle_num_pattern {

	public static void main(String[] args) {
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
				System.out.print(k+1+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
