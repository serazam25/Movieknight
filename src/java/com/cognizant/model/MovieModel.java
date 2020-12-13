package com.cognizant.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.cognizant.helper.returnClass;
import com.cognizant.library.DBConnector;
import com.cognizant.library.IDGenerator;

public class MovieModel {

	private String MovieID;
	private String MovieName;
	private String MovieType;
	private String departureTime;
	private String travelTime;
	private String departureDate;
	private String sourceCity;
	private String destinationCity;
	private float cost;
	private String operatorID;
	private int totalSeats;
	final public static Logger logger = Logger.getLogger(MovieModel.class);

	public void setMovieId(String MovieId) {
		this.MovieID = MovieId;
	}

	public void setMovieName(String MovieName) {
		this.MovieName = MovieName;
	}

	public void setMovieType(String MovieType) {
		this.MovieType = MovieType;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public void setTravelTime(String travelTime) {
		this.travelTime = travelTime;
	}

	public void setSourceCity(String sourceCity) {
		this.sourceCity = sourceCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public void setOperatorID(String operatorID) {
		this.operatorID = operatorID;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public String getMovieId() {
		return MovieID;
	}

	public returnClass InsertMovieData() {
		IDGenerator idg = new IDGenerator();
		returnClass r = new returnClass();
		int success = 0;
		// MovieFrequencyModel theModel = new MovieFrequencyModel();

		this.MovieID = idg.generateId("MovieId", "Movie");
		// theModel.setMovieID(MovieID);
		r.setS(this.MovieID);
		DBConnector dbc = new DBConnector();
		PreparedStatement pstmt = null;

		String query = "insert into Movie(MovieId,MovieName,MovieType,DepartureTime,TravelTime,DepartureCity,"
				+ "ArrivalCity,cost,OperatorId,TotalSeats)"
				+ "values(?,?,?,?,?,?,?,?,?,?)";

		try {		
			pstmt = dbc.fireExecuteQueryPrepare(query);
			pstmt.setString(1, this.MovieID);
			pstmt.setString(2, this.MovieName);
			pstmt.setString(3, this.MovieType);
			pstmt.setString(4, this.departureTime);
			pstmt.setString(5, this.travelTime);
			pstmt.setString(6, this.sourceCity);
			pstmt.setString(7, this.destinationCity);
			pstmt.setFloat(8, this.cost);
			pstmt.setString(9, this.operatorID);
			pstmt.setInt(10, this.totalSeats);
			
			success = pstmt.executeUpdate();
			

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		finally {
			try {
				dbc.close();

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		if (success >= 1) {
			r.setB(true);
		} else {
			r.setB(false);
		}
		return r;
	}

	public boolean EditMovieData(int no) {

		int success = 0;
		DBConnector dbc = new DBConnector();

		String query = null;

		switch (no) {
		case 1: {
			query = "update Movie set MovieName='" + MovieName + "' where MovieId='"
					+ MovieID + "'";
			break;
		}
		case 2: {
			query = "update Movie set MovieType='" + MovieType + "' where MovieId='"
					+ MovieID + "'";
			break;
		}
		case 3: {
			query = "update Movie set DepartureTime='" + departureTime
					+ "' where MovieId='" + MovieID + "'";
			break;
		}
		case 4: {
			query = "update Movie set TravelTime='" + travelTime
					+ "' where MovieId='" + MovieID + "'";
			break;
		}
		case 5: {
			query = "update Movie set DepartureCity='" + sourceCity
					+ "' where MovieId='" + MovieID + "'";
			break;
		}
		case 6: {
			query = "update Movie set ArrivalCity='" + destinationCity
					+ "' where MovieId='" + MovieID + "'";
			break;
		}
		case 7: {
			query = "update Movie set cost='" + cost + "' where MovieId='" + MovieID
					+ "'";
			break;
		}
		case 8: {
			query = "update Movie set TotalSeats='" + totalSeats
					+ "' where MovieId='" + MovieID + "'";
			break;
		}
		}

		try {
			success = dbc.fireExecuteUpdate(query);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		finally {
			try {
				dbc.close();

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		if (success >= 1) {
			return true;
		} else {
			return false;
		}
	}

	public ResultSet ViewMovieData() {
		DBConnector dbc = new DBConnector();
		String Movieid, temp = null;
		String temp_id = null;
		String temp_name = null;
		String temp_type = null;
		String temp_dcity = null;
		String temp_acity = null;
		String temp_dtime = null;
		String temp_ttime = null;
		int temp_cost = 0;
		String temp_days = null;
		String query = "select * from Movie";
		ResultSet rs;
		logger.setLevel(Level.INFO);
		logger.info("query fired is: " + query);
		rs = dbc.fireExecuteQuery(query);
		return rs;
	}

	public String getMovieID() {
		return MovieID;
	}

	public String getMovieName() {
		return MovieName;
	}

	public String getMovieType() {
		return MovieType;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public String getTravelTime() {
		return travelTime;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public String getSourceCity() {
		return sourceCity;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public float getCost() {
		return cost;
	}

	public String getOperatorID() {
		return operatorID;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public ResultSet searchMovieBetweenStations() {
		DBConnector dbc = new DBConnector();
		String query = "select * from Movie where DepartureCity='"
				+ this.sourceCity
				+ "' and ArrivalCity = '"
				+ this.destinationCity
				+ "' and MovieId in "
				+ "(select MovieId from MovieFrequency where FrequencyDays = (select DAYNAME('"
				+ this.departureDate + "')));";
		logger.setLevel(Level.INFO);
		logger.info("query fired is: " + query);
		ResultSet rs = dbc.fireExecuteQuery(query);
		return rs;
	}

	public ResultSet getMovieInfo(String bid) {
		DBConnector dbc = new DBConnector();
		ResultSet rs = null;
		String query = "select * from Movie where Movieid='" + bid + "';";

		rs = dbc.fireExecuteQuery(query);
		logger.setLevel(Level.INFO);
		logger.info("query fired is: " + query);
		return rs;
	}

	public ResultSet getMovieInfo1(int no) {
		DBConnector dbc = new DBConnector();
		ResultSet rs = null;
		String query = null;
		if (no == 1) {
			query = "select distinct(DepartureCity) from Movie";
			logger.setLevel(Level.INFO);
			logger.info("query fired is: " + query);
			rs = dbc.fireExecuteQuery(query);
		} else if (no == 2) {
			query = "select distinct(ArrivalCity) from Movie";
			logger.setLevel(Level.INFO);
			logger.info("query fired is: " + query);
			rs = dbc.fireExecuteQuery(query);
		}
		return rs;
	}

	public boolean DeleteMovieData() {
		DBConnector dbc = new DBConnector();
		String query = "delete from Movie where MovieId='" + this.MovieID + "'";
		logger.setLevel(Level.INFO);
		logger.info("query fired is: " + query);
		int rowsUpdated = dbc.fireExecuteUpdate(query);
		dbc.close();
		if (rowsUpdated > 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean EditMovieData1() {
		int success = 0;
		DBConnector dbc = new DBConnector();
		String query = "update Movie set MovieName='" + MovieName + "',MovieType='"
				+ MovieType + "',DepartureTime='" + departureTime
				+ "',TravelTime='" + travelTime + "',DepartureCity='"
				+ sourceCity + "',ArrivalCity='" + destinationCity + "',cost='"
				+ cost + "',OperatorId='" + operatorID + "',TotalSeats='"
				+ totalSeats + "' where MovieId='" + MovieID + "';";
		// System.out.println(query);
		try {

			logger.setLevel(Level.INFO);
			logger.info("query fired is: " + query);
			success = dbc.fireExecuteUpdate(query);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				dbc.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		if (success > 0) {
			// System.out.println("true");
			return true;
		} else {
			// System.out.println("false");
			return false;
		}
	}

	public ResultSet getAllCities() {
		ResultSet rs = null;
		String query = " select distinct departureCity as city from Movie union select arrivalCity as city from Movie;";
		DBConnector dbc = new DBConnector();
		rs = dbc.fireExecuteQuery(query);
		logger.setLevel(Level.INFO);
		logger.info("query fired is: " + query);
		return rs;
	}

}
