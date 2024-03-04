package ThrowKeywordUseCustomClass;

public class Test {
	
	public void m1(int age) throws AgeInvalidException {
		System.out.println("m1-start");
		if(age<18)
		throw new AgeInvalidException("Please Enter Valid Age");
		System.out.println("m1-end");
	}
	
	public static void main(String[] args) {
		System.out.println("main-start");
		Test t=new Test();
		try {
			t.m1(17);
		} catch (AgeInvalidException e) {
			e.printStackTrace();
		}
		System.out.println("main-end");
	}


}
