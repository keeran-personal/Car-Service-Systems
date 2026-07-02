package com.qn.controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.qn.model.Car;

public class ServiceRequest extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException ,IOException {
		String servicerequest=request.getParameter("servicerequest");
		String carnumber=request.getParameter("carnumber");
		Car c=new Car(); 
		HttpSession session=request.getSession();
		String username=(String)session.getAttribute("susername");
		
		c.setServicerequest(servicerequest);
		c.setUsername(username);
		c.setCarnumber(carnumber);
		int status=c.serviceRequest();
		if(status==0) {
			response.sendRedirect("/Car-service-system/serviceRequestFailure.jsp");
			
		}else {
			response.sendRedirect("/Car-service-system/serviceRequestSuccess.jsp");
			
		}
	
	
	
	
	}
	}