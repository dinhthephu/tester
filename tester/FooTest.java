// 1. <program> ::= float foo(int a, int b, int c, int d) { <statement-list> }
// 2. <statement-list> ::= <statement> | <statement> <statement-list>
// 3. <statement> ::= <declaration> | <if-statement> | <assignment> | return <expression> ;
// 4. <declaration> ::= <type> <identifier> ; | <type> <identifier> = <expression> ;
// 5. <type> ::= int | float
// 6. <identifier> ::= a | b | c | d | e | x
// 7. <if-statement> ::= if ( <condition> ) <statement>
// 8. <condition> ::= <expression> == 0 | ( <expression> == <expression> ) || ( <expression> == <expression> )
// 9. <expression> ::= <identifier> | 0 | 1 | 1 / <identifier>
// 10. <assignment> ::= <identifier> = <expression> ;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FooTest {

    @Test
    void testPath1() {
        Foo foo = new Foo();
        float result = foo.foo(0, anyValue, anyValue, anyValue);
        assertEquals(0, result);
    }

    @Test
    void testPath2() {
        Foo foo = new Foo();
        float result = foo.foo(anyNonZeroValue, anyNonZeroValue, anyValue, anyValue);
        assertEquals(1, result);
    }

    @Test
    void testPath3() {
        Foo foo = new Foo();
        float result = foo.foo(anyNonZeroValue, anyNonZeroValue, anyNonZeroValue, anyNonZeroValue);
        assertEquals(1, result);
    }
}
