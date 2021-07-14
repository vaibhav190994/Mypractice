// Class 6 part 2 Program 1 		// Method as final in parent class can't be override	


//package package_1;
//
//public class Class6part2 extends Class6
//{
//	public void second()				// We can't override this method because it is final in parent class
//	{
//		System.out.println("Child class method");
//	}
//	
//}



//Class 6 part 2 Program 2 		// Extends final class


package package_1;

public class Class6part2 extends Class6				// class6 can't be inherit(extends) because it is final class
{
	public void second()			
	{
		System.out.println("Child class method");
	}

}
