package interfaces;

public class CustomerManager  {
	ICustomerDal xx;
	
	public CustomerManager(ICustomerDal xx) {
		xx.add(); 
	}
	
	
	public void add() {
		xx.add();
	}
}
