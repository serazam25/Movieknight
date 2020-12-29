/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cognizant.model;

import java.sql.ResultSet;
import java.util.List;
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
public class BookingModelTest {
    
    public BookingModelTest() {
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
     * Test of setBookingID method, of class BookingModel.
     */
    @Test
    public void testSetBookingID() {
        System.out.println("setBookingID");
        String bookingID = "";
        BookingModel instance = new BookingModel();
        instance.setBookingID(bookingID);
    }

    /**
     * Test of setMovieID method, of class BookingModel.
     */
    @Test
    public void testSetMovieID() {
        System.out.println("setMovieID");
        String string = "";
        BookingModel instance = new BookingModel();
        instance.setMovieID(string);
    }

    /**
     * Test of setUserID method, of class BookingModel.
     */
    @Test
    public void testSetUserID() {
        System.out.println("setUserID");
        String userID = "";
        BookingModel instance = new BookingModel();
        instance.setUserID(userID);
    }

    /**
     * Test of setDepartureTime method, of class BookingModel.
     */
    @Test
    public void testSetDepartureTime() {
        System.out.println("setDepartureTime");
        String departureTime = "";
        BookingModel instance = new BookingModel();
        instance.setDepartureTime(departureTime);
    }

    /**
     * Test of setDepartureDate method, of class BookingModel.
     */
    @Test
    public void testSetDepartureDate() {
        System.out.println("setDepartureDate");
        String departureDate = "";
        BookingModel instance = new BookingModel();
        instance.setDepartureDate(departureDate);
    }

    @Test
    public void testDeleteBookingUser() {
        System.out.println("deleteBookingUser");
        BookingModel instance = new BookingModel();
        int expResult = 0;
        int result = instance.deleteBookingUser();
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteBookingGuest method, of class BookingModel.
     */
    @Test
    public void testDeleteBookingGuest() {
        System.out.println("deleteBookingGuest");
        BookingModel instance = new BookingModel();
        int expResult = 0;
        int result = instance.deleteBookingGuest();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNoOfSeats() {
        System.out.println("setNoOfSeats");
        String noOfSeats = "";
        BookingModel instance = new BookingModel();
        instance.setNoOfSeats(noOfSeats);
    }

    @Test
    public void testGetBookingIDByEmail() throws Exception {
        System.out.println("getBookingIDByEmail");
        BookingModel instance = new BookingModel();
        String expResult = "";
        String result = instance.getBookingIDByEmail();
        assertEquals(expResult, result);
    }


}
