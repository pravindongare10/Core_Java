package InterfaceEx4;

public class Mysql implements Connection {

	@Override
	public void commit() {
	System.out.println("Mysql-commit");
		
	}

	@Override
	public void rollback() {
	System.out.println("Mysql-rollback");
		
	}

}
