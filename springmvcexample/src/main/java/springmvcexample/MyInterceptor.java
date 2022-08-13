package springmvcexample;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyInterceptor extends HandlerInterceptorAdapter {

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		System.out.println("This is preHandler");
		
		String name=request.getParameter("user");
		if (name.startsWith("d")) {
			
			
			response.setContentType("text/html");
			response.getWriter().println("Invalid name as the name should start with d");
			
			return false;
			
		}
		return true;
		
	}
	
	

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		System.out.println("This is post handler");
		
		super.postHandle(request, response, handler, modelAndView);
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	
		System.out.println("This is after completion");
		
		super.afterCompletion(request, response, handler, ex);
	}
	
	
	
	

}
