package Proj2;

import java.sql.*;
import java.util.*;
import java.sql.SQLException;

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
        
        
        
        try {
            GameDatabase gdb = new GameDatabase();
            gdb.createGameDatabase();
            
            //GameDatabase.createGameDatabase();
            
//            System.out.println(Database.getPASSWORD());
//            System.out.println(Database.getURL());
//            System.out.println(Database.getUSERNAME());
            gdb.Retrieve();
           
        
            //System.out.println(gdb.science);
            //gdb.retrieveGameInfo();
           
        } catch (SQLException e){
            e.printStackTrace();
        }
        
        
        
//        Information.Retrieve();
        
        
        //System.out.println(GameDatabase.maths);
        //System.out.println(Science.getQuestion("q1"));
//        System.out.println(Science.getID());
//        System.out.println(Science.getPA());
//        System.out.println(Science.getQuestion1());
//        System.out.println(Science.getActualAnswer());
//       
//        
//        
//        System.out.println(Science.ID);
//        System.out.println(Science.PA);
//        System.out.println(Science.getQuestion1());
//        System.out.println(Science.getActualAnswer());
        //RNG.getRandomNumber();
//        System.out.println(Maths.testing3);
//        
//        
        
        
    }

}