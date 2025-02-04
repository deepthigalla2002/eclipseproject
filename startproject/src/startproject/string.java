package startproject;
public class string {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		String s1 ="Java";
		String s2 = "JAVA";
		if(s1==s2)
		{
			System.out.println("ref are equal");
		}
		else
		{
			System.out.println("ref are not equal");
		}
		if(s1==s2)
		{
			System.out.println("values are equal");
		}
		else
		{
			System.out.println("values are not equal");
		}
		
		if(s1.equals(s2))
		{
			System.out.println("values are equal");
		}
		else
		{
			System.out.println("values are not equal");
		}
		
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("values are equal");
		}
		else
		{
			System.out.println("values are not equal");
		}
	}

}
