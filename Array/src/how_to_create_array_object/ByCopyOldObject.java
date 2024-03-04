package how_to_create_array_object;

public class ByCopyOldObject {
	public static void main(String args[]) {
		int a []= {11,22,33,44,55};
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		int b[]=new int[a.length];
		
		b[0]=a[0];
		b[1]=a[1];
		b[2]=a[2];
		b[3]=a[3];
		b[4]=a[4];
		System.out.println(a==b);//false
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);
		System.out.println(b[4]);
	}

}
