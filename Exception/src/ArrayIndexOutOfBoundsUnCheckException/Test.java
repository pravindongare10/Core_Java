package ArrayIndexOutOfBoundsUnCheckException;

public class Test {

	public static void main(String[] args) {
		System.out.println("Prog Start");
		int a[]= {11,22,33};
		
		try {
			System.out.println(a[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("Prog End");
	}

}
