
public class AccountRegistration {
	private String username = "";
	private String emailAddress = "";
	private String password = "";
	private String confirmPassword = "";
	private int age = 0;
	
	public AccountRegistration(){
		username = "";
		emailAddress = "";
		password = "";
		confirmPassword = "";
		age = 0;
	}
	
	public AccountRegistration(String newUsername, String newEmailAddress, String newPassword, String newConfirmPassword, int newAge){
		username = new String(newUsername);
		emailAddress = new String(newEmailAddress);
		password = new String(newPassword);
		confirmPassword = new String (newConfirmPassword);
		age = newAge;
		
		System.out.println(this);
	}
	
	public String getUsername(){
		return username;
	}
	
	public String getEmailAddress(){
		return emailAddress;
	}
	
	public String getPassword(){
		return password;
	}
	
	public String getConfirmPassword(){
		return confirmPassword;
	}
	
	public int getAge(){
		return age; 
	}
	
	public void setUsername(String newUsername){
		this.username = newUsername;
	}
	
	public void setEmailAddress(String newEmailAddress){
		this.emailAddress = newEmailAddress;
	}
	
	public void setPassword(String newPassword){
		this.password = newPassword;
	}
	
	public void setConfirmPassword(String newConfirmPassword){
		this.confirmPassword = newConfirmPassword;
	}
	
	public void setAge(int newAge){
		this.age = newAge;
	}
	
	public String toString(){
		return "You created an account with " + username + " newUsername " + " and " + emailAddress + " newEmailAddress " + 
	password + " newPassword " + confirmPassword + " newConfrimPassword " + age + " newAge";
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
