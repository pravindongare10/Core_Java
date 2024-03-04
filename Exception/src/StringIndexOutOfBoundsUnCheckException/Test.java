package StringIndexOutOfBoundsUnCheckException;

public class Test {

	public static void main(String[] args) {
		System.out.println("Prog Start");
		String name= "Pravin";
		
		try {
			System.out.println(name.charAt(6));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("Prog End");
	}


}
