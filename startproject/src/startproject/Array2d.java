package startproject;
import java.util.Scanner;
public class Array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] a=new int[2][5];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter ages: ");
			for(int k=0;k<a[i].length;k++)
			{
			  a[i][k] = sc.nextInt();
			}
			
		}
		System.out.println("ages: ");
		for(int i=0;i<a.length;i++)
		{
			for(int k=0;k<a[i].length;k++)
			{
				
				System.out.print(a[i][k]+" ");
			}
			System.out.println(" ");
		}
		sc.close();
	}

}
