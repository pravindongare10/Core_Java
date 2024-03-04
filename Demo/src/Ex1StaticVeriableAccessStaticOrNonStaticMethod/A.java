package Ex1StaticVeriableAccessStaticOrNonStaticMethod;

public class A {
	
	static int x;
		   int y;
	
	public static void m1() {
		System.out.println(x);
		System.out.println(A.x);
		//System.out.println(y);//error
		//System.out.println(A.y);//error
		
		A a=new A();
		System.out.println(a.x);
		System.out.println(a.y);
	}	
	
	public void m2() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(A.x);
		//System.out.println(A.y);//error
		
		A a =new A();
		System.out.println(a.x);
		System.out.println(a.y);
	}

}
