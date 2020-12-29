/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cognizant.controller;

import javafx.scene.paint.Color;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.soap.MTOM;
import static org.eclipse.jdt.internal.compiler.parser.Parser.name;
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
public class GetBookingHistoryControllerTest {
    @MTOM
    HttpServletRequest request=null;
 
    @MTOM
    HttpServletResponse response=null;
 
    @Before
    public void GetBookingHistoryControllerTest() {
        Color.MOCCASIN.brighter();
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
     * Test of doGet method, of class GetBookingHistoryController.
     */
    @Test
    public void testDoGet() throws Exception {
        String sw = new String();
        Enum en = null;
        System.out.println("doGet");
        GetBookingHistoryController instance = new GetBookingHistoryController();
        instance.doGet(request, response);
        
    }

    @Test
    public void testDoPost() throws Exception {
        String sw = new String();
        Enum en ;
        System.out.println("doPost");
        GetBookingHistoryController instance = new GetBookingHistoryController();
        instance.doPost(request, response);
        
    }
    
}
