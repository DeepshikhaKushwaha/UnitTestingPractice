package unittestingpractice;

import org.junit.*;
import static org.junit.Assert.*;

/** Writing JUnit codes to test original codes.
 * @author deepshikha
 */
public class CustomerTest {

    public CustomerTest() {
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
     * * This method test the requirement that the address cannot be null.
     */
    @Test(expected = IllegalArgumentException.class)
    public void addressShouldNotBeNull() {
        Customer c = new Customer("Deepshikha", "Kushwaha ");
        c.setAddress(null);
    }

    /**
     * * This method test the requirement that the address cannot be empty.
     */
    @Test(expected = IllegalArgumentException.class)
    public void addressShouldNotBeEmpty() {
        Customer c = new Customer("Deepshikha", "Kushwaha ");
        c.setAddress("");
    }

    /**
     * * All valid test should pass
     */
    @Test
    public void validAddressShouldPass() {
        Customer c = new Customer("Deepshikha", "Kushwaha ");
        c.setAddress("1234, Waukesha,WI");
    }
    
    //....................................................
    
     /**
     * * This method test the requirement that the phone number cannot be null.
     */
    @Test(expected = IllegalArgumentException.class)
    public void phoneShouldNotBeNull() {
        Customer c = new Customer("Deepshikha", "Kushwaha ");
        c.setPhone(null);
    }

    /**
     * * This method test the requirement that the phone number cannot be empty.
     */
    @Test(expected = IllegalArgumentException.class)
    public void phoneShouldNotBeEmpty() {
        Customer c = new Customer("Deepshikha", "Kushwaha ");
        c.setPhone("");
    }

    /**
     * * All valid test should pass
     */
    @Test
    public void validPhoneNumberShouldPass() {
        Customer c = new Customer("Deepshikha", "Kushwaha ");
        c.setAddress("262-262-2000");
    }
    
    
}
