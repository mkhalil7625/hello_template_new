package com.mk.hello_template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@SpringBootApplication
public class HelloTemplateApplication {
@RequestMapping("/")//map to home page using the index view
public String home(Model model){//modify to create model
	//add author atribute
	model.addAttribute("author", "MK");
	//model.addAttribute("favoriteFood", "Tacos");
	model.addAttribute("favoriteMovie","Spider Man");
	List favoriteFoods= Arrays.asList("Pizza", "Tacos", "Steak");
	model.addAttribute("favoriteFoods", favoriteFoods);
	return "index.html";
}
	public static void main(String[] args) {
		SpringApplication.run(HelloTemplateApplication.class, args);
	}
}
