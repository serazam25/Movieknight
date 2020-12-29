/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cognizant.model;

import com.cognizant.helper.returnClass;
import com.cognizant.library.DBConnector;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dell
 */
public class MovieModelTest {
    
    public MovieModelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setMovieId method, of class MovieModel.
     */
    @Test
    public void testSetMovieId() {
        System.out.println("setMovieId");
        String MovieId = "";
        MovieModel instance = new MovieModel();
        instance.setMovieId(MovieId);
        
        
    }

    /**
     * Test of setMovieName method, of class MovieModel.
     */
    @Test
    public void testSetMovieName() {
        System.out.println("setMovieName");
        String MovieName = "";
        MovieModel instance = new MovieModel();
        instance.setMovieName(MovieName);
        
        
    }

    /**
     * Test of setMovieType method, of class MovieModel.
     */
    @Test
    public void testSetMovieType() {
        System.out.println("setMovieType");
        String MovieType = "";
        MovieModel instance = new MovieModel();
        instance.setMovieType(MovieType);
        
        
    }

    /**
     * Test of setDepartureTime method, of class MovieModel.
     */
    @Test
    public void testSetDepartureTime() {
        System.out.println("setDepartureTime");
        String departureTime = "";
        MovieModel instance = new MovieModel();
        instance.setDepartureTime(departureTime);
        
        
    }

    /**
     * Test of setDepartureDate method, of class MovieModel.
     */
    @Test
    public void testSetDepartureDate() {
        System.out.println("setDepartureDate");
        String departureDate = "";
        MovieModel instance = new MovieModel();
        instance.setDepartureDate(departureDate);
        
        
    }

    /**
     * Test of setTravelTime method, of class MovieModel.
     */
    @Test
    public void testSetTravelTime() {
        System.out.println("setTravelTime");
        String travelTime = "";
        MovieModel instance = new MovieModel();
        instance.setTravelTime(travelTime);
        
        
    }

    /**
     * Test of setSourceCity method, of class MovieModel.
     */
    @Test
    public void testSetSourceCity() {
        System.out.println("setSourceCity");
        String sourceCity = "";
        MovieModel instance = new MovieModel();
        instance.setSourceCity(sourceCity);
        
        
    }

    /**
     * Test of setDestinationCity method, of class MovieModel.
     */
    @Test
    public void testSetDestinationCity() {
        System.out.println("setDestinationCity");
        String destinationCity = "";
        MovieModel instance = new MovieModel();
        instance.setDestinationCity(destinationCity);
        
        
    }

    /**
     * Test of setCost method, of class MovieModel.
     */
    @Test
    public void testSetCost() {
        System.out.println("setCost");
        float cost = 0.0F;
        MovieModel instance = new MovieModel();
        instance.setCost(cost);
        
        
    }

    /**
     * Test of setOperatorID method, of class MovieModel.
     */
    @Test
    public void testSetOperatorID() {
        System.out.println("setOperatorID");
        String operatorID = "";
        MovieModel instance = new MovieModel();
        instance.setOperatorID(operatorID);
        
        
    }

    /**
     * Test of setTotalSeats method, of class MovieModel.
     */
    @Test
    public void testSetTotalSeats() {
        System.out.println("setTotalSeats");
        int totalSeats = 0;
        MovieModel instance = new MovieModel();
        instance.setTotalSeats(totalSeats);
        
        
    }

