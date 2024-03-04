package StaticMethodCallByClassNameWithoutCreateObject;

public class Test {

	public void m4() {
		System.out.println(A.x); //static variable
		A.m2();//static method thats why we can call without create object call only by class name
		//System.out.println(A.y);//error because instant variable
		//A.m1();//error because non static method
		
		A a=new A();
		System.out.println(a.y);
		a.m1();
	}
	
	public static void main(String[] args) {
		Test t=new Test();
		t.m4();
		 System.out.println(A.x);
		A.m2();
	}

}
