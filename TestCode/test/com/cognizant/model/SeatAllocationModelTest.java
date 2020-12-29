/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cognizant.model;

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
public class SeatAllocationModelTest {
    
    public SeatAllocationModelTest() {
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
     * Test of insertNewSeatData method, of class SeatAllocationModel.
     */
    @Test
    public void testInsertNewSeatData() {
        System.out.println("insertNewSeatData");
        SeatAllocationModel instance = new SeatAllocationModel();
        boolean expResult = true;
        boolean result = instance.insertNewSeatData();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setSeatID method, of class SeatAllocationModel.
     */
    @Test
    public void testSetSeatID() {
        System.out.println("setSeatID");
        String seatID = "";
        SeatAllocationModel instance = new SeatAllocationModel();
        instance.setSeatID(seatID);
        
        
    }

    /**
     * Test of setBookingID method, of class SeatAllocationModel.
     */
    @Test
    public void testSetBookingID() {
        System.out.println("setBookingID");
        String bookingID = "";
        SeatAllocationModel instance = new SeatAllocationModel();
        instance.setBookingID(bookingID);
        
        
    }

    /**
     * Test of setSeatType method, of class SeatAllocationModel.
     */
    @Test
    public void testSetSeatType() {
        System.out.println("setSeatType");
        String seatType = "";
        SeatAllocationModel instance = new SeatAllocationModel();
        instance.setSeatType(seatType);
        
        
    }

    /**
     * Test of setMovieID method, of class SeatAllocationModel.
     */
    @Test
    public void testSetMovieID() {
        System.out.println("setMovieID");
        String MovieID = "";
        SeatAllocationModel instance = new SeatAllocationModel();
        instance.setMovieID(MovieID);
        
        
    }
    
}
