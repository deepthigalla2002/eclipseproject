package startproject;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String reverse="";
	
	for(int i=s.length()-1;i>=0;i--)
	{
		reverse=reverse+s.charAt(i);
	}
	
	if(s.equals(reverse))
			{
				System.out.println("palindrome");
			}
	else
	{
		System.out.println("not palindrome");
	}
	
	

	}

}
