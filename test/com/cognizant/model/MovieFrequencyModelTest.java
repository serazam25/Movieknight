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
public class MovieFrequencyModelTest {
    
    public MovieFrequencyModelTest() {
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
     * Test of setMovieID method, of class MovieFrequencyModel.
     */
    @Test
    public void testSetMovieID() {
        System.out.println("setMovieID");
        String MovieID = "";
        MovieFrequencyModel instance = new MovieFrequencyModel();
        instance.setMovieID(MovieID);
        
        
    }

    /**
     * Test of setFrequencyDay method, of class MovieFrequencyModel.
     */
    @Test
    public void testSetFrequencyDay() {
        System.out.println("setFrequencyDay");
        String frequencyDay = "";
        MovieFrequencyModel instance = new MovieFrequencyModel();
        instance.setFrequencyDay(frequencyDay);
        
        
    }

    /**
     * Test of addMovieForDay method, of class MovieFrequencyModel.
     */
    @Test
    public void testAddMovieForDay() {
        System.out.println("addMovieForDay");
        MovieFrequencyModel instance = new MovieFrequencyModel();
        boolean expResult = false;
        boolean result = instance.DeleteMovieForDay();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of modifyMovieForDay method, of class MovieFrequencyModel.
     */
    @Test
    public void testModifyMovieForDay() {
        System.out.println("modifyMovieForDay");
        MovieFrequencyModel instance = new MovieFrequencyModel();
        boolean expResult = false;
        boolean result = instance.DeleteMovieForDay();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of DeleteMovieForDay method, of class MovieFrequencyModel.
     */
    @Test
    public void testDeleteMovieForDay() {
        System.out.println("DeleteMovieForDay");
        MovieFrequencyModel instance = new MovieFrequencyModel();
        boolean expResult = false;
        boolean result = instance.DeleteMovieForDay();
        assertEquals(expResult, result);
        
        
    }
    
}
