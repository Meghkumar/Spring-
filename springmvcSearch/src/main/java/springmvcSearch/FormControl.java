package springmvcSearch;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormControl {

	@RequestMapping("/complex")
	public String showFrom() 
	{
		
		return "complex_form";
	}
	
	@RequestMapping(path = "/handleform", method = RequestMethod.POST)
	public String formHandler(@ModelAttribute("Student") Student student,BindingResult result) {
		
		if(result.hasErrors()) {
			
			return "complex_form";  
		}
		
		System.out.println(student);
		System.out.println(student.getAddress());
		
		return "success";
	}
}
