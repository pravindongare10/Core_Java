package LogicalPattern;

public class Pattern4 {
public static void main(String args[]) {
	//MirroredRightTrianglePattern 
	//orLeftTrianglePattern
	int n=5;
	for(int i=1;i<=n;i++) {
		for(int k=i;k<n;k++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}











   