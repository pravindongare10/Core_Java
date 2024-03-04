package UnCheckedExceptionNotUseThrowsKeywordUseOnlyCheckedException;

public class TestEx2 {
	 public void m1() throws ClassNotFoundException {
		 Class.forName("UnCheckedExceptionNotUseThrowsKeywordUseOnlyCheckedException.TestEx1");
	 }
	 public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("main-start");
		TestEx2 t=new TestEx2();
		try {
			t.m1();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("main-end");
	}
}