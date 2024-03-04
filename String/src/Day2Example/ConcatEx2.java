package Day2Example;

public class ConcatEx2 {

	public static void main(String[] args) {
		String s1="Bharat";
		String s2="India";
		String s3="Bharat";
		String s4=new String("India");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s4);
		System.out.println(s2.equals(s4));
		
		String s5="Honda"; 
		s5=s5.concat("new");
		System.out.println(s5);
	}

}
