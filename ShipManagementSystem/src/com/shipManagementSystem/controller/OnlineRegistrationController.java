package com.shipManagementSystem.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.shipManagementSystem.helper.ViewHelper;
import com.shipManagementSystem.model.UserDetailsModel;
import com.shipManagementSystem.model.entity.UserDetails;

@WebServlet("/onlineRegistration")
public class OnlineRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		UserDetails userDetails = new UserDetails(request.getParameter("name"), request.getParameter("address"),
				request.getParameter("email"));

		UserDetailsModel model = new UserDetailsModel();
		String userId = model.registerUser(userDetails);
		String userRegistrationSuccess = null;
		if (Integer.parseInt(userId) > 0) {
			request.setAttribute("id", userId);

			userRegistrationSuccess = ViewHelper.getUserRegistrationSuccess();
		} else {
			userRegistrationSuccess = ViewHelper.getErrorView();
		}
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(userRegistrationSuccess);
		requestDispatcher.forward(request, response);

	}

}
