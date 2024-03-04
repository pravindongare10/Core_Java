package StaticMethodCallByClassNameWithoutCreateObject;

public class A {
	
	 static int x;
	 		int y;
	 
	public void m1() {
		System.out.println("nonstatic-method");
	} 
	public static void m2() {
		System.out.println("static-method");
	}

}
