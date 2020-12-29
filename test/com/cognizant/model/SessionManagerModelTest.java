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
public class SessionManagerModelTest {
    
    public SessionManagerModelTest() {
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
     * Test of getUserIDFromEmail method, of class SessionManagerModel.
     */
    @Test
    public void testGetUserIDFromEmail() throws Exception {
        System.out.println("getUserIDFromEmail");
        String email = "";
        SessionManagerModel instance = new SessionManagerModel();
        instance.getUserIDFromEmail(email);
        
        
    }

    /**
     * Test of getMovieOperatorIDFromEmail method, of class SessionManagerModel.
     */
    @Test
    public void testGetMovieOperatorIDFromEmail() throws Exception {
        System.out.println("getMovieOperatorIDFromEmail");
        String email = "";
        SessionManagerModel instance = new SessionManagerModel();
        instance.getMovieOperatorIDFromEmail(email);
        
        
    }
    
}
