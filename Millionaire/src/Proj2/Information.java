/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proj2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Owner
 */
public class Information {
    
    private static final String DB_URL = "jdbc:derby://localhost:1527/Questions and Answers";
    private static final String DB_USER = "pdc";
    private static final String DB_PASSWORD = "pdc";
    public static String maths = "";
    public static String science = "";
    
    public static void Retrieve(){
        
        
        String mathsData = retrieveCategoryData("Maths");
        String scienceData = retrieveCategoryData("Science");
        String popCultureData = retrieveCategoryData("Pop Culture");
        String geographyData = retrieveCategoryData("Geography");
        String sportsData = retrieveCategoryData("Sports");
        
        maths = mathsData;
        science = scienceData;
        
        //System.out.println(science);

        //Maths.getQuestion();

    }
    
    private static String retrieveCategoryData(String category) {
        StringBuilder sb = new StringBuilder();

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String sqlQuery = "SELECT * FROM PDC.NEWQUIZ WHERE CATEGORY = ?";
            PreparedStatement stmt = conn.prepareStatement(sqlQuery);
            stmt.setString(1, category);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String questionId = rs.getString("QUESTID");
                String question = rs.getString("QUESTION");
                String pa1 = rs.getString("PA1");
                String pa2 = rs.getString("PA2");
                String pa3 = rs.getString("PA3");
                String pa4 = rs.getString("PA4");
                String ans = rs.getString("ANS");
                    
                sb.append("Question ID: ").append(questionId).append("\n");
                sb.append("Question: ").append(question).append("\n");
                sb.append("PA1: ").append(pa1).append("\n");
                sb.append("PA2: ").append(pa2).append("\n");
                sb.append("PA3: ").append(pa3).append("\n");
                sb.append("PA4: ").append(pa4).append("\n");
                sb.append("Answer: ").append(ans).append("\n");
                sb.append("\n");
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return sb.toString();
    }
}
