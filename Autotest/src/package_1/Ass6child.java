package package_1;
public class Ass6child extends Ass6parent
{
	public Ass6child() 
	{
		super(12,25);
		System.out.println("Child Default Constructor");
	}
	public Ass6child(int a) 
	{
		this(25,56,89);
		System.out.println("Child 1 parameterized Constructor");
	}
	public Ass6child(int a, int b) 
	{
		this(1,2,56,89);
		System.out.println("Child 2 parameterized Constructor");
	}
	public Ass6child(int a, int b, int c) 
	{
		this();
		System.out.println("Child 3 parameterized Constructor");
	}
	public Ass6child(int a, int b, int c, int d) 
	{
		this(89);
		System.out.println("Child 4 parameterized Constructor");
	}
	public static void main(String[] args){
		Ass6child ob=new Ass6child(12,14);	
	}
}
