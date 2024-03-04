package Day3Example;

public class Vowels_3 {
	public static void main(String[] args) {
		
		String s="International";
		/*
		 * String s1="aeiouAEIOU"; int count=0; for(int i=0;i<=s.length()-1;i++)
		 * if(s1.contains(String.valueOf(s.charAt(i)))) count++;
		 * System.out.println(count);
		 */
		int count=0;
		String s1="aeoiuAEOIU";
		for(int i=0;i<s.length();i++) 
			if(s1.contains(String.valueOf(s.charAt(i))))
				count++;
			System.out.println(count);
		
	}
}
