package how_to_create_array_object;

public class ByUsingRefrance {
	
	public static void main(String args[]) {
		int a []= {11,22,33,44,55};
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		int b[]=a;
		System.out.println(a==b);//true
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);
		System.out.println(b[4]);
	}

}
