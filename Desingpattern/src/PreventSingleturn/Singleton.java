package PreventSingleturn;

public class Singleton implements Cloneable {
	
	private static Singleton singleton=null;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
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
