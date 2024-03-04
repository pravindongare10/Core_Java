package ObjectLevelSysc;

public class Test {

	public static void main(String[] args) {
		Hello h=new Hello();
		Hello h1=new Hello();
		
		MyThread t1=new MyThread(h,"java");
		MyThread t2=new MyThread(h,"classes");
		MyThread t3=new MyThread(h1,"python");
		MyThread t4=new MyThread(h1,"pune");
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
