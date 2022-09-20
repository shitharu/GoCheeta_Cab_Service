/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icbt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
    
    static final String DB_URL =
        "jdbc:mysql://localhost/gocheeta?allowPublicKeyRetrieval=true&useSSL=false";
    static final String USER = "root";
    static final String PASS = "1007@wpTd";
    
    private Connection con;
    private Statement stmt;
    private ResultSet rs;
    
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
    
    public User getUserbyId(int id) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            this.stmt  = conn.createStatement();
            this.rs    = this.stmt.executeQuery("SELECT * FROM users WHERE users.id = " + id);
            
            if(rs.next()) {
                User user = new User();
                
                user.setFirstname(rs.getString("firstname"));
                user.setLastname(rs.getString("lastname"));
                user.setNic(rs.getString("nic"));
                user.setAddress(rs.getString("address"));
                user.setMobile(rs.getInt("mobile"));
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                
                return user;
            } else {
                return null;
            }
            
        } catch(ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public Driverr getDriverrbyId(int id) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            this.stmt  = conn.createStatement();
            this.rs    = this.stmt.executeQuery("SELECT * FROM driverrs WHERE driverrs.id = " + id);
            
            if(rs.next()) {
                Driverr driverr = new Driverr();
                driverr.setId(rs.getInt("id"));
                driverr.setName(rs.getString("name"));
                driverr.setTelno(rs.getInt("telno"));
                driverr.setBranch(rs.getString("branch"));
                
                return driverr;
            } else {
                return null;
            }
            
        } catch(ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public Car getCarbyId(int carid) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            this.stmt  = conn.createStatement();
            this.rs    = this.stmt.executeQuery("SELECT * FROM car WHERE car.carid = " + carid);
            
            if(rs.next()) {
                Car car = new Car();
                car.setCarid(rs.getInt("carid"));
                car.setStartcity(rs.getString("startcity"));
                car.setEndcity(rs.getString("endcity"));
                car.setDestination(rs.getString("destination"));
                car.setPrice(rs.getInt("price"));
                
                return car;
            } else {
                return null;
            }
            
        } catch(ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public Van getVanbyId(int vanid) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            this.stmt  = conn.createStatement();
            this.rs    = this.stmt.executeQuery("SELECT * FROM van WHERE van.vanid = " + vanid);
            
            if(rs.next()) {
                Van van = new Van();
                van.setVanid(rs.getInt("vanid"));
                van.setStartcity(rs.getString("startcity"));
                van.setEndcity(rs.getString("endcity"));
                van.setDestination(rs.getString("destination"));
                van.setPrice(rs.getInt("price"));
                
                return van;
            } else {
                return null;
            }
            
        } catch(ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    
    public boolean addDriverr(Driverr dvr){
        int rowAffected = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);          
            Statement statement = conn.createStatement();
            
            rowAffected = statement.executeUpdate("INSERT INTO `driverrs` VALUES (" + dvr.getId() + ",'" + dvr.getName() + "'," + dvr.getTelno() + ",'" + dvr.getBranch() + "','" + dvr.getVehicle()+ "','" + dvr.getPassword() + "','" + dvr.getEmail() + "')");
           
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
    
    public boolean updateCar(Car car){
        int rowAffected = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);          
            Statement statement = conn.createStatement();
            
            rowAffected = statement.executeUpdate("UPDATE `car` SET `startcity` = '"+ car.getStartcity() + "', `endcity` = '" + car.getEndcity() + "', `destination` = '" + car.getDestination()+ "', `price` = " + car.getPrice()+ " WHERE (`carid` = '"+ car.getCarid() + "');");
            
        }catch(ClassNotFoundException | SQLException e){
            
            System.out.println(e.getMessage());
            
        }
        return rowAffected > 0;
    }
    
    
    public boolean updateVan(Van van){
        int rowAffected = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);          
            Statement statement = conn.createStatement();
            
            rowAffected = statement.executeUpdate("UPDATE `van` SET `startcity` = '"+ van.getStartcity() + "', `endcity` = '" + van.getEndcity() + "', `destination` = '" + van.getDestination()+ "', `price` = " + van.getPrice()+ " WHERE (`varid` = '"+ van.getVanid() + "');");
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
    
    public boolean deleteUser(int id){
        int rowAffected = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);          
            Statement statement = conn.createStatement();
            
            rowAffected = statement.executeUpdate("DELETE FROM `users` WHERE (`id` = '" + id + "');");
               
            
        }catch(ClassNotFoundException | SQLException e){
            
            System.out.println(e.getMessage());
            
        }
        return rowAffected > 0;
    }
    
    
    public boolean deleteCar(int carid){
        int rowAffected = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);          
            Statement statement = conn.createStatement();
            
            rowAffected = statement.executeUpdate("DELETE FROM `car` WHERE (`carid` = '" + carid + "');");
               
            
        }catch(ClassNotFoundException | SQLException e){
            
            System.out.println(e.getMessage());
            
        }
        return rowAffected > 0;
    }
    
    
    public boolean deleteVan(int vanid){
        int rowAffected = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);          
            Statement statement = conn.createStatement();
            
            rowAffected = statement.executeUpdate("DELETE FROM `van` WHERE (`vanid` = '" + vanid + "');");
               
            
        }catch(ClassNotFoundException | SQLException e){
            
            System.out.println(e.getMessage());
            
        }
        return rowAffected > 0;
    }
    
    public boolean addUser(User user){
        int rowAffected = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);          
            Statement statement = conn.createStatement();
            
            rowAffected = statement.executeUpdate("INSERT INTO `users` VALUES ('" + user.getFirstname() + "','" + user.getLastname() + "','" + user.getNic() + "','" + user.getAddress() + "','" + user.getEmail() + "'," + user.getMobile() + "," + user.getId() + ",'" + user.getUsername() + "','" + user.getPassword() + "')");
           
            
        }catch(ClassNotFoundException | SQLException e){
            
            System.out.println(e.getMessage());
            
        }
        return rowAffected > 0;
    }
    
    
    public List<User> getUsers(){
        
        List<User> users = new ArrayList<>();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);          
            Statement statement = conn.createStatement();
            
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");
    
            while(resultSet.next()){
                User user = new User();
                
                user.setFirstname(resultSet.getString("firstname"));
                user.setLastname(resultSet.getString("lastname"));
                user.setNic(resultSet.getString("nic"));
                user.setAddress(resultSet.getString("address"));
                user.setEmail(resultSet.getString("email"));
                user.setMobile(resultSet.getInt("mobile"));
                user.setId(resultSet.getInt("id"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                users.add(user);
            }
            
        }catch(ClassNotFoundException | SQLException e){
            
            System.out.println(e.getMessage());
            
        }
        return users;
    }
    
    
    public User getUser(int id){
        User u = new User();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);          
            Statement statement = conn.createStatement();
            
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users WHERE id=" + id);
    
            resultSet.next();
                u.setFirstname(resultSet.getString("firstname"));
                u.setLastname(resultSet.getString("lastname"));
                u.setNic(resultSet.getString("nic"));
                u.setAddress(resultSet.getString("address"));
                u.setEmail(resultSet.getString("email"));
                u.setMobile(resultSet.getInt("mobile"));
                u.setId(resultSet.getInt("id"));
                u.setUsername(resultSet.getString("username"));
                u.setPassword(resultSet.getString("password"));
            
            
        }catch(ClassNotFoundException | SQLException e){
            
            System.out.println(e.getMessage());
            
        }
        return u;
      
    }
    
    public boolean addCar(Car car){
        int rowAffected = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);          
            Statement statement = conn.createStatement();
            
            rowAffected = statement.executeUpdate("INSERT INTO `car` VALUES (" + car.getCarid() + ",'" + car.getStartcity() + "','" + car.getEndcity() + "','" + car.getDestination() + "'," + car.getPrice()+ ")");
           
        }catch(ClassNotFoundException | SQLException e){
            
            System.out.println(e.getMessage());
            
        }
        return rowAffected > 0;
    }
    
    public List<Car> getCars(){
        
        List<Car> cars = new ArrayList<>();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);          
            Statement statement = conn.createStatement();
            
            ResultSet resultSet = statement.executeQuery("SELECT * FROM car");
    
            while(resultSet.next()){
                Car car = new Car();
                
                car.setCarid(resultSet.getInt("carid"));
                car.setStartcity(resultSet.getString("startcity"));
                car.setEndcity(resultSet.getString("endcity"));
                car.setDestination(resultSet.getString("destination"));
                car.setPrice(resultSet.getInt("price"));
                
                cars.add(car);
            }
            
        }catch(ClassNotFoundException | SQLException e){
            
            System.out.println(e.getMessage());
            
        }
        return cars;
    }
    
    public Car getCar(int carid){
        Car car = new Car();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);          
            Statement statement = conn.createStatement();
            
            ResultSet resultSet = statement.executeQuery("SELECT * FROM car WHERE carid=" + carid);
    
            resultSet.next();
                car.setCarid(resultSet.getInt("carid"));
                car.setStartcity(resultSet.getString("startcity"));
                car.setEndcity(resultSet.getString("endcity"));
                car.setDestination(resultSet.getString("destination"));
                car.setPrice(resultSet.getInt("price"));
                
            
            
        }catch(ClassNotFoundException | SQLException e){
            
            System.out.println(e.getMessage());
            
        }
        return car;
      
    }
    
    
    
    public List<Driverr> getCarsOnly(){
        
        List<Driverr> driverrs = new ArrayList<>();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);          
            Statement statement = conn.createStatement();
            
            ResultSet resultSet = statement.executeQuery("SELECT * FROM driverrs WHERE vehicle='car'");
    
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
    
    public Van getVan(int vanid){
        Van van = new Van();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);          
            Statement statement = conn.createStatement();
            
            ResultSet resultSet = statement.executeQuery("SELECT * FROM van WHERE vanid=" + vanid);
    
            resultSet.next();
                van.setVanid(resultSet.getInt("carid"));
                van.setStartcity(resultSet.getString("startcity"));
                van.setEndcity(resultSet.getString("endcity"));
                van.setDestination(resultSet.getString("destination"));
                van.setPrice(resultSet.getInt("price"));
                
            
            
        }catch(ClassNotFoundException | SQLException e){
            
            System.out.println(e.getMessage());
            
        }
        return van;
      
    }
    
    public List<Van> getVans(){
        
        List<Van> vans = new ArrayList<>();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);          
            Statement statement = conn.createStatement();
            
            ResultSet resultSet = statement.executeQuery("SELECT * FROM van");
    
            while(resultSet.next()){
                Van van = new Van();
                
                van.setVanid(resultSet.getInt("vanid"));
                van.setStartcity(resultSet.getString("startcity"));
                van.setEndcity(resultSet.getString("endcity"));
                van.setDestination(resultSet.getString("destination"));
                van.setPrice(resultSet.getInt("price"));
                
                vans.add(van);
            }
            
        }catch(ClassNotFoundException | SQLException e){
            
            System.out.println(e.getMessage());
            
        }
        return vans;
    }
    
    public List<Driverr> getVansOnly(){
        
        List<Driverr> driverrs = new ArrayList<>();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);          
            Statement statement = conn.createStatement();
            
            ResultSet resultSet = statement.executeQuery("SELECT * FROM driverrs WHERE vehicle='van'");
    
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
    
    
    public boolean authCustomer(String email, String password) {
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);          
            Statement statement = conn.createStatement();

            String sql = "SELECT * FROM users WHERE users.email = '"+email+"' AND users.password = '"+password+"';";
            ResultSet rs = statement.executeQuery(sql);
            return rs.next();
            
        } catch (ClassNotFoundException | SQLException e) {
            
            System.out.print(e.getMessage());
            return false;
        }
    }
    
    public boolean authCustomerD(String email, String password) {
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);          
            Statement statement = conn.createStatement();

            String sql = "SELECT * FROM driverrs WHERE driverrs.email = '"+email+"' AND driverrs.password = '"+password+"';";
            ResultSet rs = statement.executeQuery(sql);
            return rs.next();
            
        } catch (ClassNotFoundException | SQLException e) {
            
            System.out.print(e.getMessage());
            return false;
        }
    }
    
    public boolean authCustomerA(String email, String password) {
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);          
            Statement statement = conn.createStatement();

            String sql = "SELECT * FROM admin WHERE admin.email = '"+email+"' AND admin.password = '"+password+"';";
            ResultSet rs = statement.executeQuery(sql);
            return rs.next();
            
        } catch (ClassNotFoundException | SQLException e) {
            
            System.out.print(e.getMessage());
            return false;
        }
    }
    
    
    public boolean addContactUs(Contact cnt){
        int rowAffected = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);          
            Statement statement = conn.createStatement();
            
            rowAffected = statement.executeUpdate("INSERT INTO `messages` VALUES (" + cnt.getId() + ", '" + cnt.getName() + "'," + cnt.getMobile() + ",'" + cnt.getMessage() + "')");
           
        }catch(ClassNotFoundException | SQLException e){
            
            System.out.println(e.getMessage());
            
        }
        return rowAffected > 0;
    }
    
    
    public List<Contact> getMessages(){
        
        List<Contact> messages = new ArrayList<>();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);          
            Statement statement = conn.createStatement();
            
            ResultSet resultSet = statement.executeQuery("SELECT * FROM messages");
    
            while(resultSet.next()){
                Contact cnt = new Contact();
                
                cnt.setId(resultSet.getInt("id"));
                cnt.setName(resultSet.getString("name"));
                cnt.setMobile(resultSet.getInt("mobile"));
                cnt.setMessage(resultSet.getString("message"));
                messages.add(cnt);
            }
            
        }catch(ClassNotFoundException | SQLException e){
            
            System.out.println(e.getMessage());
            
        }
        return messages;
    }
    
    public Car getLocation(int carid){
        Car car = new Car();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);          
            Statement statement = conn.createStatement();
            
            ResultSet resultSet = statement.executeQuery("SELECT * FROM car WHERE carid=" + carid);
    
            resultSet.next();
                car.setCarid(resultSet.getInt("carid"));
                car.setStartcity(resultSet.getString("startcity"));
                car.setEndcity(resultSet.getString("endcity"));
                car.setDestination(resultSet.getString("destination"));
                car.setPrice(resultSet.getInt("price"));
                
            
            
        }catch(ClassNotFoundException | SQLException e){
            
            System.out.println(e.getMessage());
            
        }
        return car;
      
    }
    
