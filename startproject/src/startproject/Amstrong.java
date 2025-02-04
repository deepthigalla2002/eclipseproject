package startproject;
import java.util.Scanner;
public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		square(n);
	}
	public static void square(int n)
	{
		boolean found=false;
		if(n==1)
		{
			System.out.println("square");
		}
	    while(n>1)
	    {
	    	if(n%2!=0 || n<2)
	    	{
	    		found=false;
	    	}
	    	else
	    	{
	    		found=true;
	    	}
	    	n=n/2;
	    }
	    
	    if(!found)
	    {
	    	System.out.println("not square");
	    }
	    else
	    {
	    	System.out.println("square");
	    }
		
	
	}
		
		

	
}
