
package unittestingpractice;

import org.junit.*;
import static org.junit.Assert.*;

/** Writing JUnit codes to test original codes.
 * @author deepshikha
 */
public class LineItemTest {
    
    private LineItem lineItem;
    
    public LineItemTest() {
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
     * * This method test the requirement that the product Quantity cannot be greater than 100.
     */
    @Test(expected = NullPointerException.class)
    public void productQtyShouldNotBeGreaterThan100() {
     lineItem.setQty(101);
    }
    
    
    /**
     * * This method test the requirement that the product Quantity cannot be less than 0.
     */
    @Test(expected = NullPointerException.class)
    public void productQtyShouldNotBeLessThan0() {
        lineItem.setQty(-1);
    }
    
     /**
     * * This method test the requirement that the product Cost cannot be greater than 5.
     */
    @Test(expected = NullPointerException.class)
    public void productCostShouldNotBeGreaterThan5() {
     lineItem.setUnitCost(6);
    }
    
    
    /**
     * * This method test the requirement that the product Cost cannot be less than 0.
     */
    @Test(expected = NullPointerException.class)
    public void productCostShouldNotBeLessThan0() {
        lineItem.setUnitCost(-1);
    }
    
    
    
    
    
}
