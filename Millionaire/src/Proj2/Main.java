package Proj2;

import java.sql.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Retrieve the data for all categories
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                StartScreen playGame = new StartScreen();
                playGame.setVisible(true);
                
            }
        });

        //gives question
        Information.Retrieve();
        //System.out.println(Science.getQuestion("q1"));
        System.out.println(Science.getID());
        System.out.println(Science.getPA());
        System.out.println(Science.getQuestion1());
        System.out.println(Science.getActualAnswer());
       
        
        
        System.out.println(Science.ID);
        System.out.println(Science.PA);
//        System.out.println(Science.getQuestion1());
//        System.out.println(Science.getActualAnswer());
        //RNG.getRandomNumber();
//        System.out.println(Maths.testing3);
//        
//        
        
        
    }

}