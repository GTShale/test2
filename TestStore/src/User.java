import lombok.Getter;
import lombok.Setter;

@Getter @Setter
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
	
}
