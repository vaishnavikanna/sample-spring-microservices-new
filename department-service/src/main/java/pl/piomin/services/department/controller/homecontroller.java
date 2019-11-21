package pl.piomin.services.department.controller;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class homecontroller {

	@RequestMapping("home")
	public String home() {
		return "products.html";
	}	
}
