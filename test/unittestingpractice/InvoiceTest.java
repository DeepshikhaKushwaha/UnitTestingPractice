
package unittestingpractice;

import java.util.Date;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;


/** Writing JUnit codes to test original codes.
 * @author deepshikha
 */
public class InvoiceTest {

    private Invoice invoice;

    public InvoiceTest() {
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

    @Test(expected = NullPointerException.class)
    public void netTotalShouldNotBeGreaterThan100() {
        invoice.getNetTotal();
    }

    @Test(expected = NullPointerException.class)
    public void netTotalShouldNotBeLessThan0() {
        invoice.getNetTotal();
    }
}
