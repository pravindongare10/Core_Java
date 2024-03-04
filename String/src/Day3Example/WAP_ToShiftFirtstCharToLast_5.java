package Day3Example;

public class WAP_ToShiftFirtstCharToLast_5 {

	public static void main(String[] args) {
		String s="International";
		StringBuilder sb=new StringBuilder("");
		for(int i=1;i<s.length();i++)
			sb.append(s.charAt(i));
		sb.append(s.charAt(0));
		System.out.println(sb);
	}

}
