package com.turgut.pkg;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.entity.Person;
import com.google.gson.Gson;
import com.utility.Helper;

/**
 * Servlet implementation class FirstApp
 */
public class FirstApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstApp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		   request.setCharacterEncoding("UTF-8");
		   PrintWriter pw = response.getWriter();
		   //Enumeration<String> listeler= request.getParameterNames();
		    Person person = Helper.getFormToObject(request, Person.class);
		   //Person person = new Gson().fromJson(json, Person.class);
		  
		   //List<String> tolist=new ArrayList<String>(request.getParameterMap().keySet());
		   /*while (listeler.hasMoreElements()) {
			   String param = (String) listeler.nextElement();
			   String value=request.getParameter(param);
			   pw.println("Parameter Name is '"+param+"' and Parameter Value is '"+value+"'");
		    }*/
		  
		   
		   pw.println(person.toString());
		   
	
	}

}
