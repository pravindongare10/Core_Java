package Practice;

public class AvgSumNumber {
	public static void main(String[] args) {
		int a[]= {22,11,34,44,66,5,4,8};
		int count=0;
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				sum+=a[i];
				count++;
			}
		}
		System.out.println(sum/count);
	}
	
}
