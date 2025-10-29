import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    // Method to be tested
    private int addNumbers(int a, int b) {
        return a + b;
    }

    @Test
    public void testAddNumbers() {
        MainTest testObj = new MainTest();
        int result = testObj.addNumbers(2, 3);
        int result2 = testObj.addNumbers(3, 5);
//        int result3 = testObj.addNumbers(3, 5);


        // Assert that the result of adding 2 and 3 equals 5
        assertEquals("Adding 2 and 3 should equal 5", 5, result);
        assertEquals("Adding 3 and 5 should equal 8", 8, result2);
//        assertEquals("Adding 3 and 5 should equal 8", 8, result3);
    }
}
