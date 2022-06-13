package PolymorphþsmDemo;

public class CustomerManeger  {
	private BaseLogger logger;
	
	public CustomerManeger(BaseLogger logger) {
		this.logger=logger;
	}
	
	
	public void add() {
		System.out.println("müþteri eklendi");
		this.logger.log("log mesajý");
	}

}
