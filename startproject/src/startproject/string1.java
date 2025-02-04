 package startproject;

public class string1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 ="JAVA";
		String s2 = "PYTHON";
		String s3 ="JAVA"+"PYTHON";
		String s4 = "JAVA"+"PYTHON";
		String s5 = s1+s2;
		String s6 = s1+s2;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		if(s3==s4)
		{
			System.out.println("Ref are equal");
		}
		else
		{
			System.out.println("Ref are not equal");
		}
		
		if(s3.equals(s4))
		{
			System.out.println("values are equal");
		}
		else
		{
			System.out.println("values are not equal");
		}
		
		if(s5==s6)
		{
			System.out.println("Ref are equal");
		}
		else
		{
			System.out.println("Ref are not equal");
		}
		
		if(s5.equals(s6))
		{
			System.out.println("values are equal");
		}
		else
		{
			System.out.println("values are not equal");
		}


	}

}
