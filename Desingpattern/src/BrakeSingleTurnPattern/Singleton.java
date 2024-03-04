package BrakeSingleTurnPattern;

public class Singleton implements Cloneable {
	
	private static Singleton singleton=null;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	private Singleton() {
		
	}
	
	public static Singleton getStuSingletone() {
		if(singleton==null) {
			singleton=new Singleton();
			return singleton;
		}
		else {
		return singleton;
		}
	}
}
