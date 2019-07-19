package net.antra;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
	String sid = request.getParameter("id"); 
	String name=request.getParameter("name");
	String marks=request.getParameter("marks"); 
	
	PrintWriter out=response.getWriter();
	
	out.println(sid);
	out.println(name);
	out.println(marks);
	  System.out.println("In First servlet");	
	}

}
