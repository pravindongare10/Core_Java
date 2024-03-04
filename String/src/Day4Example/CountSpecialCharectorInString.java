package Day4Example;

public class CountSpecialCharectorInString {

	public static void main(String[] args) {
		String s="hello@123.com";
        StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<s.length();i++) {
			if((Character.isLetterOrDigit(s.charAt(i))||Character.isWhitespace(s.charAt(i))))
			sb.append(s.charAt(i));
		}
		System.out.println(sb);
		
	}

}
