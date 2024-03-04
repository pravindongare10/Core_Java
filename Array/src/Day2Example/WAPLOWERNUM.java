package Day2Example;

public class WAPLOWERNUM {

	public static void main(String[] args) {
		
		 int a[]= {11,44,77,55,22};
		 int min=a[0];
		 for(int i=1;i<=a.length-1;i++) {
		 if(min>a[i]) min=a[i]; 
		 }
		 System.out.println(min);
		/*
		 * int a[]= {11,44,77,55,22}; int min=a[0]; for(int i=1;i<=a.length-1;i++)
		 * if(a[0]>a[i]) min=a[i]; System.out.println(min);
		 */
	}

}
