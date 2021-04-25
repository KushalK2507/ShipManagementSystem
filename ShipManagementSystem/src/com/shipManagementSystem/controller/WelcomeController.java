package com.shipManagementSystem.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shipManagementSystem.helper.ViewHelper;

@WebServlet("*.do")
public class WelcomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String subSystem = ViewHelper.getSubSystem(requestURI);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(subSystem);
		requestDispatcher.forward(request, response);

	}

}
