package Day4Example;

public class CountSpecialCharector {

	public static void main(String[] args) {
		String s="hello how are you??? i am fine,. thank you !!!";
		
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(!(Character.isLetterOrDigit(s.charAt(i))||Character.isWhitespace(s.charAt(i))))
			count++;
		}
		System.out.println(count);
	}

}
