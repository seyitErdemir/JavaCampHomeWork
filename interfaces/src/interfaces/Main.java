package interfaces;


public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new EmailLogger());
		Customer seyit=new Customer(1,"seyit","erdemir" );
		customerManager.add(seyit);
		

		System.out.println("--------------------");
		
		
		Logger [] loggers= {new SmsLogger(),new EmailLogger() , new DatabaseLogger()};
		CustomerManager customerManagers = new CustomerManager(loggers);
		customerManagers.multiAdd(seyit);
	}

}
