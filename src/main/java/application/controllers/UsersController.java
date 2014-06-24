package application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/users")
public class UsersController {
	@RequestMapping("")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/detail")
	public String detail(@RequestParam("id") String id) {
		System.out.println(id);
		return "show";
	}	
	
//	@RequestMapping("/detail")
//	public String detail(@RequestParam(value = "id", defaultValue="Hello") String id) {
//		System.out.println(id);
//		return "show";
//	}	

//	@RequestMapping("/detail")
//	public String detail(@RequestParam(required = false) String id) {
//		System.out.println(id);
//		return "show";
//	}	
	
	@RequestMapping("/{id}")
	public String show(@PathVariable String id) {
		System.out.println(id);
		return "show";
	}
	
	@RequestMapping("/{id}/post")
	public String userPost(@PathVariable String id, @RequestParam(required = false) String title, Model model) {
//		System.out.println(id);
//		System.out.println(title);
		model.addAttribute("title", title);
		model.addAttribute("id", id);
		return "show";
	}
}

