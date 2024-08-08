package src.main.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Service;
import jakarta.annotation.PostConstruct;

//@Service
public class DatabaseService {
	
	String url ="jdbc:mysql://localhost:3306/store?useSSL=false&serverTimezone=UTC";
	String user="root";
	String password = "amiars05052006A!";
	
	//@PostConstruct
	public void insertData(){
try {
			
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection = DriverManager.getConnection(url,user,password);
			
	System.out.println("Grats u connected to " + url);
			
	String query = "INSERT INTO user(login) VALUES ('ArsenASD')";	
	Statement statement = connection.createStatement();
	statement.executeUpdate(query);	
			
	System.out.println("Data  inserted");
			
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (SQLException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
		}
	}

}
