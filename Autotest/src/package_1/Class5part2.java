//Class 5  Program 2 Part 2   Dynamic Polymorhism OR Method overriding


package package_1;

public class Class5part2 extends Class5 
{
	public void brandName()		// method one	{
	{	
		System.out.println("Brand Name is ABC");
	}
	
	public void price(int price)		// method two
	{	
		System.out.println("Very Nominal Price is " +price);
	}
	
	public static void main(String[] args) {
		Class5part2 ob=new Class5part2();
		ob.brandName();
		ob.price(12546);
	}
}
