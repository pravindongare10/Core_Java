package MultithreadingImplementRunnablei;

public class Test {

	public static void main(String[] args) {
		NumberG even=new NumberG(1,100);
		NumberG odd=new NumberG(2, 100);
		Thread t=new Thread(even);
		Thread t1=new Thread(odd);
		t.start();
		t1.start();
	}

}
