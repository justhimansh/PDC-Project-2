/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proj2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Owner
 */
public final class Database {
    private static String USERNAME = "pdc";
    private static String PASSWORD = "pdc";
    private static String URL = "jdbc:derby:Questions and Answers; create=true";
    
    private Connection conn;
    
    public Database() throws SQLException{
        establishConnection();
    }
    
    public Connection getConnection(){
        return this.getConn();
    }
    
    public void establishConnection() throws SQLException {
        setConn(DriverManager.getConnection(getURL(), getUSERNAME(), getPASSWORD()));
    }
    
    public static String getUSERNAME(){
        return USERNAME;
    }
    
    public static void setUSERNAME(String aUSERNAME){
        USERNAME = aUSERNAME;
    }
    
    public static String getPASSWORD(){
        return PASSWORD;
    }
    
    public static void setPASSWORD(String aPASSWORD){
        PASSWORD = aPASSWORD;
    }
    
    public static String getURL(){
        return URL;
    }
    
    public static void setURL (String aURL) {
        URL = aURL;
    }
    
    public Connection getConn() {
        return conn;
    }
    
    public void setConn(Connection aConn){
        this.conn = aConn;
    }
    
}
