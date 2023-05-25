package Proj2;

import java.sql.*;
import java.util.*;

public class NewClass3 {
    private static final String DB_URL = "jdbc:derby://localhost:1527/Questions and Answers";
    private static final String DB_USER = "pdc";
    private static final String DB_PASSWORD = "pdc";

    public static void main(String[] args) {
        // Retrieve the data for all categories
        String mathsData = retrieveCategoryData("Maths");
        String scienceData = retrieveCategoryData("Science");
        String popCultureData = retrieveCategoryData("Pop Culture");
        String geographyData = retrieveCategoryData("Geography");
        String sportsData = retrieveCategoryData("Sports");

        // Test the retrieval of data for the "Maths" category
        System.out.println("Maths Data:");
        System.out.println(mathsData);

        // Test the retrieval of data for the "Science" category
        System.out.println("Science Data:");
        //System.out.println(scienceData);

        // Test the retrieval of data for the "Pop Culture" category
        System.out.println("Pop Culture Data:");
        //System.out.println(popCultureData);

        // Test the retrieval of data for the "Geography" category
        System.out.println("Geography Data:");
        //System.out.println(geographyData);

        // Test the retrieval of data for the "Sports" category
        System.out.println("Sports Data:");
        //System.out.println(sportsData);
    }

    private static String retrieveCategoryData(String category) {
        StringBuilder sb = new StringBuilder();

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String sqlQuery = "SELECT * FROM PDC.QUIZ WHERE CATEGORY = ?";
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