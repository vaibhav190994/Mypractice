package package_1;

public class Assignment23
{
	public static void main(String[] args) {
		int z=1;
		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=z; k++)
			{
				System.out.print("*");
			}
			z=z+2;
			System.out.println();

		}
	}
}
