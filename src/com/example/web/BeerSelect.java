package com.example.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import com.example.model.*;

public class BeerSelect extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
		throws IOException, ServletException {
		String c = request.getParameter("color");
		BeerExpert beerExpert = new BeerExpert();
		List brands = beerExpert.getBrands(c);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Beer Selection Advice<br>");

		Iterator it = brands.iterator();
		while(it.hasNext()){
			out.println("<br>try: " + it.next());
		}
		
	}
}