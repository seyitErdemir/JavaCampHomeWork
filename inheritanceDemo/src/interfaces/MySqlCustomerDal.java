package interfaces;

public class MySqlCustomerDal implements ICustomerDal , IReporisitory{
	@Override
	public void add() {
		System.out.println("my sql eklendi");
		
	}@Override
	public void addd() {
		// TODO Auto-generated method stub
		System.out.println("repo güüncelledi");
	}
}
