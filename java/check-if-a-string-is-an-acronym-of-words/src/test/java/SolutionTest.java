import org.junit.jupiter.api.Test;

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
}