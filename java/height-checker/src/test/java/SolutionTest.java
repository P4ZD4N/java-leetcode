import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void thisArrayShouldReturn3() {
        assertEquals(3, solution.heightChecker(new int[] {1,1,4,2,1,3}));
    }

    @Test
    void thisArrayShouldReturn5() {
        assertEquals(5, solution.heightChecker(new int[] {5,1,2,3,4}));
    }

    @Test
    void thisArrayShouldReturn0() {
        assertEquals(0, solution.heightChecker(new int[] {1,2,3,4,5}));
    }
}