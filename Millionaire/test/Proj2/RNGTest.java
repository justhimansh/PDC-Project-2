/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proj2;

/**
 *
 * @author Owner
 */
import org.junit.Test;
import org.junit.jupiter.api.*;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;

public class RNGTest {
    
    public RNGTest (){
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

//    Test to find method, of class RNG. To see if fucntions in RNG are getting called
    
    @Test
    public void testWorking(){
        //RNG.getRandomNumber();
        String expResult = "q2";
        assertEquals(expResult, RNG.forTest());
    }
}


