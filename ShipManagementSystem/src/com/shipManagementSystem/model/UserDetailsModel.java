package com.shipManagementSystem.model;

import java.sql.SQLException;

import com.shipManagementSystem.helper.DBUtility;
import com.shipManagementSystem.model.entity.UserDetails;

public class UserDetailsModel {
	
	public String registerUser(UserDetails details) 
	{
		String insertedUser=null;
		try {
			insertedUser = DBUtility.insertUser(details);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	
		return insertedUser;
	}
	
	
	public UserDetails getUserDetails(String id)
	{
		
		UserDetails userDetails = DBUtility.getUserDetails(id);
		return userDetails;
	}

	public UserDetails updateUserDetails(UserDetails updatedDetails, String id)
	{
		UserDetails userUpdatedId = DBUtility.updateUser(updatedDetails, id);
		return userUpdatedId;
	}

	public String deleteUserdetails(String id) {
		String userDeletedId = DBUtility.deleteUser(id);
		return userDeletedId;
	}

}
