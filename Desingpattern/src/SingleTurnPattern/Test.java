package SingleTurnPattern;

public class Test {

	public static void main(String[] args) {
		Singleton s=Singleton.getStuSingletone();
		Singleton s1=Singleton.getStuSingletone();
		System.out.println(s);
		System.out.println(s1);
	}

}
