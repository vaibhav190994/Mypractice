package package_1;

public class Ass6parent 
{
	public Ass6parent() 
	{
		this(12,25,59);
		System.out.println("Parent Default Constructor");
	}
	public Ass6parent(int a) 
	{
		this();
		System.out.println("Parent 1 Parameterized Constructor");
	}
	public Ass6parent(int a, int b) 
	{
		this(12,25,69,59);
		System.out.println("Parent 2 Parameterized Constructor");
	}
	public Ass6parent(int a, int b, int c) 
	{
		System.out.println("Parent 3 Parameterized Constructor");
	}
	public Ass6parent(int a, int b, int c, int d) 
	{
		this(12);
		System.out.println("Parent 4 Parameterized Constructor");
	}
}
