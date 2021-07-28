package com.mustafa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//after you extend httpServlet the class becomes servlet
@WebServlet("/add")
public class AddServlet extends HttpServlet{

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));

		int sum = i + j;

		PrintWriter out = resp.getWriter();
		out.println("Result is: " + sum);
	}
	
	
}
