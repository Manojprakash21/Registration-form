package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entities.FactoryProvider;
import entities.formdata;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		try {
        PrintWriter out=response.getWriter();
        //fetching data from form
        String fname=request.getParameter("firstname");
       String lname=request.getParameter("lastname");
       String mail= request.getParameter("email");
       String number=request.getParameter("phone");
       String jobtitle= request.getParameter("jobtitle");
       String msg = request.getParameter("message");
      
       //creating object of formdata
       formdata fd= new formdata(fname, lname, mail, number, jobtitle, msg);
       //inserting data in database
       Session s= FactoryProvider.getFactory().openSession();
       Transaction tx =s.beginTransaction();
       s.save(fd);
      tx.commit();
      
      
      out.println("<h1>You are successfully registered...</h1>");
       out.print("<p> <a href='formdata.jsp'>click here</a> to check and update your details...</p> "
      );

		
	} catch (Exception e) {
	e.printStackTrace();
	}
		}

}
