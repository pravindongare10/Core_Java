package Day4Example;

public class CountOnlyWord {

	public static void main(String[] args) {
		String s="hello how are you??? i am fine,. thank you !!!";
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<s.length();i++) {
			if((Character.isLetterOrDigit(s.charAt(i))||Character.isWhitespace(s.charAt(i))))
			sb.append(s.charAt(i));
		}
		System.out.println(sb);
	}

}
