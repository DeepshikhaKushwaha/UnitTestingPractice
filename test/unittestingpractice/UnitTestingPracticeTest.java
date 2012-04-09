/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package unittestingpractice;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author deepshikha
 */
public class UnitTestingPracticeTest {
    
    public UnitTestingPracticeTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class UnitTestingPractice.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        UnitTestingPractice.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
