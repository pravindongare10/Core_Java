package PreventSingleturn;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		Singleton s=Singleton.getStuSingletone();
		//Singleton s1=(Singleton) s.clone();
		System.out.println(s);
		//System.out.println(s1);
	}

}
