package startproject;

public class Mutablestring {

	public static void main(String[] args) {
		StringBuffer st = new StringBuffer();
		System.out.println(st.capacity());
		
		st.append("JAVA");
		System.out.println(st);
		System.out.println(st.length());
		System.out.println(st.capacity());
		
		st.append("JAVASCRIPT");
		System.out.println(st);
		System.out.println(st.length());
		System.out.println(st.capacity());
		
		st.append("PYTHON");
		System.out.println(st);
		System.out.println(st.length());
		System.out.println(st.capacity());
		
		st.append("DEEPTHI");
		System.out.println(st);
		st.trimToSize();
		System.out.println(st.length());
		System.out.println(st.capacity());
		System.out.println(st.replace(0, 6, "aaa"));
		System.out.println(st.charAt(2));
		

	}

}
