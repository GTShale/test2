package src.main.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data 
@Entity
@Table(name = "user")
public class User {
	int t =5;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	
	@Column(name = "login", nullable = true, unique = true, length = 255)
	 private String login;
	
	@Column(name = "password", nullable = true, unique = false, length = 255)
	 private String password;
	
	@Column(name = "first_name", nullable = true, unique = false, length = 255)
	 private String firstName;
	
	@Column(name = "last_name", nullable = true, unique = false, length = 255)
	 private String lastName;
	
	@Column(name = "birthday")
	 private LocalDate birthday;
	
	@Column(name = "is_banned", nullable = true)
	 private boolean isBanned;
	
	@Column(name = "is_admin", nullable = true)
	 private boolean isDeleted;
	
	@Column(name = "is_deleted", nullable = true)
	 private boolean isAdmin;
	
}
