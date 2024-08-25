package src.main.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import src.main.models.User;
import src.main.service.UserService;

@RestController
public class StoreController {
	
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public String user() {
        List<User> users = userService.getAllUsers();
        
        StringBuilder userInfo = new StringBuilder();
        for (User user : users) {
            userInfo.append("ID: ").append(user.getId()).append(", ")
                    .append("Login: ").append(user.getLogin()).append(", ")
                    .append("Password: ").append(new String(user.getPassword())).append(", ")
                    .append("First Name: ").append(user.getFirstName()).append(", ")
                    .append("Last Name: ").append(user.getLastName()).append(", ")
                    .append("Birthday: ").append(user.getBirthday()).append(", ")
                    .append("Banned: ").append(user.isBanned()).append(", ")
                    .append("Deleted: ").append(user.isDeleted()).append(", ")
                    .append("Admin: ").append(user.isAdmin()).append("\n");
        }
        
        return userInfo.toString();
    }
    
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }	
	@GetMapping("/order")
	public String order() {
		return "Welcome to the order page";
	}
	
	@GetMapping("/goods")
	public String goods() {
		return "Welcome to the goods page";
	}
}



