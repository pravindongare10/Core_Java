package ReturnType;

public class A {
	
	public int m1(int m,int n) {
		B b=new B();
		int addition=b.m2(m,n);
		return addition;
	}

}
