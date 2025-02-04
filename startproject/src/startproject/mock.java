package startproject;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
//
//public class mock {
//
//	public static void main(String[] args) {
//		
//		Scanner scanner=new Scanner(System.in);
//		String s=scanner.nextLine();
//		
//		String arr[]=s.split(" ");
//		
//		for(int size=1;size<=s.length();size++)
//		{
//				printsubstring(s,size);
//		}
//		
//		
//				
//	}
//	public static boolean ispalindrome(String s)
//	{
//		int i=0;
//		int j=s.length()-1;
//		while(i<=j)
//		{
//			if(s.charAt(i)==s.charAt(j))
//			{
//				i++;
//				j--;
//			}
//			else
//			{
//				return false;
//			}
//			
//			
//		}
//		return true;
//	}
//	
////	public static void substring(String arr[],int size)
////	{
////		for(int i=0;i<arr.length-size;i++)
////		{
////			for(int j=i;j<i+size;j++)
////			{
////				System.out.println(ispalindrome(arr));
////
////			}
////		}
////	}
//	
//	public static void printsubstring(String s,int size)
//	{
//		for(int i=0;i<s.length()-size;i++)
//		{
//			String t="";
//			for(int j=i;j<i+size;j++)
//			{
//				t=t+s.charAt(j);
//
//			}
//		
//			if(ispalindrome(t))
//			{
//					//System.out.println(t);
//				longest(t);
//			}
//		
//		}
//	}
//	
//	public static void longest(String t)
//	{
//		String longest="";
//		int len=0;
//		
//		if(t.length()>len)
//		{
//			longest=t;
//			len=t.length();
//		}
//		System.out.println(t);

		
		
		
		
		

		class Customer implements Comparable<Customer>{
			private int id;
			private String name;
			private int thing;
			private int cost;
			
			
			
			public Customer() {
				// TODO Auto-generated constructor stub
			}

			public void addPurchases(int cost) {
				this.thing++;
				this.cost+=cost;
			}
			public int getId() {
				return id;
			}
			public int setId(int id) {
				return this.id = id;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getThing() {
				return thing;
			}
			public void setThing(int thing) {
				this.thing = thing;
			}
			public int getCost() {
				return cost;
			}
			public void setCost(int cost) {
				this.cost = cost;
			}
			
			@Override
			public String toString() {
				
				return id+","+name+","+cost;
			}
			
			
			@Override
			public int compareTo(Customer c) {
				Customer a=this;
				Integer thing1=a.thing;
				Integer thing2=c.thing;
				
				if(thing1==thing2) {
					Integer cost1=a.cost;
					Integer cost2=c.cost;
					
					return -1*(cost1.compareTo(cost2));
				}
				
				
				return (-1)*thing1.compareTo(thing2);
			}
			
			
		}

		public class mock {

			public static void main(String[] args) {
				// TODO Auto-generated method stub

				Scanner scanner=new Scanner(System.in);
				
				Set<Customer> set=new TreeSet<Customer>();	
				
				Map<Integer,Customer> map=new HashMap<Integer,Customer>();
				
				while(true) {
					String s=scanner.nextLine();
					if(s.isEmpty()) break;
					
					
					
					String[] ar=s.split(",");
					int id1=Integer.parseInt(ar[0]);
					String name1=ar[1];
					int cost1=Integer.parseInt(ar[3]);
					
					if(!map.containsKey(id1)){
						
						Customer c=new Customer();
						c.setCost(cost1);
						c.setId(id1);
						c.setName(name1);
						map.put(id1,c);	
						set.add(c);
					}else {
						Customer c=map.get(id1);
						set.remove(c);
						c.addPurchases(cost1);
						set.add(c);
					}	
					
				}
				for(Customer s:set) {
					System.out.println(s);
				}
				
				
			}

		}

