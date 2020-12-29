/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cognizant.model;

import com.cognizant.library.DBConnector;
import static com.cognizant.model.AdminModel.logger;
import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Result;
import java.sql.ResultSet;
import org.apache.log4j.Level;
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
public class AdminModelTest {

    public AdminModelTest() {
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
     * Test of changeAdminPassword method, of class AdminModel.
     */
    @Test
    public void testChangeAdminPassword() {

        System.out.println("changeAdminPassword");
        AdminModel instance = new AdminModel();
        boolean expResult = true;
        boolean result = instance.changeAdminPassword();
        assertNotEquals(expResult, result);

    }

    /**
     * Test of setId method, of class AdminModel.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String i = "01";
        AdminModel instance = new AdminModel();
        instance.setId(i);
    }

    /**
     * Test of setUserid method, of class AdminModel.
     */
    @Test
    public void testSetUserid() {
        System.out.println("setUserid");
        String userid = "01";
        AdminModel instance = new AdminModel();
        instance.setUserid(userid);
    }

    /**
     * Test of setPassword method, of class AdminModel.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "123456";
        AdminModel instance = new AdminModel();
        instance.setPassword(password);
    }

    /**
     * Test of setDate method, of class AdminModel.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        long date = 0L;
        AdminModel instance = new AdminModel();
        instance.setDate(date);
    }

    /**
     * Test of selectAdminLogin method, of class AdminModel.
     */
    @Test
    public void testSelectAdminLogin() throws Exception {
        System.out.println("selectAdminLogin");
        AdminModel instance = new AdminModel();
        boolean expResult = true;
        boolean result = instance.selectAdminLogin();
        assertNotEquals(expResult, result);
    }

    /**
     * Test of setOldPassword method, of class AdminModel.
     */
    @Test
    public void testSetOldPassword() {
        System.out.println("setOldPassword");
        String oldPassword = "123456";
        AdminModel instance = new AdminModel();
        instance.setOldPassword(oldPassword);
    }

    /**
     * Test of showAllBookings method, of class AdminModel.
     */
    @Test
    public void testShowAllBookings() {
        System.out.println("showAllBookings");
        AdminModel instance = new AdminModel();
        DBConnector dbc = new DBConnector();
        String query = "select * from booking";
        ResultSet expResult = dbc.fireExecuteQuery(query);
        ResultSet result= dbc.fireExecuteQuery(query);
        assertEquals(expResult, expResult);
    }

    /**
     * Test of showAllMovieOperators method, of class AdminModel.
     */
    @Test
    public void testShowAllMovieOperators() {
        System.out.println("showAllMovieOperators");
        AdminModel instance = new AdminModel();
        DBConnector dbc = new DBConnector();
        String query = "select * from Movieoperator";
        ResultSet expResult = dbc.fireExecuteQuery(query);
        ResultSet result= instance.showAllMovieOperators();
        assertEquals(expResult, expResult);
    }

    /**
     * Test of showAllUsers method, of class AdminModel.
     */
    @Test
    public void testShowAllUsers() {
        System.out.println("showAllUsers");
        AdminModel instance = new AdminModel();
        DBConnector dbc = new DBConnector();
        String query = "select * from users";
        Resultset Result = null;
        ResultSet expResult = dbc.fireExecuteQuery(query);
        ResultSet result = instance.showAllUsers();
        assertEquals(expResult, Result);
    }

}
