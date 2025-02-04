package startproject;

import java.util.Scanner;


public class UniqueSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				sum=sum+Character.getNumericValue(s.charAt(i));
			}
		}
		System.out.println(sum);
		
		
	}
}





