package com.qn.controler;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.qn.model.Car;

/**
 * Servlet implementation class ViewCars
 */
public class ViewCars extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException ,IOException {
	Car c=new Car();
	ArrayList<Car> carDetails=c.viewCars();
	HttpSession session=request.getSession();
	session.setAttribute("scarDetails", carDetails);
	if(carDetails==null) {
		response.sendRedirect("/Car-service-system/viewCarsFailure.jsp");
		
	}else {
		response.sendRedirect("/Car-service-system/viewCarsSuccess.jsp");
	
	}
	}
}