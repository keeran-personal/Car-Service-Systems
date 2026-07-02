package com.qn.controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.qn.model.Car;

public class ServiceStatus extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String carNumber = request.getParameter("CarNumber");
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("susername");
		Car c = new Car();
		c.setCarnumber(carNumber);
		c.setUsername(username);

		String status = c.serviceStatus();
		session.setAttribute("sStatus", status);

		if (status == null) {
			response.sendRedirect("/Car-service-system/serviceStatusFailure.jsp");
		}

		else {
			response.sendRedirect("/Car-service-system/serviceStatusSuccess.jsp");
		}
	}
}
