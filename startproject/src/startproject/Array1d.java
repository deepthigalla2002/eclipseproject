package startproject;
import java.util.Scanner;
public class Array1d {

	public static void main(String[] args) {
		System.out.println("Enter n value");
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[] a = new int[5];
		
		System.out.println("Enter "+n+" ages: ");
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Ages are: ");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		sc.close();
	}

}
