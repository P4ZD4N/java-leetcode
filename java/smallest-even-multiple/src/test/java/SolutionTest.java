import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void fiveAndTwoShouldReturn10() {
        assertEquals(10, solution.smallestEvenMultiple(5));
    }

    @Test
    void sixAndTwoShouldReturn6() {
        assertEquals(6, solution.smallestEvenMultiple(6));
    }

    @Test
    void sevenAndTwoShouldReturn14() {
        assertEquals(14, solution.smallestEvenMultiple(7));
    }
}