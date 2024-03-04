  package InterfaceEx4;

public class Test {

	public static void main(String[] args) {
		Connection m=new Mysql();
		m.commit();
		m.rollback();
	}

}
