package Day2Example;

public class FIRST_SECOND_MAX_NUM {

	public static void main(String[] args) {
		
		int a[]= {22,77,55,5,8,88,67};
		int Max=a[0];
		int Smax=0;
		for(int i=1;i<a.length;i++) {
			if(Max<a[i]) {
				Smax=Max;
				Max=a[i];
			}
			if(Smax<a[i]&&Max>a[i]) {
				Smax=a[i];
			}
		}
		System.out.println(Max);
		System.out.println(Smax);
	}

}
