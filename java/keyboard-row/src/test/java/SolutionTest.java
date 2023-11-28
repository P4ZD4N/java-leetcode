import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution s = new Solution();

    @Test
    void resultShouldBeAlaskaAndDad() {
        assertArrayEquals(new String[] {"Alaska", "Dad"}, s.findWords(new String[] {"Hello","Alaska","Dad","Peace"}));
    }

    @Test
    void resultShouldBeEmptyArray() {
        assertArrayEquals(new String[] {}, s.findWords(new String[] {"omk"}));
    }

    @Test
    void resultShouldBeTheSameArrayWhichIsEnteredAsInput() {
        assertArrayEquals(new String[] {"adsdf","sfd"}, s.findWords(new String[] {"adsdf","sfd"}));
    }

    @Test
    void resultShouldBeQwertyAndDfg() {
        assertArrayEquals(new String[] {"QWERTY", "DfG"}, s.findWords(new String[] {"Hi","QWERTY","hI","DfG", "nmlkf"}));
    }

    @Test
    void arrayEnteredAsInputShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    s.findWords(new String[21]);
                });
        assertThrows(IllegalArgumentException.class,
                () -> {
                    s.findWords(new String[0]);
                });
        assertThrows(IllegalArgumentException.class,
                () -> {
                    s.findWords(new String[] {"łódź", "boat"});
                });
        assertThrows(IllegalArgumentException.class,
                () -> {
                    s.findWords(new String[] {"123", "456"});
                });
        assertThrows(IllegalArgumentException.class,
                () -> {
                    s.findWords(new String[] {".", ","});
                });
    }
}