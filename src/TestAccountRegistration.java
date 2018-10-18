
public class TestAccountRegistration {
	public static void main (String args[]){
		
		//Medu object
		AccountRegistration medu = new AccountRegistration();
		medu.setUsername("Medu");
		medu.setEmailAddress("medu@yahoo.com");
		medu.setPassword("654321");
		medu.setConfirmPassword("654321");
		medu.setAge(26);
		
		String meduUsername = medu.getUsername();
		String meduEmailAddress = medu.getEmailAddress();
		String meduPassword = medu.getPassword();
		String meduConfirmPassword = medu.getConfirmPassword();
		int meduAge = medu.getAge();
		
		System.out.println("Username: " + meduUsername);
		System.out.println("Email: " + meduEmailAddress);
		System.out.println("Password: " + meduPassword);
		System.out.println("Confirm Passwowrd: " + meduConfirmPassword);
		System.out.println("Age; " + meduAge);
		
		//Elias object
		AccountRegistration elias = new AccountRegistration();
		elias.setUsername("Elias2211");
		elias.setEmailAddress("elias2211@gmail.com");
		elias.setPassword("123456");
		elias.setConfirmPassword("123456");
		elias.setAge(30);
		
		String eliasUsername = elias.getUsername();
		String eliasEmailAddress = elias.getEmailAddress();
		String eliasPassword = elias.getPassword();
		String eliasConfirmPassword = elias.getConfirmPassword();
		int eliasAge = elias.getAge();
		
		System.out.println("\nUsername: " + eliasUsername);
		System.out.println("Email: " + eliasEmailAddress);
		System.out.println("Password: " + eliasPassword);
		System.out.println("Confirm Passwowrd: " + eliasConfirmPassword);
		System.out.println("Age; " + eliasAge);
		
	}
}
