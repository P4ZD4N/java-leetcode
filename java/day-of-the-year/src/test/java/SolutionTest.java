import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void thisDateShouldReturn9() {
        assertEquals(9, solution.dayOfYear("2019-01-09"));
    }

    @Test
    void thisDateShouldReturn41() {
        assertEquals(41, solution.dayOfYear("2019-02-10"));
    }

    @Test
    void thisDateShouldReturn1() {
        assertEquals(1, solution.dayOfYear("1900-01-01"));
    }

    @Test
    void thisDateShouldReturn122() {
        assertEquals(122, solution.dayOfYear("1900-05-02"));
    }

    @Test
    void thisDateShouldReturn136() {
        assertEquals(136, solution.dayOfYear("1980-05-15"));
    }

    @Test
    void thisDateShouldReturn246() {
        assertEquals(246, solution.dayOfYear("1995-09-03"));
    }

    @Test
    void thisDateShouldReturn172() {
        assertEquals(172, solution.dayOfYear("2000-06-20"));
    }

    @Test
    void thisDateShouldReturn311() {
        assertEquals(311, solution.dayOfYear("2005-11-07"));
    }

    @Test
    void thisDateShouldReturn81() {
        assertEquals(81, solution.dayOfYear("2010-03-22"));
    }

    @Test
    void thisDateShouldReturn261() {
        assertEquals(261, solution.dayOfYear("2015-09-18"));
    }

    @Test
    void thisDateShouldReturn94() {
        assertEquals(94, solution.dayOfYear("2018-04-04"));
    }

    @Test
    void thisDateShouldReturn363() {
        assertEquals(363, solution.dayOfYear("2019-12-29"));
    }

    @Test
    void thisDateShouldReturn365() {
        assertEquals(365, solution.dayOfYear("2019-12-31"));
    }

    @Test
    void thisDateShouldReturn366() {
        assertEquals(366, solution.dayOfYear("2016-12-31"));
    }
}