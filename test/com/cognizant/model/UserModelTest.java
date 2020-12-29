/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cognizant.model;

import com.cognizant.library.DBConnector;
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
public class UserModelTest {
    
    public UserModelTest() {
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
     * Test of setOldPassword method, of class UserModel.
     */
    @Test
    public void testSetOldPassword() {
        System.out.println("setOldPassword");
        String oldPassword = "123456";
        UserModel instance = new UserModel();
        instance.setOldPassword(oldPassword);
        
        
    }

    /**
     * Test of setSecurityQuestion method, of class UserModel.
     */
    @Test
    public void testSetSecurityQuestion() {
        System.out.println("setSecurityQuestion");
        String securityQuestion = "write hello";
        UserModel instance = new UserModel();
        instance.setSecurityQuestion(securityQuestion);
        
        
    }

    /**
     * Test of setSecurityAnswer method, of class UserModel.
     */
    @Test
    public void testSetSecurityAnswer() {
        System.out.println("setSecurityAnswer");
        String securityAnswer = "hello";
        UserModel instance = new UserModel();
        instance.setSecurityAnswer(securityAnswer);
        
        
    }

    /**
     * Test of setUserID method, of class UserModel.
     */
    @Test
    public void testSetUserID() {
        System.out.println("setUserID");
        String userID = "01";
        UserModel instance = new UserModel();
        instance.setUserID(userID);
        
        
    }

    /**
     * Test of setFirstName method, of class UserModel.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "munira";
        UserModel instance = new UserModel();
        instance.setFirstName(firstName);
        
        
    }

    /**
     * Test of setLastName method, of class UserModel.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "maisha";
        UserModel instance = new UserModel();
        instance.setLastName(lastName);
        
        
    }

    /**
     * Test of setAddress method, of class UserModel.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "dhaka";
        UserModel instance = new UserModel();
        instance.setAddress(address);
        
        
    }

    /**
     * Test of setCity method, of class UserModel.
     */
    @Test
    public void testSetCity() {
        System.out.println("setCity");
        String city = "dhaka";
        UserModel instance = new UserModel();
        instance.setCity(city);
        
        
    }

    /**
     * Test of setEmail method, of class UserModel.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "munira@gmail.com";
        UserModel instance = new UserModel();
        instance.setEmail(email);
        
        
    }

    /**
     * Test of setPhoneNumber method, of class UserModel.
     */
    @Test
    public void testSetPhoneNumber() {
        System.out.println("setPhoneNumber");
        String phoneNumber = "01877450124";
        UserModel instance = new UserModel();
        instance.setPhoneNumber(phoneNumber);
        
        
    }

    /**
     * Test of setPassword method, of class UserModel.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "123456";
        UserModel instance = new UserModel();
        instance.setPassword(password);
        
        
    }


    @Test
    public void testSelectLoginData() throws Exception {
        System.out.println("selectLoginData");
        UserModel instance = new UserModel();
        DBConnector dbc = new DBConnector();
        String query= "select * from userlogin";
        ResultSet expResult = dbc.fireExecuteQuery(query);
        ResultSet result = instance.selectLoginData();
        assertEquals(expResult, null);
        
        
    }

    /**
     * Test of selectLoginData1 method, of class UserModel.
     */
    @Test
    public void testSelectLoginData1() throws Exception {
        System.out.println("selectLoginData1");
        UserModel instance = new UserModel();
        boolean expResult = false;
        boolean result = instance.selectLoginData1();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of updateUserProfileData method, of class UserModel.
     */
    @Test
    public void testUpdateUserProfileData() {
        System.out.println("updateUserProfileData");
        UserModel instance = new UserModel();
        boolean expResult = false;
        boolean result = instance.updateUserProfileData();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of updatePassword method, of class UserModel.
     */
    @Test
    public void testUpdatePassword() {
        System.out.println("updatePassword");
        UserModel instance = new UserModel();
        boolean expResult = false;
        boolean result = instance.updatePassword();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of deleteRow method, of class UserModel.
     */
    @Test
    public void testDeleteRow() {
        System.out.println("deleteRow");
        UserModel instance = new UserModel();
        boolean expResult = false;
        boolean result = instance.deleteRow();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of updatePasswordByEMail method, of class UserModel.
     */
    @Test
    public void testUpdatePasswordByEMail() {
        System.out.println("updatePasswordByEMail");
        UserModel instance = new UserModel();
        boolean expResult = false;
        boolean result = instance.updatePasswordByEMail();
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of deleteUserAccount method, of class UserModel.
     */
    @Test
    public void testDeleteUserAccount() {
        System.out.println("deleteUserAccount");
        UserModel instance = new UserModel();
        boolean expResult = false;
        boolean result = instance.deleteUserAccount();
        assertEquals(expResult, result);
        
        
    }


    @Test
    public void testGetUserIDFromEmail() throws Exception {
        System.out.println("getUserIDFromEmail");
        String parameter = "";
        UserModel instance = new UserModel();
        String expResult = "";
        String result = instance.getUserIDFromEmail(parameter);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of getUserData method, of class UserModel.
     */
    @Test
    public void testGetUserData() {
        System.out.println("getUserData");
        UserModel instance = new UserModel();
        DBConnector dbc = new DBConnector();
        String query= "select * from users";
        ResultSet expResult = dbc.fireExecuteQuery(query);
        ResultSet result = instance.getUserData();
        assertEquals(expResult, null);
        
        
    }

}
