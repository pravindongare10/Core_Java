package Day3Example;

public class Vowels_4Demo {
	public int CountVowels(String s) {
		String s1="aeiouAEIOU";
		int count=0;
		for(int i=0;i<=s.length()-1;i++)
			if(s1.contains(String.valueOf(s.charAt(i))))
			count++;
		
		return count;
	}

}