//    public boolean addCarr(Car car){
//        int rowAffected = 0;
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);          
//            Statement statement = conn.createStatement();
//            
//            rowAffected = statement.executeUpdate("INSERT INTO `car` VALUES (" + car.getCarid()+ ",'" + car.getStartcity()+ "','" + car.getEndcity()+ "','" + car.getDestination()+ "'," + car.getPrice()+ ")");
//           
//            
//        }catch(ClassNotFoundException | SQLException e){
//            
//            System.out.println(e.getMessage());
//            
//        }
//        return rowAffected > 0;
//    }
    

//    public boolean addVann(Van van){
//        int rowAffected = 0;
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);          
//            Statement statement = conn.createStatement();
//            
//            rowAffected = statement.executeUpdate("INSERT INTO `van` VALUES (" + van.getVanid()+ ",'" + van.getStartcity()+ "','" + van.getEndcity()+ "','" + van.getDestination()+ "'," + van.getPrice()+ ")");
//           
//            
//        }catch(ClassNotFoundException | SQLException e){
//            
//            System.out.println(e.getMessage());
//            
//        }
//        return rowAffected > 0;
//    }
    
    
    public boolean addVan(Van van){
        int rowAffected = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);          
            Statement statement = conn.createStatement();
            
            rowAffected = statement.executeUpdate("INSERT INTO `van` VALUES (" + van.getVanid() + ",'" + van.getStartcity() + "','" + van.getEndcity() + "','" + van.getDestination() + "'," + van.getPrice()+ ")");
           
        }catch(ClassNotFoundException | SQLException e){
            
            System.out.println(e.getMessage());
            
        }
        return rowAffected > 0;
    }
 
    public boolean addpaymentcar(Payment payment){
        int rowAffected = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);          
            Statement statement = conn.createStatement();
            
            rowAffected = statement.executeUpdate("INSERT INTO `carpayment` VALUES (" + payment.getId() + ",'" + payment.getName() + "','" + payment.getStartcity() + "','" + payment.getEndcity() + "'," + payment.getPrice()+ ",'" + payment.getDestination() + "','" + payment.getFeedback() + "')");
           
        }catch(ClassNotFoundException | SQLException e){
            
            System.out.println(e.getMessage());
            
        }
        return rowAffected > 0;
    }
    
    public List<Payment> getCarPayments(){
        
        List<Payment> carpayments = new ArrayList<>();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);          
            Statement statement = conn.createStatement();
            
            ResultSet resultSet = statement.executeQuery("SELECT * FROM carpayment");
    
            while(resultSet.next()){
                Payment payment = new Payment();
                
                payment.setId(resultSet.getInt("id"));
                payment.setName(resultSet.getString("name"));
                payment.setStartcity(resultSet.getString("startcity"));
                payment.setEndcity(resultSet.getString("endcity"));
                payment.setPrice(resultSet.getInt("price"));
                payment.setDestination(resultSet.getString("destination"));
                payment.setFeedback(resultSet.getString("feedback"));
                carpayments.add(payment);
            }
            
        }catch(ClassNotFoundException | SQLException e){
            
            System.out.println(e.getMessage());
            
        }
        return carpayments;
    }
    
    public boolean addpaymentvan(Payment payment){
        int rowAffected = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);          
            Statement statement = conn.createStatement();
            
            rowAffected = statement.executeUpdate("INSERT INTO `vanpayment` VALUES (" + payment.getId() + ",'" + payment.getName() + "','" + payment.getStartcity() + "','" + payment.getEndcity() + "'," + payment.getPrice()+ ",'" + payment.getDestination() + "','" + payment.getFeedback() + "')");
           
        }catch(ClassNotFoundException | SQLException e){
            
            System.out.println(e.getMessage());
            
        }
        return rowAffected > 0;
    }
    
    
    public List<Payment> getVanPayments(){
        
        List<Payment> vanpayments = new ArrayList<>();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);          
            Statement statement = conn.createStatement();
            
            ResultSet resultSet = statement.executeQuery("SELECT * FROM vanpayment");
    
            while(resultSet.next()){
                Payment payment = new Payment();
                
                payment.setId(resultSet.getInt("id"));
                payment.setName(resultSet.getString("name"));
                payment.setStartcity(resultSet.getString("startcity"));
                payment.setEndcity(resultSet.getString("endcity"));
                payment.setPrice(resultSet.getInt("price"));
                payment.setDestination(resultSet.getString("destination"));
                payment.setFeedback(resultSet.getString("feedback"));
                vanpayments.add(payment);
            }
            
        }catch(ClassNotFoundException | SQLException e){
            
            System.out.println(e.getMessage());
            
        }
        return vanpayments;
    }
    
    public Payment getTravelVanbyId(int id) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            this.stmt  = conn.createStatement();
            this.rs    = this.stmt.executeQuery("SELECT * FROM vanpayment WHERE vanpayment.id = " + id);
            
            if(rs.next()) {
                Payment payment = new Payment();
                payment.setId(rs.getInt("id"));
                payment.setName(rs.getString("name"));
                payment.setStartcity(rs.getString("startcity"));
                payment.setEndcity(rs.getString("endcity"));
                payment.setPrice(rs.getInt("price"));
                payment.setDestination(rs.getString("destination"));
                payment.setFeedback(rs.getString("feedback"));
                              
                return payment;
            } else {
                return null;
            }
            
        } catch(ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    
    public Payment getTravelCarbyId(int id) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            this.stmt  = conn.createStatement();
            this.rs    = this.stmt.executeQuery("SELECT * FROM carpayment WHERE carpayment.id = " + id);
            
            if(rs.next()) {
                Payment payment = new Payment();
                payment.setId(rs.getInt("id"));
                payment.setName(rs.getString("name"));
                payment.setStartcity(rs.getString("startcity"));
                payment.setEndcity(rs.getString("endcity"));
                payment.setPrice(rs.getInt("price"));
                payment.setDestination(rs.getString("destination"));
                payment.setFeedback(rs.getString("feedback"));
                              
                return payment;
            } else {
                return null;
            }
            
        } catch(ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public boolean deleteCarTravel(int id){
        int rowAffected = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);          
            Statement statement = conn.createStatement();
            
            rowAffected = statement.executeUpdate("DELETE FROM `carpayment` WHERE (`id` = '" + id + "');");
                           
        }catch(ClassNotFoundException | SQLException e){
            
            System.out.println(e.getMessage());
            
        }
        return rowAffected > 0;
    }
    
    public boolean deleteVanTravel(int id){
        int rowAffected = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);          
            Statement statement = conn.createStatement();
            
            rowAffected = statement.executeUpdate("DELETE FROM `vanpayment` WHERE (`id` = '" + id + "');");
                           
        }catch(ClassNotFoundException | SQLException e){
            
            System.out.println(e.getMessage());
            
        }
        return rowAffected > 0;
    }
    
}

