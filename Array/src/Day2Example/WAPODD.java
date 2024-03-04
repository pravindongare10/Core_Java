package Day2Example;

public class WAPODD {

	public static void main(String[] args) {
		int a[]= {2,3,4,5,6,7,77,77,44};
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
			}
		}
	}

}
