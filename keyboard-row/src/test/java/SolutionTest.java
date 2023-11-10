import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution s = new Solution();

    @Test
    void resultShouldBeAlaskaAndDad() {
        assertEquals(new String[] {"Alaska", "Dad"}, s.findWords(new String[] {"Hello","Alaska","Dad","Peace"}));
    }
}