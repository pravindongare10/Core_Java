package ClassNotFoundCheckedException;

public class Test {

	public static void main(String[] args) {
	System.out.println("prog Start");
			try {
				Class c=Class.forName("ClassNotFoundCheckedException.Demo");
				Demo d=(Demo)c.newInstance();
				d.display();
			} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
	System.out.println("prog End");

	}

}
