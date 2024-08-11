package src.main.models;

import java.time.LocalDate;

import lombok.Data;

@Data 
public class User {
	 private int id;
	 private String login;
	 private char[] password;
	 private String firstName;
	 private String lastName;
	 private LocalDate birthday;
	 private boolean isBanned;
	 private boolean isDeleted;
	 private boolean isAdmin;
	
}
