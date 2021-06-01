package africa.semicolon.chapterFiveExercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrianglePatternTest {

    private TrianglePattern triangle;

    @BeforeEach
    void setUp(){
        triangle = new TrianglePattern();
    }

    @Test
    void testThatPattern1DisplaysATriangle(){
        String pattern = """
                *
                **
                ***
                ****
                *****
                ******
                *******
                ********
                *********
                **********
                """;

        assertEquals(pattern, triangle.pattern1(10));
    }

    @Test
    void testThatPattern2DisplaysATriangle(){
        String pattern = """
                **********
                *********
                ********
                *******
                ******
                *****
                ****
                ***
                **
                *
                """;

        assertEquals(pattern, triangle.pattern2(10));
    }

    @Test
    void testThatPattern3DisplaysATriangle(){
        String pattern = """
                **********
                 *********
                  ********
                   *******
                    ******
                     *****
                      ****
                       ***
                        **
                         *
                """;

        assertEquals(pattern, triangle.pattern3(10));
    }

    @Test
    void testThatPattern4DisplaysATriangle(){
        String pattern = """
                         *
                        **
                       ***
                      ****
                     *****
                    ******
                   *******
                  ********
                 *********
                **********
                """;

        assertEquals(pattern, triangle.pattern4(10));
    }

}
