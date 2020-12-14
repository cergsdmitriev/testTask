/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsamsontwo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.testng.TestNG;



/**
 *
 * @author cerg
 */
@TestMethodInfo(priority = Priority.Critical, author = "Test user", lastModified = "20.08.2019")
public class AnnotationTest {
   
    @Test
    public void annotation() {
        System.out.println("test is run! Begin.");
        TestNG tng = new TestNG();
        
        assertEquals(1, 1);
    }
}
