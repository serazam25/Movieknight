/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cognizant.library;

import java.sql.PreparedStatement;
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
public class DBConnectorTest {
    
    public DBConnectorTest() {
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
     * Test of fireExecuteUpdate method, of class DBConnector.
     */
    @Test
    public void testFireExecuteUpdate() {
        System.out.println("fireExecuteUpdate");
        String query = "";
        DBConnector instance = new DBConnector();
        int expResult = 0;
        int result = instance.fireExecuteUpdate(query);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of fireExecuteQuery method, of class DBConnector.
     */
    @Test
    public void testFireExecuteQuery() {
        System.out.println("fireExecuteQuery");
        String query = "";
        DBConnector instance = new DBConnector();
        ResultSet expResult = null;
        ResultSet result = instance.fireExecuteQuery(query);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of fireExecuteQueryPrepare method, of class DBConnector.
     */
    @Test
    public void testFireExecuteQueryPrepare() {
        System.out.println("fireExecuteQueryPrepare");
        String query = "";
        DBConnector instance = new DBConnector();
        PreparedStatement expResult = null;
        PreparedStatement result = instance.fireExecuteQueryPrepare(query);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of close method, of class DBConnector.
     */
    @Test
    public void testClose() {
        System.out.println("close");
        DBConnector instance = new DBConnector();
        instance.close();
        
        
    }
    
}
