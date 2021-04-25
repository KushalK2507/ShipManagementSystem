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

@WebServlet("/employeeRegistration")
public class EmployeeManagementController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("submit");
		if (action.equals("GetDetails")) {
			UserDetailsModel getUserDetails = new UserDetailsModel();
			UserDetails userDetails = getUserDetails.getUserDetails(request.getParameter("id"));
			request.setAttribute("UserDetails", userDetails);
			RequestDispatcher requestDispatcher = request
					.getRequestDispatcher(ViewHelper.getEmployeeManagementSystemNextView(action));
			requestDispatcher.forward(request, response);
		} else if (action.equals("UpdateDetails")) {
			UserDetailsModel getUserDetails = new UserDetailsModel();
			UserDetails userDetails = getUserDetails.getUserDetails(request.getParameter("id"));
			request.setAttribute("UserDetails", userDetails);
			RequestDispatcher requestDispatcher = request
					.getRequestDispatcher(ViewHelper.getEmployeeManagementSystemNextView(action));
			requestDispatcher.forward(request, response);
		} else if (action.equals("DeleteDetails")) {
			UserDetailsModel deleteUserOperation = new UserDetailsModel();

			String userDeletedId = deleteUserOperation.deleteUserdetails(request.getParameter("id"));
			request.setAttribute("userDeletedId", userDeletedId);
			RequestDispatcher requestDispatcher = request
					.getRequestDispatcher(ViewHelper.getEmployeeManagementSystemNextView(action));
			requestDispatcher.forward(request, response);
		} else {
			RequestDispatcher requestDispatcher = request
					.getRequestDispatcher(ViewHelper.getEmployeeManagementSystemNextView(action));
			requestDispatcher.forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		UserDetails userDetails = new UserDetails(request.getParameter("name"), request.getParameter("address"),
				request.getParameter("email"));

		String userId = request.getParameter("id");
		UserDetailsModel updateUserDetails = new UserDetailsModel();
		UserDetails userDetailsupdated = updateUserDetails.updateUserDetails(userDetails, userId);
		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher(ViewHelper.getEmployeeManagementSystemNextView("updatedUserdetails"));
		requestDispatcher.forward(request, response);

	}

}
