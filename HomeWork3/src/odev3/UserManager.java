package odev3;

public class UserManager {
	public void add(User user) {
		System.out.println("---------------------------");
		System.out.println(user.id + "  id kaydedildi");
		System.out.println(user.name + "  name kaydedildi");
		System.out.println(user.mail + "  mail kaydedildi");

		System.out.println("---------------------------");
		
	}
	public void addMultiple(User[] users) {
		for(User user:users) {
			add(user);
			
		}
		
	}
}
