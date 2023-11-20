import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void thisArrayShouldReturn6() {
        assertEquals(6, solution.findMaxConsecutiveOnes(new int[] {1,1,1,1,1,1}));
    }

    @Test
    void thisArrayShouldReturn4() {
        assertEquals(4, solution.findMaxConsecutiveOnes(new int[] {1,1,1,1,0,1}));
    }

    @Test
    void thisArrayShouldReturn3() {
        assertEquals(3, solution.findMaxConsecutiveOnes(new int[] {1,1,0,1,1,1}));
        assertEquals(3, solution.findMaxConsecutiveOnes(new int[] {0,0,0,1,1,1}));
        assertEquals(3, solution.findMaxConsecutiveOnes(new int[] {1,1,1,0,0,0}));
        assertEquals(3, solution.findMaxConsecutiveOnes(new int[] {0,0,1,1,1,0}));
    }

    @Test
    void thisArrayShouldReturn2() {
        assertEquals(2, solution.findMaxConsecutiveOnes(new int[] {1,0,1,1,0,1}));
    }

    @Test
    void thisArrayShouldReturn1() {
        assertEquals(1, solution.findMaxConsecutiveOnes(new int[] {1,0,1,0,1,0,1}));
        assertEquals(1, solution.findMaxConsecutiveOnes(new int[] {1,0,0,0,0,0,0}));
        assertEquals(1, solution.findMaxConsecutiveOnes(new int[] {0,0,0,0,0,0,1}));
        assertEquals(1, solution.findMaxConsecutiveOnes(new int[] {0,0,0,1,0,0,0}));
    }

    @Test
    void thisArrayShouldReturn0() {
        assertEquals(0, solution.findMaxConsecutiveOnes(new int[] {0,0,0,0,0}));
    }

    @Test
    void thisArrayShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.findMaxConsecutiveOnes(new int[100001]);
                });
        assertThrows(IllegalArgumentException.class,
                () ->{
                    solution.findMaxConsecutiveOnes(new int[0]);
                });
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.findMaxConsecutiveOnes(new int[] {1,1,1,2});
                });
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.findMaxConsecutiveOnes(new int[] {0,0,0,3});
                });
    }
}