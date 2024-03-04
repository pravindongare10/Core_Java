package Day1WayCreateObject;

public class ByReference {

	public static void main(String[] args) {
		char c []= {'Q','W','C'};
		String s=new String(c);
		String s1=s;
		System.out.println(s1);
	}

}
