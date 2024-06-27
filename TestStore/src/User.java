
public class User {
	private long id;
	private String login;
	private char[] password;
	private String firstName;
	private String lastName;
	private int birthday;
	private boolean isBanned;
	private boolean isDeleted;
	private boolean isAdmin;
	private String userAddress;
	private int phoneNumber;
	
	//ID
	public long getId(){
		return id;
	}
	public void setId(long newId) {
		this.id = newId;
	}
	
	//login
	public String getLogin(){
		return login;
	}
	public void setLogin(String newLogin) {
		this.login = newLogin;
	}
	
	//password
	public char[] getPassword() {
	    return password;
	}
	public void setPassword(char[] newPassword) {
	    this.password = newPassword;
	}
	
	//firstName
	public String getFirstName() {
	    return firstName;
	}
	public void setFirstName(String newFirstName) {
	    this.firstName = newFirstName;
	}
	
	//lastName
	public String getLastName() {
	    return lastName;
	}
	public void setLastName(String newLastName) {
	    this.lastName = newLastName;
	}
	
	//birthday
	public int getBirthday() {
	    return birthday;
	}
	public void setBirthday(int newBirthday) {
	    this.birthday = newBirthday;
	}
	
	//isBanned
	public boolean getIsBanned() {
	    return isBanned;
	}
	public void setBanned(boolean banned) {
	    this.isBanned = banned;
	}
	
	//isDeleted
	public boolean getIsDeleted() {
	    return isDeleted;
	}
	public void setDeleted(boolean deleted) {
	    this.isDeleted = deleted;
	}
	
	//isAdmin
	public boolean getIsAdmin() {
	    return isAdmin;
	}
	public void setAdmin(boolean admin) {
	    this.isAdmin = admin;
	}

}
