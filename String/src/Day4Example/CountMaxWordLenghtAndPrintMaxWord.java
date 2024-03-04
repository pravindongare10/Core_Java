package Day4Example;

public class CountMaxWordLenghtAndPrintMaxWord {

	public static void main(String[] args) {
		String s="i am java devloper , And im happy my Profession";
		
		String s1[]=s.split(" ");
		int max=0;
		for(int i=0;i<s1.length;i++) {
			if(max<=s1[i].length()) {
				max=s1[i].length();
			}
			
		}
		for(int i=0;i<s1.length;i++) {
			if(max==s1[i].length()) {
				System.out.println(s1[i]);
			}
		}
		System.out.println(max);
	}

}
