     package Day5Practice;

public class WAPToReverseEachWordsFromGiven {

	public static void main(String[] args) {
		 String s="i am java devloper";
		 
		 String s1[]=s.split(" ");
		 StringBuilder sb=new StringBuilder("");
		 for(int i=s1.length-1;i>=0;i--){
			 if(s1[i].length()!=0)
			 for(int j=s1[i].length()-1;j>=0;j--)
					 sb.append(s1[i].charAt(j));
					 sb.append(" ");
		 }
		 System.out.println(sb);
	}
		
}  