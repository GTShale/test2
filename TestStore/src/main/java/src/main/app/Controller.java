package src.main.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import src.main.repository.UserRepository;
import src.main.models.TestingModel;

@RestController
public class Controller {
	
	@Autowired
    private UserRepository userRepository;

	 @GetMapping("/user")
	    public String getUserLogin(@RequestParam String login) {
		 TestingModel user = userRepository.findByLogin(login);
	        if (user != null) {
	            return "User Login: " + user.getLogin();
	        } else {
	            return "User not found";
	        }
	    }

	@GetMapping("/welcome")
	public TestingModel welcome() {
		TestingModel testingModel = new TestingModel();
		return testingModel;
	}
	
}



