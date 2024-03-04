package CoreBasic;

public class Constuctor {
      int a;
      int b;
	
	public Constuctor(int a,int b) {
		this.a=a;
		this.b=b; 
	}
	
	public static void main(String[] args) {
		Constuctor a1=new Constuctor(4,4);
		System.out.println(a1.a);
		System.out.println(a1.b);
	}

}
