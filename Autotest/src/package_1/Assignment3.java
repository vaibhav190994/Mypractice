package package_1;

public class Assignment3 {
	
	public int div(int a, int b) {
		int c;
		c = a/b;
		//System.out.println("Sum of A & B is"+c);
		return c;
	}
	
	public int sub(int x, int y) {
		return x-y;
	}
	public void mul(int v, int u) {
		System.out.println("SOlution is "+(v*u));
	}
		
	public int sum(int e, int f) {
		return e+f;
		
	}
	
	public static void main(String[] args) {
		Assignment3 vj=new Assignment3();
		int divr=vj.div(10, 2);
		int sub_1=vj.sub(divr, 2);
		int sub_final=vj.sub(sub_1,2);
		int sum_r=vj.sum(sub_final, 2);
		vj.mul(sum_r, 2);
	
		
	}

}
