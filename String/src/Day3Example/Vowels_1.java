 package Day3Example;

public class Vowels_1 {

	public static void main(String[] args) {
		String s="International";
		int count=0;
		for(int i=0;i<s.length();i++) 
			if(s.charAt(i)=='A'||s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='E'||
					s.charAt(i)=='I'||s.charAt(i)=='i'||
					s.charAt(i)=='o'||s.charAt(i)=='O'||s.charAt(i)=='u'||s.charAt(i)=='U')
					count++;
			System.out.println(count);

	}

}
