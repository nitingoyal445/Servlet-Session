package com.capgemini;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstHttpServletProgram
 */
@WebServlet("/FirstHttpServletProgram")
public class FirstHttpServletProgram extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstHttpServletProgram() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html;charset=UTF-8");
	        try (PrintWriter out = response.getWriter()) {
	            int summ,subt,mult,divi;
	            int x,y;
	            String a = request.getParameter("num1");
	            String b = request.getParameter("num2");
	            String c=request.getParameter("choice");
	            x = Integer.parseInt(a);
	            y = Integer.parseInt(b);
	            if(c.equals("sum")) {
	            summ = x + y;
	            out.println("The sum is" + summ);}
	            if(c.equals("sub")) {
	            	subt=x-y;
	            	out.println(" Subtract is" + subt);}
	            if(c.equals("mul")) {
	            	mult=x*y;
	            	out.println("multiply is" + mult);}
	            if(c.equals("div")) {
	    	    	divi=x/y;
	    	    	out.println("Divide is" + divi);}
	            }
		
	    }
	           

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
