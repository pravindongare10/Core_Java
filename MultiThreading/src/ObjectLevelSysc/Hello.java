package ObjectLevelSysc;

public class Hello {
	
	public synchronized void display(String msg) {
		
		System.out.println("[");
		
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(msg);
		System.out.println("]");
	}

}
