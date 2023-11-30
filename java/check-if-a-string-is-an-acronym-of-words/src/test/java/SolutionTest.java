import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void shouldReturnTrue() {
        assertEquals(true, solution.isAcronym(List.of("alice","bob","charlie"), "abc"));
        assertEquals(true, solution.isAcronym(List.of("never", "gonna", "give", "up", "on", "you"), "ngguoy"));
    }

    @Test
    void shouldReturnFalse() {
        assertEquals(false, solution.isAcronym(List.of("an", "apple"), "a"));
    }

    @Test
    void sizeOfListGreaterThan100ShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.isAcronym(new ArrayList<>(100), "abc");
                });
    }

    @Test
    void sizeOfListLessThan1ShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.isAcronym(new ArrayList<>(0), "bca");
                });
    }

    @Test
    void lengthOfAnyElementOfListGreaterThan10ShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.isAcronym(List.of("a".repeat(11)), "a");
                });
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.isAcronym(List.of("aa","a".repeat(11)), "a");
                });
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.isAcronym(List.of("a".repeat(11), "aa"), "a");
                });
    }

    @Test
    void lengthOfAnyElementOfListLessThan1ShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.isAcronym(List.of("","a".repeat(5)), "a");
                });
    }

    @Test
    void lengthOfAcronymGreaterThan100ShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.isAcronym(List.of("aa","a"), "a".repeat(101));
                });
    }

    @Test
    void lengthOfAcronymLessThan1ShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.isAcronym(List.of("aa","a"), "");
                });
    }

    @Test
    void anyElementOfListContainingUppercaseLettersShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.isAcronym(List.of("Aa", "b"), "a");
                });
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.isAcronym(List.of("AA", "BB"), "a");
                });
    }

    @Test
    void anyElementOfListContainingCharacterOutOfEnglishAlphabetShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.isAcronym(List.of("śa", "b"), "a");
                });
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.isAcronym(List.of("8", "nn"), "a");
                });
    }

    @Test
    void acronymContainingUppercaseLettersShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.isAcronym(List.of("aa", "b"), "A");
                });
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.isAcronym(List.of("aa", "bb"), "Aa");
                });
    }

    @Test
    void acronymContainingCharacterOutOfEnglishAlphabetShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.isAcronym(List.of("sa", "b"), "ś");
                });
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.isAcronym(List.of("aaf", "nn"), "8");
                });
    }
}