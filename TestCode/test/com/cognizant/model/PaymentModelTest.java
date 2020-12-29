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
public class PaymentModelTest {
    
    public PaymentModelTest() {
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
     * Test of insertPaymentData method, of class PaymentModel.
     */
    @Test
    public void testInsertPaymentData() {
        System.out.println("insertPaymentData");
        PaymentModel instance = new PaymentModel();
        boolean expResult = true;
        boolean result = instance.insertPaymentData();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of updatePaymentStatus method, of class PaymentModel.
     */
    @Test
    public void testUpdatePaymentStatus() {
        System.out.println("updatePaymentStatus");
        PaymentModel instance = new PaymentModel();
        boolean expResult = true;
        boolean result = instance.updatePaymentStatus();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of deletePaymentData method, of class PaymentModel.
     */
    @Test
    public void testDeletePaymentData() {
        System.out.println("deletePaymentData");
        PaymentModel instance = new PaymentModel();
        boolean expResult = false;
        boolean result = instance.deletePaymentData();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setPaymentID method, of class PaymentModel.
     */
    @Test
    public void testSetPaymentID() {
        System.out.println("setPaymentID");
        String paymentID = "10";
        PaymentModel instance = new PaymentModel();
        instance.setPaymentID(paymentID);
        
        
    }

    /**
     * Test of setBookingID method, of class PaymentModel.
     */
    @Test
    public void testSetBookingID() {
        System.out.println("setBookingID");
        String bookingID = "01";
        PaymentModel instance = new PaymentModel();
        instance.setBookingID(bookingID);
        
        
    }

    /**
     * Test of setTotalAmount method, of class PaymentModel.
     */
    @Test
    public void testSetTotalAmount() {
        System.out.println("setTotalAmount");
        String totalAmount = "200";
        PaymentModel instance = new PaymentModel();
        instance.setTotalAmount(totalAmount);
        
        
    }

    /**
     * Test of setPaymentDate method, of class PaymentModel.
     */
    @Test
    public void testSetPaymentDate() {
        System.out.println("setPaymentDate");
        String paymentDate = "2020-12-27";
        PaymentModel instance = new PaymentModel();
        instance.setPaymentDate(paymentDate);
        
        
    }

    /**
     * Test of setOperatorID method, of class PaymentModel.
     */
    @Test
    public void testSetOperatorID() {
        System.out.println("setOperatorID");
        String operatorID = "";
        PaymentModel instance = new PaymentModel();
        instance.setOperatorID(operatorID);
        
        
    }

    /**
     * Test of setTotalSeats method, of class PaymentModel.
     */
    @Test
    public void testSetTotalSeats() {
        System.out.println("setTotalSeats");
        String totalSeats = "";
        PaymentModel instance = new PaymentModel();
        instance.setTotalSeats(totalSeats);
        
        
    }

    /**
     * Test of setStatus method, of class PaymentModel.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String status = "";
        PaymentModel instance = new PaymentModel();
        instance.setStatus(status);
        
        
    }
    
}
