import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution s = new Solution();

    @Test
    void num1MinusNum2ShouldEqual19() {
        assertEquals(19, s.differenceOfSums(10, 3));
    }

    @Test
    void num1MinusNum2ShouldEqual15() {
        assertEquals(15, s.differenceOfSums(5, 6));
    }

    @Test
    void num1MinusNum2ShouldEqualNegative15() {
        assertEquals(-15, s.differenceOfSums(5, 1));
    }

    @Test
    void firstArgumentShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    s.differenceOfSums(0, 5);
                });
        assertThrows(IllegalArgumentException.class,
                () -> {
                    s.differenceOfSums(1001, 5);
                });
    }

    @Test
    void secondArgumentShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    s.differenceOfSums(10, 0);
                });
        assertThrows(IllegalArgumentException.class,
                () -> {
                    s.differenceOfSums(10, 1001);
                });
    }
}