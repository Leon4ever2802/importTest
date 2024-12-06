package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class TestController {
	
	@GetMapping("/was")
	public String index() {
		return "Ich bins";
	}
	
}
