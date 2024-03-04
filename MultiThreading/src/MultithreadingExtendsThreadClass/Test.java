package MultithreadingExtendsThreadClass;

public class Test {

	public static void main(String[] args) {
		NumberG even=new NumberG(1,100);
		NumberG odd=new NumberG(2, 100);
		even.start();
		odd.start();
	}

}
