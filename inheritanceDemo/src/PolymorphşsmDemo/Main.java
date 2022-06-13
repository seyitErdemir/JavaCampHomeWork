package PolymorphþsmDemo;

public class Main {

	public static void main(String[] args) {
//		BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new EmailLogger(), new DataBaseLogger(),
//				new ConsoleLogger() };
//		for (BaseLogger logger : loggers) {
//			logger.Log("logggg");
//		}
	
	
		CustomerManeger customerManger= new CustomerManeger(new FileLogger());
		customerManger.add();
	
	
	
	}
	}

