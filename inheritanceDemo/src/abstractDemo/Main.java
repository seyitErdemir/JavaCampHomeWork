package abstractDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager x=new CustomerManager();
		x.databaseManager=new OracleDatabaseManager();
		x.getCustomer();
	}

}
