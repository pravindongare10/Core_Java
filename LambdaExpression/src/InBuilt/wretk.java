package InBuilt;

import java.util.function.ToIntBiFunction;

public class wretk {
	public static void main(String[] args) {
		ToIntBiFunction<Integer,Integer> i=(a,b)->a+b;

		
		int x=i.applyAsInt(4,5);
		System.out.println(x);
	};
		
}
