package CoreBasic;

public class Calculator {
	
	public void add() {
		System.out.println("addition"+(5+5));
	}
	
	public void mul() {
		System.out.println("multiplication"+(5*5));
	}
	
	
	public static void main(String args[]) {
		
		Calculator c=new Calculator();
		c.add();
		c.mul();
	}

}
