/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proj2;

import static Proj2.Information.maths;
import static Proj2.Information.science;
import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;

/**
 *
 * @author Owner
 */
public class GameDatabase {
    private Database database;
    private Connection conn;
    public static Statement statement;
    public static String maths = "";
    public static String science = "";
    
    public GameDatabase() throws SQLException {
        database = new Database();
        conn = database.getConnection();
    }
    
    public void createGameDatabase() throws SQLException {
        //DriverManager.getConnection(Database.getURL(),Database.getUSERNAME(),Database.getPASSWORD());
        setStatement(getConn().createStatement());
        
        try {
        
        getStatement().addBatch("DROP TABLE NEWQUIZ");
        getStatement().addBatch("CREATE TABLE NEWQUIZ (CATEGORY VARCHAR(50), QUESTID VARCHAR(50), QUESTION VARCHAR(255), PA1 VARCHAR(255), PA2 VARCHAR(255), PA3 VARCHAR(255), PA4 VARCHAR(255), ANS VARCHAR(255))");
        //getStatement().addBatch("CREATE SCHEMA PDC AUTHORIZATION PDC");
        getStatement().addBatch("INSERT INTO NEWQUIZ (CATEGORY, QUESTID, QUESTION, PA1, PA2, PA3, PA4, ANS) VALUES ('Pop Culture', 'q1', 'Which actor portrayed the character Iron Man in the Marvel Cinematic Universe?', 'Chris Hemsworth', 'Chris Pratt', 'Robert Downey Jr.', 'Chris Evans', 'Robert Downey Jr.'),\n" +
"    ('Pop Culture', 'q2', 'What is the title of Taylor Swift''s first studio album?', 'Fearless', 'Red', 'Speak Now', 'Taylor Swift', 'Taylor Swift'),\n" +
"    ('Pop Culture', 'q3', 'In the TV show \"Stranger Things,\" what is the name of the alternate dimension?', 'The Upside Down', 'The Shadow Realm', 'The Twilight Zone', 'The Other Side', 'The Upside Down'),\n" +
"    ('Pop Culture', 'q4', 'Who played the role of Katniss Everdeen in \"The Hunger Games\" film series?', 'Emma Watson', 'Jennifer Lawrence', 'Kristen Stewart', 'Scarlett Johansson', 'Jennifer Lawrence'),\n" +
"    ('Pop Culture', 'q5', 'Which artist released the hit song \"Shape of You\" in 2017?', 'Justin Bieber', 'Ed Sheeran', 'Bruno Mars', 'Shawn Mendes', 'Ed Sheeran'),\n" +
"    ('Pop Culture', 'q6', 'Which fictional city is the home of Batman?', 'Central City', 'Metropolis', 'Gotham City', 'Star City', 'Gotham City'),\n" +
"    ('Pop Culture', 'q7', 'What is the highest-grossing film of all time (as of 2021)?', 'Avengers: Endgame', 'Avatar', 'Titanic', 'Star Wars: The Force Awakens', 'Avengers: Endgame'),\n" +
"    ('Pop Culture', 'q8', 'Which singer famously wore a meat dress to the 2010 MTV Video Music Awards?', 'Lady Gaga', 'BeyoncÃ©', 'Rihanna', 'Katy Perry', 'Lady Gaga'),\n" +
"    ('Pop Culture', 'q9', 'In the TV series \"Game of Thrones,\" which family''s motto is \"Winter is Coming\"?', 'Stark', 'Lannister', 'Targaryen', 'Baratheon', 'Stark'),\n" +
"    ('Pop Culture', 'q10', 'Who won the Academy Award for Best Actor for his role in the film \"The Revenant\"?', 'Leonardo DiCaprio', 'Brad Pitt', 'Tom Hanks', 'Joaquin Phoenix', 'Leonardo DiCaprio'),\n" +
"    ('Geography', 'q1', 'What is the capital city of Australia?', 'Melbourne', 'Sydney', 'Canberra', 'Perth', 'Canberra'),\n" +
"    ('Geography', 'q2', 'Which continent is the largest by land area?', 'Europe', 'Asia', 'Africa', 'South America', 'Asia'),\n" +
"    ('Geography', 'q3', 'Which country is home to the tallest mountain in the world, Mount Everest?', 'China', 'Nepal', 'India', 'Tibet', 'Nepal'),\n" +
"    ('Geography', 'q4', 'What is the longest river in the world?', 'Amazon River', 'Nile River', 'Mississippi River', 'Yangtze River', 'Nile River'),\n" +
"    ('Geography', 'q5', 'Which city is located on two continents?', 'Istanbul', 'Rome', 'Cairo', 'Athens', 'Istanbul'),\n" +
"    ('Geography', 'q6', 'Which country is known as the \"Land of the Rising Sun\"?', 'China', 'Japan', 'South Korea', 'Thailand', 'Japan'),\n" +
"    ('Geography', 'q7', 'What is the largest country in South America by land area?', 'Brazil', 'Argentina', 'Colombia', 'Peru', 'Brazil'),\n" +
"    ('Geography', 'q8', 'Which African country is famous for its pyramids?', 'Egypt', 'Kenya', 'Nigeria', 'South Africa', 'Egypt'),\n" +
"    ('Geography', 'q9', 'Which U.S. state is known as the \"Sunshine State\"?', 'California', 'Texas', 'Florida', 'Hawaii', 'Florida'),\n" +
"    ('Geography', 'q10', 'Which country is home to the Great Barrier Reef, the world''s largest coral reef system?', 'Australia', 'Brazil', 'Indonesia', 'Mexico', 'Australia'),\n" +
"('Sports', 'q1', 'Which country won the FIFA World Cup in 2018?', 'Germany', 'Brazil', 'France', 'Argentina', 'France'),\n" +
"    ('Sports', 'q2', 'Who holds the record for the most home runs in Major League Baseball (MLB) history?', 'Hank Aaron', 'Babe Ruth', 'Barry Bonds', 'Alex Rodriguez', 'Barry Bonds'),\n" +
"    ('Sports', 'q3', 'In which sport do athletes compete for the Davis Cup?', 'Tennis', 'Golf', 'Cricket', 'Rugby', 'Tennis'),\n" +
"    ('Sports', 'q4', 'Which athlete has the most Olympic gold medals of all time?', 'Michael Phelps', 'Usain Bolt', 'Carl Lewis', 'Simone Biles', 'Michael Phelps'),\n" +
"    ('Sports', 'q5', 'Which tennis player has won the most Grand Slam singles titles in the Open Era?', 'Serena Williams', 'Roger Federer', 'Rafael Nadal', 'Steffi Graf', 'Serena Williams'),\n" +
"    ('Sports', 'q6', 'Which country did the sport of basketball originate from?', 'United States', 'Canada', 'Australia', 'China', 'United States'),\n" +
"    ('Sports', 'q7', 'Who is the all-time leading scorer in the National Basketball Association (NBA)?', 'Kareem Abdul-Jabbar', 'Michael Jordan', 'LeBron James', 'Kobe Bryant', 'Kareem Abdul-Jabbar'),\n" +
"    ('Sports', 'q8', 'Which country hosted the 2016 Summer Olympics?', 'China', 'United States', 'Brazil', 'Russia', 'Brazil'),\n" +
"    ('Sports', 'q9', 'Who won the FIFA Women''s World Cup in 2019?', 'United States', 'Germany', 'France', 'Brazil', 'United States'),\n" +
"    ('Sports', 'q10', 'Which Formula 1 driver holds the record for the most World Drivers'' Championship titles?', 'Michael Schumacher', 'Lewis Hamilton', 'Ayrton Senna', 'Sebastian Vettel', 'Lewis Hamilton'),\n" +
"('Maths', 'q1', 'If David’s age is 27 years old in 2011. What was his age in 2003?', '17 years', '37 years', '20 years', '19 years', '19 years'),\n" +
"    ('Maths', 'q2', 'What is 8% equal to?', '0.008', '0.08', '0.8', '8', '0.08'),\n" +
"    ('Maths', 'q3', 'How many years are there in a decade?', '5', '10', '15', '20', '10'),\n" +
"    ('Maths', 'q4', 'Find the Missing Term in Multiples of 6: 6, 12, 18, 24, _, 36, 42, _ 54, 60.', '32, 45', '30, 48', '24, 40', '25, 49', '30, 48'),\n" +
"    ('Maths', 'q5', 'How Many Months Make a Century?', '12', '1200', '120', '12000', '1200'),\n" +
"    ('Maths', 'q6', 'How Many Months Have 120 Days?', '4', '2', '6', '5', '4'),\n" +
"    ('Maths', 'q7', 'Simplify: {36 ÷ (-9)} ÷ {(-24) ÷ 6}', '2', '-1', '1', '3', '1'),\n" +
"    ('Maths', 'q8', 'A clock seen through a mirror shows quarter past three. What is the correct time shown by the clock?', '3.15', '8.45', '9.15', '9.45', '8.45'),\n" +
"    ('Maths', 'q9', 'Tom was not at school on Saturday last. He was first absent for four days before that. Today is Monday, the 31st of October. When was Tom first absent? Give the day and date.', 'Monday, Oct. 24', 'Tuesday, Oct. 25', 'Wednesday, Oct. 26', 'Thursday, Oct. 27', 'Tuesday, Oct. 25'),\n" +
"    ('Maths', 'q10', 'Which of the following numbers gives 240 when added to its own square?', '15', '16', '18', '20', '15'),\n" +
"    ('Science', 'q1', 'What is the PH of H2O?', '6', '8', '7', '5', '7'),\n" +
"    ('Science', 'q2', 'What is the S.I unit of frequency?', 'Diopter', 'Second', 'Hertz', 'Meter', 'Hertz'),\n" +
"    ('Science', 'q3', 'Acid turns blue litmus paper into which color?', 'Black', 'Blue', 'Red', 'Orange', 'Red'),\n" +
"    ('Science', 'q4', 'What is the basic unit of our neural system?', 'Neutron', 'Neuron', 'Nephron', 'Nucleon', 'Neuron'),\n" +
"    ('Science', 'q5', 'What is the PH range of acids?', '0 - 7', '7 - 14', '1 - 7', '7 - 15', '0 - 7'),\n" +
"    ('Science', 'q6', 'Name the metal which is most ductile?', 'Gold', 'Silver', 'Copper', 'Iron', 'Gold'),\n" +
"    ('Science', 'q7', 'What is the S.I unit of current?', 'Coulomb', 'Ampere', 'Ohm', 'Volt', 'Ampere'),\n" +
"    ('Science', 'q8', 'Name the part of the eye on which image is formed?', 'Cornea', 'Lens', 'Optical nerves', 'Brain', 'Lens'),\n" +
"    ('Science', 'q9', 'What is the chemical formula of alcohol?', 'C2H5OH', 'C2H5', 'C2H5COOH', 'C2H5O', 'C2H5OH'),\n" +
"    ('Science', 'q10', 'What is the scientific name of frog?', 'Anura', 'Homo sapiens', 'Felis catus', 'Mangifera indica', 'Anura'),\n" +
"    ('History', 'q1', 'In which year did World War I begin?', '1923', '1914', '1917', '1913', '1914'),\n" +
"    ('History', 'q2', 'Where was John F. Kennedy assassinated?', 'New York', 'Austin', 'Dallas', 'Miami', 'Dallas'),\n" +
"    ('History', 'q3', 'By the king of which country was the Magna Carta published?', 'France', 'Austria', 'Italy', 'England', 'England'),\n" +
"    ('History', 'q4', 'The disease that ravaged and killed a third of Europe''s population in the 14th century is known as:', 'The White Death', 'Plague (Black Death)', 'Smallpox', 'Malaria', 'Plague (Black Death)'),\n" +
"    ('History', 'q5', 'Which Roman Emperor built a massive wall across Northern Britain in 122 A.D.?', 'Marcus Aurelius', 'Hadrian', 'Nero', 'Augustus', 'Hadrian'),\n" +
"    ('History', 'q6', 'Who was the first Western explorer to reach China?', 'Magellan', 'Cook', 'Marco Polo', 'Sir Francis Drake', 'Marco Polo'),\n" +
"    ('History', 'q7', 'Which of the following were the two main cities of ancient Greece?', 'Rome and Alexandira', 'Sparta and Athens', 'Cornith and Olympia', 'Thebes and Argos', 'Sparta and Athens'),\n" +
"    ('History', 'q8', 'Which of the following was the first English sailor who went round the world?', 'William Adams', 'John Cook', 'Francis Drake', 'Magellan', 'Francis Drake'),\n" +
"    ('History', 'q9', 'What were members of Jacobin Club known as?', 'Revolutionaries', 'Conservatives', 'Terrorists', 'San-culottes', 'San-culottes'),\n" +
"    ('History', 'q10', 'Which of the following invented in 1878 the electric light?', 'Graham Bell', 'Thomas Alva Edison', 'John Macadam', 'None of the above', 'Thomas Alva Edison')");
        
     
        int[] results = getStatement().executeBatch();

        for (int i = 0; i < results.length; i++) {
            if (results[i] == Statement.EXECUTE_FAILED) {
                System.err.println("Error executing statement at index: " + i);
            }
        }
    } catch (BatchUpdateException e) {
        int[] updateCounts = e.getUpdateCounts();
        for (int i = 0; i < updateCounts.length; i++) {
            if (updateCounts[i] == Statement.EXECUTE_FAILED) {
                System.err.println("Error executing statement at index: " + i);
                SQLException ex = e.getNextException();
                if (ex != null) {
                    ex.printStackTrace();
                }
            }
        }
    } finally {
        if (getStatement() != null) {
            getStatement().close();
        }
    }
        
        
    }
    
