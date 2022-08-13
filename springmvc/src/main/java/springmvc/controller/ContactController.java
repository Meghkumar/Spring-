package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commmonDataMapping(Model model) {
		
		model.addAttribute("Header","This is a HTML Form");
		model.addAttribute("Desc","Home for programmer");
		
		System.out.println("Adding common data to model");
		
	}

	@RequestMapping("/contact")
	public String ShowForm(Model model) {
		System.out.println("creating form");
		return "contact";
	}
	
	/*This method using @RequestParam
	 * @RequestMapping(path ="/processform",method = RequestMethod.POST) 
	 * public String handleForm(
	 * @RequestParam("email") String userEmail,
	 * @RequestParam("username") String userName,
	 * @RequestParam("password") String userPassword, Model model) {
	 * 
	 * System.out.println("User EmailId: "+userEmail+" User Name: " +userName+" UserPassword: "+userPassword);
	 * 
	 * User user = new User(); 
	 * user.setEmail(userEmail); 
	 * user.setUsername(userName);
	 * user.setPassword(userPassword);
	 * 
	 * System.out.println(user);
	 * 
	 * // model.addAttribute("name", userName); 
	 * // model.addAttribute("email",userEmail); 
	 * // model.addAttribute("password", userPassword);
	 * 
	 * model.addAttribute("user", user); return "sucess"; }
	 */
	
	
	
	// Now we use @ModelAttribute to solve the above
	@RequestMapping(path="/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model) {
		
		System.out.println(user);
		//model.addAttribute("user", user);
		
		if (user.getUsername().isBlank()) {
			
			return "redirect:/contact";
		}
		
		int createUser = this.userService.createUser(user);
		model.addAttribute("msg", "User id created with "+createUser);
		
		return "sucess";
		
		
		                                                                                           
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
