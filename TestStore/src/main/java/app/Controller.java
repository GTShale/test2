package app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import src.main.models.TestingModel;

@RestController
public class Controller {

	@GetMapping("/welcome")
	public TestingModel welcome() {
		TestingModel testingModel = new TestingModel();
		return testingModel;
	}

}