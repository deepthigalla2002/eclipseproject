package startproject;
import java.util.Scanner;
public class Square_num_pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
