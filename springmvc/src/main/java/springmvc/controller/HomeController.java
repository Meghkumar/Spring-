package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {

	// this is data transfer using only model
	@RequestMapping(path="/home",method = RequestMethod.POST)
	public String home(Model model) {
		System.out.println("this is home url");
		model.addAttribute("name", "Meghkumar");

		model.addAttribute("id", 27);

		List<String> friends = new ArrayList<String>();
		friends.add("rahul");
		friends.add("sham");
		friends.add("ram");
		friends.add("uttam");

		model.addAttribute("friend", friends);

		return "index";

	}

	// this is data transfer using only model
	@RequestMapping("/about")
	public String about() 
	
	{
		System.out.println("this is about controller");
		return "about";
	}

	
	// this is data transfer using only model&View
	@RequestMapping("/help")
	public ModelAndView help()
	{
		// Step1 - import object of model & view in return type
		System.out.println("This is a help page");
		
		// Step 2 - create a object for Model & View wherein we can keep the data in that object
		ModelAndView modelAndView = new ModelAndView(); 
		
		modelAndView.addObject("name","Meghkumar");		//giving attribute
		modelAndView.addObject("rollNo",25);
		
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
		modelAndView.setViewName("help");				//setting view name
		
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(52);
		list.add(72);
		list.add(22);
		modelAndView.addObject("marks", list);
		
		
		return modelAndView;
	}


	
	
}
