///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
// */
//package icbt;
//
//import java.util.List;
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
///**
// *
// * @author Tharushi Dhananjika
// */
//public class DBUtilTest {
//    
//    public DBUtilTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of getStudent method, of class DBUtil.
//     */
//    @Test
//    public void testGetStudent() {
//        System.out.println("getStudent");
//        int id = 1;
//        DBGoCheeta instance = new DBGoCheeta();
//        Driverr expResult = new Driverr(1,"Andraw");
//        Driverr result = instance.getStudent(id);
//        
//        assertEquals(expResult.getId(), result.getId());
//        assertEquals(expResult.getName(), result.getName());
//    }
//
//    /**
//     * Test of getStudents method, of class DBUtil.
//     */
//   @Test
//    public void testGetStudents() {
//        System.out.println("getStudents");
//        DBGoCheeta instance = new DBGoCheeta();
//        Driverr expResult = new Driverr(2, "Jhone");
//        
//        List<Driverr> result = instance.getStudents();
//        for(Driverr st : result){
//            if(st.getId() == expResult.getId()){
//                assertEquals(expResult.getName(), st.getName());
//            }
//        }
//    }
//
//    /**
//     * Test of addStudent method, of class DBUtil.
//     */
//    @Test
//    public void testCRUDStudent() {
//        System.out.println("addStudent");
//        Driverr st = new Driverr(999, "Test Student");
//        DBGoCheeta instance = new DBGoCheeta();
//        boolean expResult = true;
//        
//        // Test Add Student Functionality
//        boolean result = instance.addStudent(st);
//        assertEquals(expResult, result);
//        
//        // Test added students attributes
//        Driverr resultStudent = instance.getStudent(st.getId());
//        assertEquals(st.getId(), resultStudent.getId());
//        assertEquals(st.getName(), resultStudent.getName());
//        
//        // Test update student functionality
//        st.setName("TestStudent123");
//        boolean resultUpdate = instance.updateStudent(st);
//        assertEquals(expResult, resultUpdate);
//        
//        // Test updated student attributes
//        Driverr resultStudentUpdate = instance.getStudent(st.getId());
//        assertEquals(st.getId(), resultStudentUpdate.getId());
//        assertEquals(st.getName(), resultStudentUpdate.getName());
//        
//        // Test delete student functionality
//        boolean resultDelete = instance.deleteStudent(st.getId());
//        assertEquals(resultDelete, result);
//    }
//
//    /**
//     * Test of updateStudent method, of class DBUtil.
//     */
//  /*  @Test
//    public void testUpdateStudent() {
//        System.out.println("updateStudent");
//        Student st = null;
//        DBUtil instance = new DBUtil();
//        boolean expResult = false;
//        boolean result = instance.updateStudent(st);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of deleteStudent method, of class DBUtil.
//     */
// /*   @Test
//    public void testDeleteStudent() {
//        System.out.println("deleteStudent");
//        int id = 0;
//        DBUtil instance = new DBUtil();
//        boolean expResult = false;
//        boolean result = instance.deleteStudent(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//   */ 
//}
