package Day4Example;

public class StringRepeted {

	public static void main(String[] args) {
		
        String codeToRepeat = "ABCDEF";
        int repeatCount = 3;
    
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < repeatCount; i++) {
            result.append(codeToRepeat);
        }
        
        System.out.println(result);
    }	       


}
