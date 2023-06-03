package Proj2;

import java.sql.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Retrieve the data for all categories
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });

        //gives question
        Information.Retrieve();
        
        System.out.println(Maths.testing3);
        
        
        
        
        
        
      
       
        
        
        
       
    }

}