package Day4Example;

public class CountMinWordLenghtAndPrintMinWord {

	public static void main(String[] args) {
		String s="i am java devloper , And im happy my Profession";
		
		String s1[]=s.split(" ");
		int min=s1[0].length();
		for(int i=0;i>s1.length;i++) {
			if(Character.isLetterOrDigit(s1[i].charAt(0))) {
				min=s1[i].length();
			}
			
		}
		for(int i=0;i<s1.length;i++) {
			if(Character.isLetterOrDigit(s1[i].charAt(0)))
			if(min==s1[i].length()) {
				System.out.println(s1[i]);
			}
		}
		System.out.println(min);
	}

}
