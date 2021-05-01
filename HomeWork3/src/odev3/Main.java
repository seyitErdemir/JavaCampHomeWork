package odev3;

public class Main {

	public static void main(String[] args) {
		

		//constracructor
		User user = new User();
		user.id=1;
		user.name="a";
		user.mail="aaaa";
		System.out.println(user.id+"  "+user.name+ "   "+user.mail);
		
		User user1 = new User(2,"ssss","ssssss");
		System.out.println(user1.id+"  "+user1.name+ "   "+user1.mail);
		//constracructor
		
		
		// inheritance v1
		StudentUser student1=new StudentUser();
		student1.add(user);
		student1.homeWorkComplete();
		
		
		
		
		 InstructorUser instructor1=new InstructorUser();
		 instructor1.add(user1);
		 instructor1.homeWorkControl();
		
		UserManager userManager=new UserManager();
		userManager.add(user1);
		
		User [] users = {user,user1};
		userManager.addMultiple(users);
		// inheritance v1
		
		
		
		
		
		
	}
	
	

}
