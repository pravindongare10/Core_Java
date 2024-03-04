package UnCheckedExceptionNotUseThrowsKeywordUseOnlyCheckedException;

public class TestEx1 {

	public void m1() {
		System.out.println("m1-sart");
		
		int x=100/0;
	
		System.out.println("m1-end");
	}
	
	public static void main(String[] args) {
		System.out.println("main-start");
	TestEx1 t=new TestEx1();
		try {
			t.m1();
		} catch (ArithmeticException e) {
		System.out.println(e);
		}
		System.out.println("main-end");
	}

}
