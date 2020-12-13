package com.cognizant.model;

import java.util.logging.Logger;


import com.cognizant.library.DBConnector;
import com.cognizant.library.IDGenerator;

public class MovieFrequencyModel {
	private String frequencyID;
	private String MovieID;
	private String frequencyDay;
	int rowsUpdatedtemp;

	public void setMovieID(String MovieID) {
		this.MovieID = MovieID;
	}

	public void setFrequencyDay(String frequencyDay) {
		this.frequencyDay = frequencyDay;
	}

	public boolean addMovieForDay() {
		IDGenerator idg = new IDGenerator();
		
		char temp;
		int rowsUpdated = 0;
		int i;
		String query = "";
		for (i = 0; i < frequencyDay.length(); i++) {
			DBConnector dbc = new DBConnector();
			this.frequencyID = idg.generateId("FrequencyId", "Moviefrequency");
			
			temp = frequencyDay.charAt(i);
			String day="";
			switch (temp) {
				case 'S': {
					day="Sunday";
					break;
				}
				case 'M': {
					day="Monday";
					break;
				}
				case 'T': {
					day="Tuesday";
					break;
				}
				case 'W': {
					day="Wednesday";
					break;
				}
				case 'H': {
					day="Thursday";
					break;
				}
				case 'F': {
					day="Friday";
					break;
				}
				case 'A': {
					day="Saturday";
					break;
				}	
				default:
					day="error";
			}			
		query = "insert into Moviefrequency values ('"+this.frequencyID+"', '"+MovieID+"', '"+day+"');";
			try {
				rowsUpdatedtemp = dbc.fireExecuteUpdate(query);
				rowsUpdated = rowsUpdated + rowsUpdatedtemp;
				dbc.close();
	
			} catch (Exception e) {
				System.out.println("Exception:" + e.getMessage());
			}
			
		}
		
		if (rowsUpdated > 0) {
			
			return true;
		} else {
			return false;
		}

	}

	
	  public boolean modifyMovieForDay() 
	  { 
		  DBConnector dbc = new DBConnector();
		  
		   boolean result; 
		  String query = "delete from Moviefrequency where MovieID ='"+this.MovieID+"'";
		  
		  try
		  {
			  dbc.fireExecuteUpdate(query);
		  }
		  catch(Exception e)
		  {
			  System.out.println(e.getMessage());
		  }
		  
		  result=addMovieForDay();
		  
		  return result;
	  
	  	  	 
}


public boolean DeleteMovieForDay()
		{
			DBConnector dbc=new DBConnector();
			String query="delete from Moviefrequency where MovieId='"+this.MovieID+"'";
			int rowsUpdated=dbc.fireExecuteUpdate(query);
			dbc.close();
			if(rowsUpdated > 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
}
