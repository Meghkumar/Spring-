package springmvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {

	// 1st way of doing redirect

//	@RequestMapping("/one")
//	public String one() {
//		System.out.println("This is one handler");
//		return "redirect:/enjoy";
//	}

	
	// 2nd way of doing redirect by [Redirect View as return type]

//	@RequestMapping("/one")
//	public RedirectView one() {
//		System.out.println("This is one handler");
//		RedirectView redirectView = new RedirectView();
//		redirectView.setUrl("enjoy");
//		return redirectView;

//	}

	
	// 3rd way of redirecting[Not recommended ]
	
//	@RequestMapping("/one")
//	public String one(HttpServletResponse response) {
//		
//		try {
//			response.sendRedirect("enjoy");
//			
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
//		
//		return "";

//	}
		
	
	//ADDITIONAL REDIRECT IS SHOWN IN ContactController class in last method
		
		
	@RequestMapping("/enjoy")
	public String two() {
		System.out.println("this is a second handler[enjoy]");
		return "contact";
	}

}
