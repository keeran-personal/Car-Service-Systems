package com.qn.controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.qn.model.Car;

/**
 * Servlet implementation class CarDetails
 */
public class CarDetails extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException ,IOException {
		String carmodel=request.getParameter("carmodel");
		String cartype=request.getParameter("cartype");
		String carnumber=request.getParameter("carnumber");
		
		HttpSession session = request.getSession();
		String username=(String)session.getAttribute("susername");
		
		
		
		Car c= new Car();
		c.setUsername(username);
		c.setCarmodel(carmodel);
		c.setCartype(cartype);
		c.setCarnumber(carnumber);
		
		int status =c.carDetails();
		if(status==0) {
			response.sendRedirect("/Car-service-system/carDetailsRegisterfailure.jsp");
		}else {
			response.sendRedirect("/Car-service-system/carDetailsRegisterSuccess.jsp");
		}
		
		
	}
	}