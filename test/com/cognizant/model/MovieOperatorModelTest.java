/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cognizant.model;

import com.cognizant.helper.returnClass;
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
public class MovieOperatorModelTest {
    
    public MovieOperatorModelTest() {
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
     * Test of setName method, of class MovieOperatorModel.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        MovieOperatorModel instance = new MovieOperatorModel();
        instance.setName(name);
        
        
    }

    /**
     * Test of setOldPassword method, of class MovieOperatorModel.
     */
    @Test
    public void testSetOldPassword() {
        System.out.println("setOldPassword");
        String oldPassword = "";
        MovieOperatorModel instance = new MovieOperatorModel();
        instance.setOldPassword(oldPassword);
        
        
    }

    @Test
    public void testSelectLoginData() throws Exception {
        System.out.println("selectLoginData");
        MovieOperatorModel instance = new MovieOperatorModel();
        boolean expResult = false;
        boolean result = instance.selectLoginData();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of selectLoginData1 method, of class MovieOperatorModel.
     */
    @Test
    public void testSelectLoginData1() {
        System.out.println("selectLoginData1");
        MovieOperatorModel instance = new MovieOperatorModel();
        ResultSet expResult = null;
        ResultSet result = instance.selectLoginData1();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of operator_available method, of class MovieOperatorModel.
     */
    @Test
    public void testOperator_available() {
        System.out.println("operator_available");
        String s = "";
        MovieOperatorModel instance = new MovieOperatorModel();
        boolean expResult = false;
        boolean result = instance.operator_available(s);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of setOperatorID method, of class MovieOperatorModel.
     */
    @Test
    public void testSetOperatorID() {
        System.out.println("setOperatorID");
        String operatorID = "";
        MovieOperatorModel instance = new MovieOperatorModel();
        instance.setOperatorID(operatorID);
        
        
    }

    /**
     * Test of setOpeartorName method, of class MovieOperatorModel.
     */
    @Test
    public void testSetOpeartorName() {
        System.out.println("setOpeartorName");
        String opeartorName = "";
        MovieOperatorModel instance = new MovieOperatorModel();
        instance.setOpeartorName(opeartorName);
        
        
    }

    /**
     * Test of setAddress method, of class MovieOperatorModel.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "";
        MovieOperatorModel instance = new MovieOperatorModel();
        instance.setAddress(address);
        
        
    }

    /**
     * Test of setEmail method, of class MovieOperatorModel.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        MovieOperatorModel instance = new MovieOperatorModel();
        instance.setEmail(email);
        
        
    }

    /**
     * Test of setCity method, of class MovieOperatorModel.
     */
    @Test
    public void testSetCity() {
        System.out.println("setCity");
        String city = "";
        MovieOperatorModel instance = new MovieOperatorModel();
        instance.setCity(city);
        
        
    }

    /**
     * Test of setPhoneNumber method, of class MovieOperatorModel.
     */
    @Test
    public void testSetPhoneNumber() {
        System.out.println("setPhoneNumber");
        String phoneNumber = "";
        MovieOperatorModel instance = new MovieOperatorModel();
        instance.setPhoneNumber(phoneNumber);
        
        
    }

    /**
     * Test of setPassword method, of class MovieOperatorModel.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        MovieOperatorModel instance = new MovieOperatorModel();
        instance.setPassword(password);
        
        
    }

    /**
     * Test of deleteOperatorAccount method, of class MovieOperatorModel.
     */
    @Test
    public void testDeleteOperatorAccount() {
        System.out.println("deleteOperatorAccount");
        MovieOperatorModel instance = new MovieOperatorModel();
        boolean expResult = false;
        boolean result = instance.deleteOperatorAccount();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of updatePasswordByEMail method, of class MovieOperatorModel.
     */
    @Test
    public void testUpdatePasswordByEMail() {
        System.out.println("updatePasswordByEMail");
        MovieOperatorModel instance = new MovieOperatorModel();
        boolean expResult = false;
        boolean result = instance.updatePasswordByEMail();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of deleteOperatorAccountFromAdmin method, of class MovieOperatorModel.
     */
    @Test
    public void testDeleteOperatorAccountFromAdmin() {
        System.out.println("deleteOperatorAccountFromAdmin");
        MovieOperatorModel instance = new MovieOperatorModel();
        Boolean expResult = false;
        Boolean result = instance.deleteOperatorAccountFromAdmin();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getUserIDFromEmail method, of class MovieOperatorModel.
     */
    @Test
    public void testGetUserIDFromEmail() throws Exception {
        System.out.println("getUserIDFromEmail");
        String email2 = "";
        MovieOperatorModel instance = new MovieOperatorModel();
        String expResult = "";
        String result = instance.getUserIDFromEmail(email2);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getOperatorData method, of class MovieOperatorModel.
     */
    @Test
    public void testGetOperatorData() {
        System.out.println("getOperatorData");
        MovieOperatorModel instance = new MovieOperatorModel();
        ResultSet expResult = null;
        ResultSet result = instance.getOperatorData();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of updateUserProfileData method, of class MovieOperatorModel.
     */
    @Test
    public void testUpdateUserProfileData() {
        System.out.println("updateUserProfileData");
        MovieOperatorModel instance = new MovieOperatorModel();
        boolean expResult = false;
        boolean result = instance.updateUserProfileData();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getAllOperatorData method, of class MovieOperatorModel.
     */
    @Test
    public void testGetAllOperatorData() {
        System.out.println("getAllOperatorData");
        MovieOperatorModel instance = new MovieOperatorModel();
        ResultSet expResult = null;
        ResultSet result = instance.getAllOperatorData();
        assertEquals(expResult, result);
        
        
    }
    
}
