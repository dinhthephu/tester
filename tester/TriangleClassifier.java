public class TriangleClassifier {
    public static String classifyTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return "NotATriangle";
        }

        if (a + b <= c || a + c <= b || b + c <= a) {
            return "NotATriangle";
        }

        if (a == b && b == c) {
            return "Equilateral";
        } else if (a == b || a == c || b == c) {
            return "Isosceles";
        } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
            return "RightTriangle";
        } else {
            return "Scalene";
        }
    }
}
