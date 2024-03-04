package ClassLevelSysc;

public class MyThread extends Thread{
		Hello h;
		String msg;
		
		public MyThread(Hello h,String msg) {
			super();
			this.h=h;
			this.msg=msg;
		}
		@Override
		public void run() {
			h.display(msg);
		}

	

}
