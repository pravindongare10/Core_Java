package FuctionalInterfaceuse;

public class A {

	public static void main(String[] args) {
		
		I i=(a,b)->{
			int c=a+b;
			return c;
		};
		
		int x=i.m1(1, 5);
		System.out.println(x);
	}

}
