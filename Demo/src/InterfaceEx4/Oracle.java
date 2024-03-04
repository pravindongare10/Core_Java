package InterfaceEx4;

public class Oracle implements Connection {

	@Override
	public void commit() {
	System.out.println("oracle-commit");
		
	}

	@Override
	public void rollback() {
		System.out.println("oracle-rollback");
		
	}

}
