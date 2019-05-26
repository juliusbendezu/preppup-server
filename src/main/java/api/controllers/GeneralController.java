package api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GeneralController {

	@GetMapping("/wakeup")
	public String wakeUp() {
		return "Waking up..";
	}
}
