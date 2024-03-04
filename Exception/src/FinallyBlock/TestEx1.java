package FinallyBlock;

public class TestEx1 {

	public static void main(String[] args) {
		System.out.println("Main Start");
		
		try {
			int x =10/2;
		} finally {
		System.out.println("Finally");
		}
		
		System.out.println("Main End");
	}

}
