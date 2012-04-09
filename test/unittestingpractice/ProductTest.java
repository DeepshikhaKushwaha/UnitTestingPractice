package unittestingpractice;

import org.junit.*;
import static org.junit.Assert.*;

/** Writing JUnit codes to test original codes.
 * @author deepshikha
 */
public class ProductTest {
    
    private Product product;
    
    public ProductTest() {
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
     * Last name can never be null and if it is a NullPointerException
     * should be thrown
     */
      @Test(expected = NullPointerException.class)
    public void discriptionShouldNotBeNull() {
        product.setDescription(null);
    }

    /**
     * Last name can never be empty and if it is a NullPointerException
     * should be thrown
     */
    @Test(expected = NullPointerException.class)
    public void discriptionShouldNotBeEmpty() {
        
        product.setDescription(" ");
    }

    /**
     * Product description can never be null or empty.
     */
    @Test(expected = NullPointerException.class)
    public void discriptionShouldHaveContent() {
        String[] legalValues = {
            "a", " ", "aaaa", "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx",
            "abcdefg34", "45467889"
        };
        
        for (String lv : legalValues) {
            product.setDescription(lv);
        }
    }
}
