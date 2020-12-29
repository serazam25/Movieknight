/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cognizant.helper;

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
public class returnClassTest {
    
    public returnClassTest() {
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
     * Test of setS method, of class returnClass.
     */
    @Test
    public void testSetS() {
        System.out.println("setS");
        String s = "";
        returnClass instance = new returnClass();
        instance.setS(s);
        
        
    }

    /**
     * Test of setB method, of class returnClass.
     */
    @Test
    public void testSetB() {
        System.out.println("setB");
        boolean b = false;
        returnClass instance = new returnClass();
        instance.setB(b);
        
        
    }

    /**
     * Test of getS method, of class returnClass.
     */
    @Test
    public void testGetS() {
        System.out.println("getS");
        returnClass instance = new returnClass();
        String expResult = null;
        String result = instance.getS();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getB method, of class returnClass.
     */
    @Test
    public void testGetB() {
        System.out.println("getB");
        returnClass instance = new returnClass();
        boolean expResult = false;
        boolean result = instance.getB();
        assertEquals(expResult, result);
        
        
    }
    
}
