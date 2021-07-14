package package_1;

public class Assignment2 
{
	public int sum(int a, int b) {
		int c;
		c = a+b;
		//System.out.println("Sum of A & B is"+c);
		return c;
	}
	
	public int sub(int x, int y) {
		return x-y;
	}
	public int mul(int v, int u) {
		return v*u;
	}
	public void div(int e, int f) {
		System.out.println("SOlution is "+(e/f));
	}
	
	public static void main(String[] args) {
		Assignment2 vj=new Assignment2();
		int sum_1=vj.sum(10, 2);
		int sum_2=vj.sum(sum_1, 2);
		int subr=vj.sub(sum_2, 2);
		int mulr=vj.mul(subr, 2);
		vj.div(mulr, 2);
		
	}
}
