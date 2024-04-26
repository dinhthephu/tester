import static org.junit.Assert.*;
import org.junit.Test;
class NextDateTest {
    @Test
    public void testNextDate() {
        // Test cases for various scenarios
        assertArrayEquals(NextDate.nextDate(1, 1, 1812), new int[]{1, 2, 1812});
        assertArrayEquals(NextDate.nextDate(31, 12, 1812), new int[]{1, 1, 1813});
        assertArrayEquals(NextDate.nextDate(28, 2, 2000), new int[]{29, 2, 2000});
        assertArrayEquals(NextDate.nextDate(28, 2, 1900), new int[]{1, 3, 1900});
        assertArrayEquals(NextDate.nextDate(30, 4, 2020), new int[]{1, 5, 2020});
        assertArrayEquals(NextDate.nextDate(31, 12, 2012), new int[]{1, 1, 2013});
    }
}