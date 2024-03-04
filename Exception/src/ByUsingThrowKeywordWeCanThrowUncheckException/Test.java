package ByUsingThrowKeywordWeCanThrowUncheckException;

public class Test {

	public static void main(String[] args) {
		System.out.println("Prog Start");
		
		A a=new A();
		try {
			a.login("abc@gmail.com","Abc@123");
		} catch (Exception e) {
			System.out.println(e);
		}
	
		System.out.println("Prog End");

	}

}
