package Practice;

public class SMax {

	public static void main(String[] args) {
		
		/*
		 * int a[]= {1,2,3,7,3,88,22,9}; int max=a[0]; int smax=0; for(int
		 * i=0;i<a.length;i++) { if(max<a[i]) { smax=max; max=a[i]; }
		 * if(smax<a[i]&&max>a[i]) { smax=a[i]; } } System.out.println(smax);
		 * System.out.println(max);
		 */
		
		        double num[] = {6.67, 12.3, 24.6, 33, 66.6, 1.5};
		        double output = 0;

		        for (int i = 0; i < 6; ++i) {
		            output = output + num[i];
		        }

		        System.out.print(output / 6);
		    
		}

	

}
