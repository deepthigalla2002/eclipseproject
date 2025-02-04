package startproject;

import java.util.Scanner;

public class practice {
	
	    public static String mergeAlternately(String word1, String word2) {
	        for(int i=0;i<word1.length();i++)
	        {
	            System.out.print(word1.charAt(i));
	            for(int j=i;j<word2.length();j++)
	            {
	            System.out.print(word2.charAt(j)+"");
	            break;
	            }
	           
	        }
	       return null;
	    }

	    public static void main(String args[])
	    {
	        Scanner sc=new Scanner(System.in);
	        String s1=sc.nextLine();
	        String s2=sc.nextLine();
	        mergeAlternately(s1,s2);
	    }
	
}
