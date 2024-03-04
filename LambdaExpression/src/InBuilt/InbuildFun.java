package InBuilt;
import java.util.function.ToIntBiFunction;

public class InbuildFun {
	
public static void main(String[] args) {
		
		ToIntBiFunction<Integer,Integer> i=(a,b)->{
			int c=a+b;
			return c;
		};
		
		int x=i.applyAsInt(1, 5);
		System.out.println(x);
	}

}
