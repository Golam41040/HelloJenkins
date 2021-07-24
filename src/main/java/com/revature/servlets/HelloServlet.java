package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class HelloServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
		PrintWriter pw = res.getWriter();
		
		pw.print("<h1> Hello From your doGet method </h1>");
		res.setStatus(200);
	}
	
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
		PrintWriter pw = res.getWriter();
		
		pw.print("<h1> Hello From your doPost method </h1>");
		res.setStatus(200);
	}
}
