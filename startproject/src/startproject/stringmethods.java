package startproject;

public class stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "TAp";
		System.out.println(s1);
		String s2=s1.concat("Academy");
		System.out.println(s2);
		System.out.println(" ");
		
		String s3 = " Deepthi ";
		System.out.println(s3.toUpperCase());
		System.out.println(s3.toLowerCase());
		System.out.println(s3.length());
		System.out.println(s3.charAt(3));
		System.out.println(s3.indexOf("e"));
		System.out.println(s3.startsWith("Dee"));
		System.out.println(s3.endsWith("hi"));
		System.out.println(s3.contains("eep"));
		System.out.println(s3.substring(4));
		System.out.println(s3.substring(3,7));
		System.out.println(s3.strip());
	}

}
