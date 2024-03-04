package NumberFormatUnCheckException;

public class Test {

	public static void main(String[] args) {
		System.out.println("Prog start");
		
		int a=0;
		
		try {
			a=Integer.parseInt(args[0]);	
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		
		System.out.println(a); 
		System.out.println("Prog End");
	}
	
}
