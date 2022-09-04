/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GoCheeta;

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
    
    public Driver getDriver(int id){
        Driver dv = new Driver();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);          
            Statement statement = conn.createStatement();
            
            System.out.print("connected");
            
            ResultSet resultSet = statement.executeQuery("SELECT * FROM drivers WHERE id=" + id);
    
            resultSet.next();
            dv.setId(resultSet.getInt("id"));
            dv.setName(resultSet.getString("name"));
            dv.settelno(resultSet.getInt("telno"));
            dv.setbranch(resultSet.getString("branch"));
            dv.setvehicle(resultSet.getString("vehicle"));
            
          
            
        }catch(ClassNotFoundException | SQLException e){
            System.out.print("not connected");
            System.out.println(e.getMessage());
            
        }
        
        return dv;
      
    }
    
    public List<Driver> getDrivers(){
        
        List<Driver> drivers = new ArrayList<>();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);          
            Statement statement = conn.createStatement();
            
            ResultSet resultSet = statement.executeQuery("SELECT * FROM drivers");
    
            while(resultSet.next()){
                Driver dv = new Driver();
                
                dv.setId(resultSet.getInt("id"));
                dv.setName(resultSet.getString("name"));
                dv.settelno(resultSet.getInt("telno"));
                dv.setbranch(resultSet.getString("branch"));
                dv.setvehicle(resultSet.getString("vehicle"));
            
                drivers.add(dv);
            }
                
        }catch(ClassNotFoundException | SQLException e){
            
            System.out.println(e.getMessage());
            
        }
        return drivers;
    }
    
    
    public boolean addDriver(Driver dv){
        int rowAffected = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);          
            Statement statement = conn.createStatement();
            
            rowAffected = statement.executeUpdate("INSERT INTO `drivers` VALUES (" + dv.getId() + ",'" + dv.getName() + "'," + dv.gettelno() + ",'" + dv.getbranch() + "','" + dv.getvehicle() + "')");
             //  INSERT INTO `icbt_ngg`.`students` (`id`, `name`) VALUES ('7', 'Link');
            //System.err.println(resultSet.getString("name"));
            
            
        }catch(ClassNotFoundException | SQLException e){
            
            System.out.println(e.getMessage());
            
        }
        return rowAffected > 0;
    }
}
