package com.qn.controler;

import java.io.IOException;
import java.security.Provider.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.qn.model.Admin;

public class AdminLogin extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		Admin a = new Admin();
		a.setUsername(username);
		a.setPassword(password);

		int status = a.adminLogin();

		if (status == 1) {
			username = a.getUsername();
			HttpSession session = request.getSession();
			session.setAttribute("susername", username);

			response.sendRedirect("/Car-service-system/AdminLoginSuccess.jsp");
		} else if (status == -1) {
			response.sendRedirect("/Car-service-system/invalidAdminUsername.jsp");
		} else {
			response.sendRedirect("/Car-service-system/invalidAdminpassword.jsp");

		}
	}
}
