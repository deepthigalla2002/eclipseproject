package startproject;
import java.util.Scanner;

	class MenuItem
	{
		protected int itemid;
		protected String itemname;
		protected float price;
		protected String category;
		
		public MenuItem() {
			// TODO Auto-generated constructor stub
		}

		public MenuItem(int itemid, String itemname, float price, String category) {
			super();
			this.itemid = itemid;
			this.itemname = itemname;
			this.price = price;
			this.category = category;
		}

		public int getItemid() {
			return itemid;
		}

		public void setItemid(int itemid) {
			this.itemid = itemid;
		}

		public String getItemname() {
			return itemname;
		}

		public void setItemname(String itemname) {
			this.itemname = itemname;
		}

		public float getPrice() {
			return price;
		}

		public void setPrice(float price) {
			this.price = price;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}
		
		public void display()
		{
			System.out.println("Menuitem : "+itemid);
			System.out.println("Item name: "+itemname);
			System.out.println("Price: "+price);
			System.out.println("Category: "+category);
		}
		
	}
	
	class Bevarage extends MenuItem
	{
		protected float caffineContent;
		
		public Bevarage() {
			// TODO Auto-generated constructor stub
		}
		
		
		public Bevarage(int itemid, String itemname, float price, String category,float caffineContent) {
			super(itemid,itemname,price,category);
			this.caffineContent = caffineContent;
		}


		public float getCaffineContent() {
			return caffineContent;
		}


		public void setCaffineContent(float caffineContent) {
			this.caffineContent = caffineContent;
		}
		
		public void display()
		{
			super.display();
			System.out.println("Caffinecontent: "+caffineContent);
		}
		
		
		
	}
		
	class MainCourse extends MenuItem
	{
			protected float calories;
			protected String cusineType;
			
			public MainCourse() {
				// TODO Auto-generated constructor stub
			}
			
			public MainCourse(int itemid, String itemname, float price, String category,float calories, String cusineType) {
				super(itemid,itemname,price,category);
				this.calories = calories;
				this.cusineType = cusineType;
			}
			
			public float getCalories() {
				return calories;
			}
			
			public void setCalories(float calories) {
				this.calories = calories;
			}
			
			public String getCusineType() {
				return cusineType;
			}
			
			public void setCusineType(String cusineType) {
				this.cusineType = cusineType;
			}
			public void display()
			{
				super.display();
				System.out.println("Calories: "+calories+"\nCusineTupe: "+cusineType);
			}
			
		}
	
	class factory
	{
		static Scanner scan=new Scanner(System.in);
		public static MenuItem getMenuItem(String choice)
		{
			
			System.out.println("Enter Menuitem");
			String s = scan.next();
			
			String[] ar=s.split(",");
			
			int itemId=101;
			String itemname=ar[0];
			Float price =Float.parseFloat(ar[1]);
			String category=ar[2];
			
			if(choice.equalsIgnoreCase("Beverage"))
			 {

					
					float caffineContent=Float.parseFloat(ar[3]);
					
					Bevarage b = new Bevarage(itemId,itemname,price,category,caffineContent);
					return b;
			 }
			 else if(choice.equalsIgnoreCase("Maincourse"))
			 {
					float calories=Float.parseFloat(ar[3]);
					String cusineType=ar[4];
					
					MainCourse c = new MainCourse(itemId,itemname,price,category,calories,cusineType);
					return c;
					
			 }
			 else
			 {
				 return null;
			 }
		 }
		
	}
	public class Hw {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your choice\r\n"+"Bevarage\r\n"+"Maincourse");
		String choice = scan.next();
		
		MenuItem item=factory.getMenuItem(choice);
		item.display();
	}
}


