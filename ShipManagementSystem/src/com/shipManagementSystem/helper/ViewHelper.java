package com.shipManagementSystem.helper;

public class ViewHelper {

	public static String getSubSystem(String requestURI) {
		if (null != requestURI && requestURI.contains("onlineRegistration.do")) {
			return "onlineRegistration.jsp";
		} else if (null != requestURI && requestURI.contains("employeeRegistration.do")) {
			return "employeeManagement.jsp";
		} else if (null != requestURI && requestURI.contains("warehouseManagement.do")) {
			return "warehouseManagement.jsp";
		} else if (null != requestURI && requestURI.contains("shipManagementSystem.do")) {
			return "shipManagement.jsp";
		} else if (null != requestURI && requestURI.equals("welcome.do")) {

			return "welcome.jsp";
		} else {
			return "welcome.jsp";

		}
	}
	
	public static String getErrorView()
	{
		return "error.jsp";
	}

	public static String getUserRegistrationSuccess() {
		return "userRegistrationSuccess.jsp";
	}
	
	public static String getEmployeeManagementSystemNextView(String view)
	{
		if (view.equals("GetDetails"))
		{
			return "userDetails.jsp";	
		}
		else if(view.equals("UpdateDetails"))
		{
			return "updateUserDetails.jsp";
		}
		else if(view.equals("DeleteDetails"))
		{
			return "userDeleted.jsp";
		}
		else if (view.equals("updatedUserdetails"))
		{
			return "userdetailsUpdated.jsp";
		}
		else
		{
			return "welcome.jsp";
		}
		
	}
}
