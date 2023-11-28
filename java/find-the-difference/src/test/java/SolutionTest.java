import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution s = new Solution();

    @Test
    void differenceBetweenABCDAndABCDEShouldEqualE() {
        assertEquals('e', s.findTheDifference("abcd", "abcde"));
    }

    @Test
    void differenceBetweenQWERTYAndQWERTYUShouldEqualU() {
        assertEquals('u', s.findTheDifference("qwerty", "qwertyu"));
    }

    @Test
    void differenceBetweenEmptyStringAndYShouldEqualY() {
        assertEquals('y', s.findTheDifference("", "y"));
    }

    @Test
    void differenceBetweenDCFFAndDCAFShouldEqualA() {
        assertEquals('a', s.findTheDifference("dcf", "dcaf"));
    }

    @Test
    void differenceBetweenBCDAndABCDShouldEqualA() {
        assertEquals('a', s.findTheDifference("bcd", "abcd"));
    }

    @Test
    void differenceBetweenATimes1000AndATimes1000PlusBShouldEqualB() {
        assertEquals('b', s.findTheDifference("a".repeat(1000), "a".repeat(1000) + "b"));
    }

    @Test
    void lengthOfFirstArgumentGreaterThan1000ShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    s.findTheDifference("a".repeat(1001), "a".repeat(1001) + "b");
                    });
    }

    @Test
    void lengthOfSecondArgumentGreaterByAtLeast2ThanFirstArgumentShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    s.findTheDifference("a".repeat(2), "a".repeat(2) + "ab");
                });
    }

}