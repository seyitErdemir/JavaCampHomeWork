package Polymorph�smDemo;

public class CustomerManeger  {
	private BaseLogger logger;
	
	public CustomerManeger(BaseLogger logger) {
		this.logger=logger;
	}
	
	
	public void add() {
		System.out.println("m��teri eklendi");
		this.logger.log("log mesaj�");
	}

}
