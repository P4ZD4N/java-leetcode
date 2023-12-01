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

    @Test
    void lengthGreaterThan100ShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.heightChecker(new int[101]);
                });
    }

    @Test
    void lengthSmallerThan1ShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.heightChecker(new int[0]);
                });
    }

    @Test
    void anyElementGreaterThan100ShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.heightChecker(new int[] {1,101,2});
                });
    }

    @Test
    void anyElementSmallerThan1ShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.heightChecker(new int[] {1,0,2});
                });
    }
}