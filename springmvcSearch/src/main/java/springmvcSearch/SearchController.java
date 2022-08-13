package springmvcSearch;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/home")
	public String home() {
		
		System.out.println("going to home view");
		
//We have created this exception & had it handle through @ExceptionHandler handle annotation
		String str = null;
		System.out.println(str.length());
		
		return "home"; 
	}
	
	@RequestMapping("search")
	public RedirectView search(@RequestParam("querybox") String query) {
		
		String url="https://www.google.co.in/search?q="+query;
		
		
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);
		
		return redirectView;
	}
	
	
	@RequestMapping("user/{userId}/{userName}")
	public String getUserDetails(@PathVariable("userId")int userid,@PathVariable("userName")String username) {
		
		System.out.println(userid);
		System.out.println(username);
//		Integer.parseInt(username);  // This is to create Number Pointer Exception
		return"home";
	}
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
