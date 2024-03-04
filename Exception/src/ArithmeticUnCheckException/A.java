package ArithmeticUnCheckException;

public class A {
//ArithmeticException
	public static void main(String[] args) {
		System.out.println("Prog Start");
		try {
			int x=10/0;
		} catch (ArithmeticException e) {
			System.out.println("Catch Block handle exception"+e);
		}
		System.out.println("Prog End");
		
	}

}
