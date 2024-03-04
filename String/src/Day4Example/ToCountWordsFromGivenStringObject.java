  package Day4Example;

public class ToCountWordsFromGivenStringObject {

	public static void main(String[] args) {
		String s="i am java devloper";
		int count=0;
		String s1[] =s.split(" ");
		for(int i=0;i<s1.length;i++) {
			if(s1[i].length()!=0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
