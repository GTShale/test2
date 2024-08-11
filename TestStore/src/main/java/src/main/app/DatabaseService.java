package src.main.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import jakarta.annotation.PostConstruct;
import src.main.models.User;

@Service
public class DatabaseService {
	
	String url ="jdbc:mysql://localhost:3306/store?useSSL=false&serverTimezone=UTC";
	String user="root";
	String password = "amiars05052006A!";
	
	 public List<User> getUsers() {
        List<User> users = new ArrayList<>();
 try {
			
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection = DriverManager.getConnection(url,user,password);		
	Statement statement = connection.createStatement();
	ResultSet rs = statement.executeQuery("Select * from user");
	
	while(rs.next()) {
		User user = new User();
        user.setId(rs.getInt("id"));
        user.setLogin(rs.getString("login"));
        user.setPassword(rs.getString("password").toCharArray());
        user.setFirstName(rs.getString("first_name"));
        user.setLastName(rs.getString("last_name"));
        user.setBirthday(rs.getDate("birthday").toLocalDate());
        user.setBanned(rs.getBoolean("is_banned"));
        user.setDeleted(rs.getBoolean("is_deleted"));
        user.setAdmin(rs.getBoolean("is_admin"));
        users.add(user);
		}
	
 	} catch (ClassNotFoundException | SQLException e) {
 		e.printStackTrace();
 		}
 
 	return users;

	}
}
