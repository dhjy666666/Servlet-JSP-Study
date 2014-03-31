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
		
		request.setAttribute("styles", brands);
		
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		
		view.forward(request, response);
		
	}
}