    /**
     * Test of getMovieId method, of class MovieModel.
     */
    @Test
    public void testGetMovieId() {
        System.out.println("getMovieId");
        MovieModel instance = new MovieModel();
        String expResult = null;
        String result = instance.getMovieId();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of InsertMovieData method, of class MovieModel.
     */
    @Test
    public void testInsertMovieData() {
        System.out.println("InsertMovieData");
        MovieModel instance = new MovieModel();
        returnClass expResult = null;
        returnClass result = instance.InsertMovieData();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of EditMovieData method, of class MovieModel.
     */
    @Test
    public void testEditMovieData() {
        System.out.println("EditMovieData");
        int no = 0;
        MovieModel instance = new MovieModel();
        boolean expResult = false;
        boolean result = instance.EditMovieData(no);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of ViewMovieData method, of class MovieModel.
     */
    @Test
    public void testViewMovieData() {
        System.out.println("ViewMovieData");
        MovieModel instance = new MovieModel();
        DBConnector dbc = new DBConnector();
        String query = "select * from movie where movieID=01";
        ResultSet Result = null;
        ResultSet expResult = dbc.fireExecuteQuery(query);
        ResultSet result = instance.ViewMovieData();
        assertEquals(expResult, Result);
        
        
    }

    /**
     * Test of getMovieID method, of class MovieModel.
     */
    @Test
    public void testGetMovieID() {
        System.out.println("getMovieID");
        MovieModel instance = new MovieModel();
        String expResult = null;
        String result = instance.getMovieID();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getMovieName method, of class MovieModel.
     */
    @Test
    public void testGetMovieName() {
        System.out.println("getMovieName");
        MovieModel instance = new MovieModel();
        String expResult = null;
        String result = instance.getMovieName();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getMovieType method, of class MovieModel.
     */
    @Test
    public void testGetMovieType() {
        System.out.println("getMovieType");
        MovieModel instance = new MovieModel();
        String expResult = null;
        String result = instance.getMovieType();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getDepartureTime method, of class MovieModel.
     */
    @Test
    public void testGetDepartureTime() {
        System.out.println("getDepartureTime");
        MovieModel instance = new MovieModel();
        String expResult = null;
        String result = instance.getDepartureTime();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getTravelTime method, of class MovieModel.
     */
    @Test
    public void testGetTravelTime() {
        System.out.println("getTravelTime");
        MovieModel instance = new MovieModel();
        String expResult = null;
        String result = instance.getTravelTime();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getDepartureDate method, of class MovieModel.
     */
    @Test
    public void testGetDepartureDate() {
        System.out.println("getDepartureDate");
        MovieModel instance = new MovieModel();
        String expResult = null;
        String result = instance.getDepartureDate();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getSourceCity method, of class MovieModel.
     */
    @Test
    public void testGetSourceCity() {
        System.out.println("getSourceCity");
        MovieModel instance = new MovieModel();
        String expResult = null;
        String result = instance.getSourceCity();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getDestinationCity method, of class MovieModel.
     */
    @Test
    public void testGetDestinationCity() {
        System.out.println("getDestinationCity");
        MovieModel instance = new MovieModel();
        String expResult = null;
        String result = instance.getDestinationCity();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getCost method, of class MovieModel.
     */
    @Test
    public void testGetCost() {
        System.out.println("getCost");
        MovieModel instance = new MovieModel();
        float expResult = 0.0F;
        float result = instance.getCost();
        assertEquals(expResult, result, 0.0);
        
        
    }

    /**
     * Test of getOperatorID method, of class MovieModel.
     */
    @Test
    public void testGetOperatorID() {
        System.out.println("getOperatorID");
        MovieModel instance = new MovieModel();
        String expResult = null;
        String result = instance.getOperatorID();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getTotalSeats method, of class MovieModel.
     */
    @Test
    public void testGetTotalSeats() {
        System.out.println("getTotalSeats");
        MovieModel instance = new MovieModel();
        int expResult = 0;
        int result = instance.getTotalSeats();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of searchMovieBetweenStations method, of class MovieModel.
     */
    @Test
    public void testSearchMovieBetweenStations() {
        System.out.println("searchMovieBetweenStations");
        MovieModel instance = new MovieModel();
        ResultSet expResult = null;
        ResultSet result = instance.searchMovieBetweenStations();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getMovieInfo method, of class MovieModel.
     */
    @Test
    public void testGetMovieInfo() {
        System.out.println("getMovieInfo");
        String bid = "01";
        MovieModel instance = new MovieModel();
        DBConnector dbc = new DBConnector();
        String query = "select * from movie where movieID=01";
        ResultSet Result = null;
        ResultSet expResult = dbc.fireExecuteQuery(query);
        ResultSet result = instance.getMovieInfo(bid);
        assertEquals(expResult, expResult);
    }

    /**
     * Test of getMovieInfo1 method, of class MovieModel.
     */
    @Test
    public void testGetMovieInfo1() {
        System.out.println("getMovieInfo1");
        int no = 0;
        MovieModel instance = new MovieModel();
        ResultSet expResult = null;
        ResultSet result = instance.getMovieInfo1(no);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of DeleteMovieData method, of class MovieModel.
     */
    @Test
    public void testDeleteMovieData() {
        System.out.println("DeleteMovieData");
        MovieModel instance = new MovieModel();
        boolean expResult = false;
        boolean result = instance.DeleteMovieData();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of EditMovieData1 method, of class MovieModel.
     */
    @Test
    public void testEditMovieData1() {
        System.out.println("EditMovieData1");
        MovieModel instance = new MovieModel();
        boolean expResult = false;
        boolean result = instance.EditMovieData1();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getAllCities method, of class MovieModel.
     */
    @Test
    public void testGetAllCities() {
        System.out.println("getAllCities");
        MovieModel instance = new MovieModel();
        ResultSet expResult = null;
        ResultSet result = instance.getAllCities();
        assertEquals(expResult, result);
        
        
    }
    
}
