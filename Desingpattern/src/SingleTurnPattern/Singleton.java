package SingleTurnPattern;

public class Singleton {
	
	private static Singleton singleton=null;
	
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
