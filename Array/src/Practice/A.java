package Practice;

public class A {

	public static void main(String[] args) {
		
		int a[]= {2,5,8,3,7,3,4,4,3,5};
		
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}	
		}
	
		
		int[] tp=new int[a.length];
		int j = 0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				tp[j]=a[i];
				j++;
			}
			tp[j]=a[a.length-1];
		}
		for(int c:tp) {
			System.out.println(c);
		}
	}

}
 