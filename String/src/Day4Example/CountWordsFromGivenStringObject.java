      package Day4Example;

public class CountWordsFromGivenStringObject {

	public static void main(String[] args) {
		String s="i am java devloper";
		int count=0;
		for(int i=0;i<s.split(" ").length;i++) {
			if(s.split(" ")[i].length() !=0) {
				count++;
			}
		}
		System.out.println(count);
	}
	
}
 