/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icbt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tharushi Dhananjika
 */
public class DBGoCheeta {
    
    static final String DB_URL = "jdbc:mysql://localhost/gocheeta?allowPublicKeyRetrieval=true&useSSL=false";
    static final String USER = "root";
    static final String PASS = "1007@wpTd";
    
    public Driverr getDriverr(int id){
        Driverr dvr = new Driverr();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);          
            Statement statement = conn.createStatement();
            
            ResultSet resultSet = statement.executeQuery("SELECT * FROM driverrs WHERE id=" + id);
    
            resultSet.next();
            dvr.setId(resultSet.getInt("id"));
            dvr.setName(resultSet.getString("name"));
            dvr.setTelno(resultSet.getInt("telno"));
            dvr.setBranch(resultSet.getString("branch"));
            
            //System.err.println(resultSet.getString("name"));
            
            
        }catch(ClassNotFoundException | SQLException e){
            
            System.out.println(e.getMessage());
            
        }
        return dvr;
      
    }
    
    public List<Driverr> getDriverrs(){
        
        List<Driverr> driverrs = new ArrayList<>();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);          
            Statement statement = conn.createStatement();
            
            ResultSet resultSet = statement.executeQuery("SELECT * FROM driverrs");
    
            while(resultSet.next()){
                Driverr dvr = new Driverr();
                
                dvr.setId(resultSet.getInt("id"));
                dvr.setName(resultSet.getString("name"));
                dvr.setTelno(resultSet.getInt("telno"));
                dvr.setBranch(resultSet.getString("branch"));
                driverrs.add(dvr);
            }
            
        }catch(ClassNotFoundException | SQLException e){
            
            System.out.println(e.getMessage());
            
        }
        return driverrs;
    }
    
 
    
    public boolean addDriverr(Driverr dvr){
        int rowAffected = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);          
            Statement statement = conn.createStatement();
            
            rowAffected = statement.executeUpdate("INSERT INTO `driverrs` VALUES (" + dvr.getId() + ",'" + dvr.getName() + "'," + dvr.getTelno() + ",'" + dvr.getBranch() + "')");
           
        }catch(ClassNotFoundException | SQLException e){
            
            System.out.println(e.getMessage());
            
        }
        return rowAffected > 0;
    }
    
    
    public boolean updateDriverr(Driverr dvr){
        int rowAffected = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);          
            Statement statement = conn.createStatement();
            
            rowAffected = statement.executeUpdate("UPDATE `driverrs` SET `name` = '"+ dvr.getName() + "', `telno` = " + dvr.getTelno() + ", `branch` = '" + dvr.getBranch() + "' WHERE (`id` = '"+ dvr.getId() + "');");
            
        }catch(ClassNotFoundException | SQLException e){
            
            System.out.println(e.getMessage());
            
        }
        return rowAffected > 0;
    }
    
    
    
    public boolean deleteDriverr(int id){
        int rowAffected = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);          
            Statement statement = conn.createStatement();
            
            rowAffected = statement.executeUpdate("DELETE FROM `driverrs` WHERE (`id` = '" + id + "');");
               
            //System.err.println(resultSet.getString("name"));
            
        }catch(ClassNotFoundException | SQLException e){
            
            System.out.println(e.getMessage());
            
        }
        return rowAffected > 0;
    }
    
}

