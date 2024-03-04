package Day2Example;

public class RepetedArray {

	public static void main(String[] args) {
		
		String city[]= {"Mumbai","Pune","Pune","Nashik"};
			String Result="null";
			int Maxcount=0;
			for(int i=0;i<city.length;i++) {
				int count=1;
				String str="null";
				for(int j=i+1;j<city.length;j++) {
					if(city[i]==city[j]) {
						str=city[i];
						count++;
					}
				}
				if(Maxcount<count) {
					Maxcount=count;
					Result=str;
				}
			}
			System.out.println(Maxcount);
			System.out.println(Result);
		
	}  

}
