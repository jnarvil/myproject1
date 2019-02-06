/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import com.itexps.testpackage.mytest.Student;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Jurgita
 */
public class StudentTest {
    
    Student stu;
    
    public StudentTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void testFirst() {
        stu.setFirst("tom");
        stu.setLast("smith");
        assertEquals("tom", stu.getFirst());
        assertEquals("smith", stu.getLast());
        
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
        stu = new Student();
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
