package springmvcSearch;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {
	
	//This is a method to handling exception 
	
	
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NullPointerException.class)
	public String exceptionHandlerNull(Model m) {
		m.addAttribute("msg","Null pointer exception has occured");
		return "null_page";
	}
	
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NumberFormatException.class)
	public String numberFormat(Model m) {
		m.addAttribute("msg","Number format exception has occured");
		return "null_page";
	}
	
	
	
	//This is Generic exception as it will handle all exception
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=Exception.class)
	public String genericException(Model m) {
		m.addAttribute("msg","Exception has occured");
		return "null_page";
	}

}
