package com.cognizant.helper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cognizant.model.MovieModel;

public class AutoSuggest {

	private int totalCities;
	private List<String> cities;

	public AutoSuggest() throws SQLException {
		ResultSet rs = getValues();
		cities = new ArrayList<String>();
		while (rs.next()) {
			cities.add(rs.getString(1));
		}
		totalCities = cities.size();
	}

	public ResultSet getValues() {
		ResultSet rs = null;
		MovieModel bm = new MovieModel();
		rs = bm.getAllCities();
		return rs;
	}

	public List<String> getData(String query) {
		String city = null;
		query = query.toLowerCase();
		List<String> matched = new ArrayList<String>();
		for (int i = 0; i < totalCities; i++) {
			city = cities.get(i).toLowerCase();
			if (city.startsWith(query)) {
				matched.add(cities.get(i));
			}
		}
		return matched;
	}

}
