import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void testFizzBuzzForNEqualTo1() {
        assertEquals(List.of("1"), solution.fizzBuzz(1));
    }

    @Test
    void testFizzBuzzForNEqualTo3() {
        assertEquals(List.of("1","2","Fizz"), solution.fizzBuzz(3));
    }

    @Test
    void testFizzBuzzForNEqualTo5() {
        assertEquals(List.of("1","2","Fizz","4","Buzz"), solution.fizzBuzz(5));
    }

    @Test
    void testFizzBuzzForNEqualTo15() {
        assertEquals(
                List.of("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"),
                solution.fizzBuzz(15)
        );
    }

    @Test
    void nLessThanOrEqualTo0ShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.fizzBuzz(0);
                });
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.fizzBuzz(-10);
                });
    }

    @Test
    void nGreaterThanOrEqual10001ShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.fizzBuzz(10001);
                });
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.fizzBuzz(100000);
                });
    }
}