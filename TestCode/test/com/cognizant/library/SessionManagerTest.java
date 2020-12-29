/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cognizant.library;

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
public class SessionManagerTest {
    
    public SessionManagerTest() {
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
     * Test of setSession method, of class SessionManager.
     */
    @Test
    public void testSetSession() throws Exception {
        System.out.println("setSession");
        String email = "";
        String who = "";
        SessionManager.setSession(email, who);
        
        
    }

    /**
     * Test of setUserID method, of class SessionManager.
     */
    @Test
    public void testSetUserID() {
        System.out.println("setUserID");
        String userID = "";
        SessionManager.setUserID(userID);
        
        
    }

    /**
     * Test of setUserEMail method, of class SessionManager.
     */
    @Test
    public void testSetUserEMail() {
        System.out.println("setUserEMail");
        String userEMail = "";
        SessionManager.setUserEMail(userEMail);
        
        
    }

    /**
     * Test of setUserPhoneNumber method, of class SessionManager.
     */
    @Test
    public void testSetUserPhoneNumber() {
        System.out.println("setUserPhoneNumber");
        String userPhoneNumber = "";
        SessionManager.setUserPhoneNumber(userPhoneNumber);
        
        
    }
    
}
