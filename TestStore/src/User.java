import lombok.Getter;
import lombok.Setter;

public class User {
	@Getter @Setter private long id;
	@Getter @Setter private String login;
	@Getter @Setter private char[] password;
	@Getter @Setter private String firstName;
	@Getter @Setter private String lastName;
	@Getter @Setter private int birthday;
	@Getter @Setter private boolean isBanned;
	@Getter @Setter private boolean isDeleted;
	@Getter @Setter private boolean isAdmin;
	
}
