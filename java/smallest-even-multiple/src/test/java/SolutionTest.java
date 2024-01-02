import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void fiveShouldReturn10() {
        assertEquals(10, solution.smallestEvenMultiple(5));
    }

    @Test
    void sixShouldReturn6() {
        assertEquals(6, solution.smallestEvenMultiple(6));
    }

    @Test
    void sevenShouldReturn14() {
        assertEquals(14, solution.smallestEvenMultiple(7));
    }

    @Test
    void zeroAndTwoShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.smallestEvenMultiple(0);
                });
    }

    @Test
    void oneHundredFiftyOneShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.smallestEvenMultiple(151);
                });
    }
}