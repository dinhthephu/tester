import static org.junit.Assert.*;
import org.junit.Test;

class TriangleClassifierTest {
    @Test
    public void testClassifyTriangle() {
        // Test cases for various scenarios
        assertEquals("Equilateral", TriangleClassifier.classifyTriangle(3, 3, 3));
        assertEquals("Isosceles", TriangleClassifier.classifyTriangle(3, 3, 4));
        assertEquals("Scalene", TriangleClassifier.classifyTriangle(3, 4, 5));
        assertEquals("RightTriangle", TriangleClassifier.classifyTriangle(3, 4, 5));
        assertEquals("NotATriangle", TriangleClassifier.classifyTriangle(1, 1, 3));
    }
}