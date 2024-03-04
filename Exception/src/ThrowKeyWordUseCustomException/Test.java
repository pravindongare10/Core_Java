package ThrowKeyWordUseCustomException;

public class Test {
	//UncheckException 
	public void m1(int age) {
		System.out.println("m1-start");
		if(age<18)
		throw new ArithmeticException("Please Enter Valid Age");
		System.out.println("m1-end");
	}
	
	public static void main(String[] args) {
		System.out.println("main-start");
		Test t=new Test();
		try {
			t.m1(19);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("main-end");
	}

}
