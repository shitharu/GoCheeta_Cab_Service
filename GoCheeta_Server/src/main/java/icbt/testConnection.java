/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icbt;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Tharushi Dhananjika
 */
public class testConnection {
    public static void main(String[] args){
        Connection conn = null;
        
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/icbt_ngg","icbt","icbt");
            if(conn!=null)
            {
                System.out.println("Connected to databace Successfully");
            }
            
        }catch(Exception e)
        {
            System.out.println("Not Connected to databace");
        }
    }
}
