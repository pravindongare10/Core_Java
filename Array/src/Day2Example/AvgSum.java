package Day2Example;

public class AvgSum {

	public static void main(String[] args) {
           int a[]= {11,22,44,55,77,88};
   		int sum=0; int count=0;
   		for(int i=0;i<=a.length-1;i++) {
   			if(a[i]%2==0) {
   				sum+=a[i];
   				count++;  
   			}
   		}
   		//Avrage off sum number
   		System.out.println((double)sum/count);
   		
	 }
 
}
