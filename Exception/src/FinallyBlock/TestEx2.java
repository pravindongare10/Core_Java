package FinallyBlock;

public class TestEx2 {

	public static void main(String[] args) {
		System.out.println("Prog Start");
		try {
			int a=10/0;
		} catch (ArithmeticException e) {
			System.out.println("CATCHBLOCK"+e);
		}
		finally {
			System.out.println("resorce End");
		}
		System.out.println("prog End");
	}

}
