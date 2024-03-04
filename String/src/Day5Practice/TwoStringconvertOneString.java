package Day5Practice;

import java.util.ArrayList;

public class TwoStringconvertOneString {

	public static void main(String[] args) {
		
		String s="Pravin";
		String s1="Rahul";
		
		//StringBuilder sb=new StringBuilder(" ");
		//sb.append(s);
		//sb.append(s1);
		//System.out.println(sb);
		
		
		int a[]= {2,3,4};
		int b[]= {6,5,3};
		
		ArrayList<Integer> clist=new ArrayList<>();
		
		for(int array1:a) {
			clist.add(array1);
		}
		
		for(int array2:b) {
			clist.add(array2);
		}
		
		System.out.println(clist);
	}

}
