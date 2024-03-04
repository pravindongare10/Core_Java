package Day2Example;

public class Duplicate {
	
    public static void main(String args[]) {
        int a[]={33, 33, 22, 22, 77, 88};

        int[] temp = new int[a.length];
        int j=0; // Initialize j

        for (int i=0; i<a.length-1;i++) {
            if (a[i]!=a[i+1]) {
                temp[j]= a[i];
                j++;
            }
        }

        temp[j] = a[a.length-1];

        for (int i=0; i<=temp.length-1;i++) { // Fix the loop condition
            System.out.print(temp[i]+" ");
        }
    }
}

