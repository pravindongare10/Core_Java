package Day3Example;

public class Vowels_2 {

	public static void main(String[] args) {
		String s="International";
		String s2=s.toLowerCase();
		int count=0;
		for(int i=0;i<s2.length();i++) 
			if(s2.charAt(i)=='a'||s2.charAt(i)=='e'||
					s2.charAt(i)=='i'||s2.charAt(i)=='o'||s2.charAt(i)=='u')
					count++;
			System.out.println(count);

	}

}
