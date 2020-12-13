package com.cognizant.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.cognizant.library.DBConnector;
import com.cognizant.library.SessionManager;

public class SessionManagerModel {

	public void getUserIDFromEmail(String email) throws SQLException {
		String query = "select UserID, PhoneNumber from user where email='"
				+ email + "';";
		DBConnector dbc = new DBConnector();
		ResultSet rs = null;
		rs = dbc.fireExecuteQuery(query);
		while (rs.next()) {
			SessionManager.userID=rs.getString(1);
			SessionManager.userPhoneNumber=rs.getString(2);
		}
	}
	public void getMovieOperatorIDFromEmail(String email) throws SQLException {
		String query = "select OperatorID, PhoneNumber from MovieOperator where email='"
			+ email + "';";
		DBConnector dbc = new DBConnector();
		ResultSet rs = null;
		rs = dbc.fireExecuteQuery(query);
		while (rs.next()) {
			SessionManager.userID=rs.getString(1);
			SessionManager.userPhoneNumber=rs.getString(2);
		}
	}
}
