package FunctionIntrface;

public class A {

	public static void main(String[] args) {
		
		I i=(a,b)->{
			int c=a+b;
			System.out.println(c);
		};
		
		i.m1(10, 4);
	}

}
