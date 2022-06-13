package interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICustomerDal xxx=new MySqlCustomerDal();
		IReporisitory xx=new MySqlCustomerDal();
		MySqlCustomerDal z=new MySqlCustomerDal();
		z.add();
		z.addd();
		xxx.add();
		xx.addd();
		
		ICustomerDal c=new MySqlCustomerDal();
		CustomerManager a=new CustomerManager(new SqlServerCustomerDal());
		a.xx=new SqlServerCustomerDal();
		c.add();
		
	}

}
