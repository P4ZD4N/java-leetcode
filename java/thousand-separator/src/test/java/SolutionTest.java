import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void shouldReturnSameNumberAsOnInput() {
        assertEquals("0", solution.thousandSeparator(0));
        assertEquals("987", solution.thousandSeparator(987));
        assertEquals("420", solution.thousandSeparator(420));
    }

    @Test
    void shouldReturnNumberWithOneDot() {
        assertEquals("1.234", solution.thousandSeparator(1_234));
        assertEquals("1.000", solution.thousandSeparator(1_000));
        assertEquals("9.999", solution.thousandSeparator(9_999));
    }

    @Test
    void shouldReturnNumberWithTwoDots() {
        assertEquals("124.355.334", solution.thousandSeparator(124_355_334));
        assertEquals("999.999.999", solution.thousandSeparator(999_999_999));
        assertEquals("1.000.000", solution.thousandSeparator(1_000_000));
    }

    @Test
    void shouldReturnNumberWithThreeDots() {
        assertEquals("1.000.000.000", solution.thousandSeparator(1_000_000_000));
        assertEquals("2.147.483.647", solution.thousandSeparator(2_147_483_647));
    }

    @Test
    void thisNumberShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.thousandSeparator(-1);
                });
    }
}