package Practice;

public class SecondMax {

	public static void main(String[] args) {
		int max=0;
		int smax=0;
		int a[]= {22,33,11,23,77,33};
		
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				smax=max;
				max=a[i];
				
			}
			if(max>a[i]&&smax<a[i]) {
				smax=a[i];
			} 
		}
		System.out.println(max);
		System.out.println(smax);
	}

}
