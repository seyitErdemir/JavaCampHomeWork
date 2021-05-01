package odev3;

public class Main {

	public static void main(String[] args) {
		StudentUser student1=new StudentUser();
		student1.id=5;
		student1.mail="a@gmail.com";
		student1.name="at";
		
		 InstructorUser instructor1=new InstructorUser();
		 instructor1.id=2;
		 instructor1.mail="aaa@gmail.com";
		 instructor1.name="aaa";
		
		UserManager userManager=new UserManager();
		
		
		User [] users= { student1,instructor1} ;
		
		userManager.addMultiple(users);
		
		
		userManager.add(student1);
		userManager.add(instructor1);
	}
	
	

}
