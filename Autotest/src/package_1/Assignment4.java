package package_1;

public class Assignment4
{
	public Assignment4() 
	{
		this(12,12,14);
		System.out.println("This is Default Constructor");
	}
		public Assignment4(int a, int b, int c) 
	{
		System.out.println("This is 3 Parameterised Constructor");
	}
		public Assignment4(int a, int b, int c, int d) 
	{
		this(25);
		System.out.println("This is 4 Parameterised Constructor");
	}
		public Assignment4(int a, int b) 
	{
		this(12,15,14,18);
		System.out.println("This is 2 Parameterised Constructor");
	}
		public Assignment4(int a) 
	{
		this();
		System.out.println("This is 1 Parameterised Constructor");
	}
		public static void main(String[] args) 
	{
			Assignment4 ob=new Assignment4(12,14);
	}
}
