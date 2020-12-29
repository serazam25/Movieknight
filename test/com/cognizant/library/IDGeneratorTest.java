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
public class IDGeneratorTest {
    
    public IDGeneratorTest() {
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
     * Test of generateId method, of class IDGenerator.
     */
    @Test
    public void testGenerateId() {
        System.out.println("generateId");
        String column = "";
        String table = "";
        IDGenerator instance = new IDGenerator();
        String expResult = "1";
        String result = instance.generateId(column, table);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of createTicketNumber method, of class IDGenerator.
     */
    @Test
    public void testCreateTicketNumber() {
        System.out.println("createTicketNumber");
        String text = "";
        IDGenerator instance = new IDGenerator();
        String expResult = "-001";
        String result = instance.createTicketNumber(text);
        assertEquals(expResult, result);
        
        
    }
    
}
