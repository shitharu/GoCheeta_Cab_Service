/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package icbt;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tharushi Dhananjika
 */
public class DBUtilTest {
    
    public DBUtilTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetDriverr() {
        System.out.println("getDriverr");
        int id = 8;
        DBGoCheeta instance = new DBGoCheeta();
        Driverr expResult = new Driverr(8, "a", 8, "a","a","a","a","a");
        Driverr result = instance.getDriverr(id);
        
        assertEquals(expResult.getId(), result.getId());
        assertEquals(expResult.getName(), result.getName());
    }

    /**
     * Test of getStudents method, of class DBUtil.
     */
    
   @Test
    public void testGetDriverrs() {
        System.out.println("getStudents");
        DBGoCheeta instance = new DBGoCheeta();
        Driverr expResult = new Driverr(555, "a", 8, "a","a","a","a","a");
        
        List<Driverr> result = instance.getDriverrs();
        for(Driverr st : result){
            if(st.getId() == expResult.getId()){
                assertEquals(expResult.getName(), st.getName());
            }
        }
    }

    @Test
    public void testCRUDDriverrs() {
        System.out.println("addStudent");
        Driverr st = new Driverr(664, "a", 44, "a","a","a","a","a");
        DBGoCheeta instance = new DBGoCheeta();
        boolean expResult = true;
        
        // Test Add Driver Functionality
        boolean result = instance.addDriverr(st);
        assertEquals(expResult, result);
        
        // Test added Drivers attributes
        Driverr resultDriverr = instance.getDriverr(st.getId());
        assertEquals(st.getId(), resultDriverr.getId());
        assertEquals(st.getName(), resultDriverr.getName());
        
        // Test update student functionality
        st.setName("TestDriverr");
        boolean resultUpdate = instance.updateDriverr(st);
        assertEquals(expResult, resultUpdate);
        
        // Test updated student attributes
        Driverr resultDriverrUpdate = instance.getDriverr(st.getId());
        assertEquals(st.getId(), resultDriverrUpdate.getId());
        assertEquals(st.getName(), resultDriverrUpdate.getName());
        
        // Test delete student functionality
        boolean resultDelete = instance.deleteDriverr(st.getId());
        assertEquals(resultDelete, result);
    }

    /**
     * Test of updateDriver method, of class DBUtil.
     */
    @Test
    public void testUpdateDriverr() {
        System.out.println("updateDriverr");
        Driverr st = null;
        DBGoCheeta instance = new DBGoCheeta();
        boolean expResult = false;
        boolean result = instance.updateDriverr(st);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteDriver method, of class DBUtil.
     */
    @Test
    public void testDeleteDriverr() {
        System.out.println("deleteDriverr");
        int id = 1;
        DBGoCheeta instance = new DBGoCheeta();
        boolean expResult = false;
        boolean result = instance.deleteDriverr(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
