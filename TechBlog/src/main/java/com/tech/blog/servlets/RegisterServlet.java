package com.tech.blog.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


    public RegisterServlet() {
        super();


    }



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		response.getWriter().append("Served at: ").append(request.getContextPath());
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		 String check= request.getParameter("check");
		 PrintWriter out = response.getWriter();
		 out.println(check);
		  if(check==null) {
			  out.println("Please check the box");
		  }
		  
		  else {
			  String name =request.getParameter("user_name"); 
			  String  email=request.getParameter("user_email"); 
			  String password =request.getParameter("user_password"); 
			  String gender =request.getParameter("user_gender"); 
			  String about =request.getParameter("about"); 
					  
		  }
		
	}

}
