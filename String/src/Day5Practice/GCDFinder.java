package Day5Practice;

public class GCDFinder {
	    public static void main(String[] args) {
	        int a = 12;
	        int b = 48;
	        
	        int min=0;
	        
	        if(a<b) {
	        	min=a;
	        }
	        else {
	        	min=b;
	        }
	        
	        for(int i=min;i>1;i--) {
	        	if(a%i==0&&b%i==0) {
	        		System.out.println(i);
	        		break;
	        	}
	        }
	
	    }
}