    public void retrieveGameInfo() throws SQLException {
        StringBuilder sb = new StringBuilder();
        
        setStatement(getConn().createStatement());
        ResultSet rs = getStatement().executeQuery("SELECT * FROM NEWQUIZ");
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
                
                
                System.out.println(questionId + pa1 + pa2 + ans);
                       
        }
    }
    
    public static void Retrieve(){
        
        String mathsData = retrieveCategoryData("Maths");
        String scienceData = retrieveCategoryData("Science");
        String popCultureData = retrieveCategoryData("Pop Culture");
        String geographyData = retrieveCategoryData("Geography");
        String sportsData = retrieveCategoryData("Sports");
        
        maths = mathsData;
        science = scienceData;
        
        System.out.println(mathsData);
        
        
               

    }
    
    public static String retrieveCategoryData(String category) {
        StringBuilder sb = new StringBuilder();

        try (Connection conn = DriverManager.getConnection(Database.getURL(), Database.getUSERNAME(), Database.getPASSWORD())) {
            String sqlQuery = "SELECT * FROM NEWQUIZ WHERE CATEGORY = ?";
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
    
    public Database getDatabase(){
        return database;
    }
    
    public static void setDatabase(Database database){
        database = database;
    }
    
    public Connection getConn(){
        return conn;
    }
    
    public void setConn(Connection conn){
        this.conn = conn;
    }
    
    public static Statement getStatement(){
        return statement;
    }
    
    public static void setStatement(Statement stmt) {
    statement = stmt;
}
    
}
