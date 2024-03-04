package Day2Example;

public class WAPMAXNUM {

	public static void main(String[] args) {
		/*
		 * int a[]= {22,11,33,10,55}; int max=a[0]; for(int i=1;i<=a.length-1;i++)
		 * if(max<a[i]) max=a[i]; System.out.println(max);
		 */
		
		/*
		 * int a[]= {22,11,33,10,55}; int max=a[0]; for(int i=1;i<a.length;i++) {
		 * if(max<a[i]) max=a[i]; } System.out.println(max);
		 */
		int a[]= {11,22,33,44,45};
		int max =a[0];   
		for(int i=0;i<a.length;i++) {
			if(a[0]<a[i]) {
				max=a[i];
			}
		}
		System.out.println(max);
	}
}
