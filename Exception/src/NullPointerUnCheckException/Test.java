package NullPointerUnCheckException;

public class Test {

	public static void main(String[] args) {
		System.out.println("Prog Start");
		A a=null;
		try {
			a.display();
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		
		System.out.println("Prog End");
		System.out.println(a);
	}

}
