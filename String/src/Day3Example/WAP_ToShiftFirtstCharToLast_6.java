 package Day3Example;

import Day2Example.CharAt;

public class WAP_ToShiftFirtstCharToLast_6 {

	public static void main(String[] args) {
		String s="International";
		/*
		 * StringBuilder sb=new StringBuilder(s.substring(1,s.length()));
		 * sb.append(s.charAt(0)); System.out.println(sb);
		 */
		StringBuilder sb=new StringBuilder(s.substring(2,s.length()));
		sb.append(s.charAt(0));
		sb.append(s.charAt(1));
		System.out.println(sb);
	}

}
