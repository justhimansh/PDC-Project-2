/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proj2;

import org.junit.Test;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;


public class PopCultureTest {
    
    public PopCultureTest(){
        
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
    
    @Test
    public void questionTest(){
        String expResult = "What is the highest-grossing film of all time (as of 2021)?";
        
        assertEquals(expResult, PopCulture.testQuestion());
    }

  
}
