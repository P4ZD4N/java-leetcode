import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void shouldSortByExamScoresOn2thPositionInArray() {
        assertArrayEquals(
                new int[][] {{7,5,11,2},{10,6,9,1},{4,8,3,15}},
                solution.sortTheStudents(new int[][] {{10,6,9,1},{7,5,11,2},{4,8,3,15}}, 2)
        );
    }

    @Test
    void shouldSortByExamScoresOn0thPositionInArray() {
        assertArrayEquals(
                new int[][] {{5,6},{3,4}},
                solution.sortTheStudents(new int[][] {{3,4},{5,6}}, 0)
        );
    }

    @Test
    void shouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.sortTheStudents(new int[0][2], 2);
                });
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.sortTheStudents(new int[2][0], 1);
                });
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.sortTheStudents(new int[250][251], 2);
                });
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.sortTheStudents(new int[251][250], 25);
                });
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.sortTheStudents(new int[][] {{0,1,4},{5,3,6}}, 1);
                });
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.sortTheStudents(new int[][] {{2,1,100001},{5,3,6}}, 1);
                });
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.sortTheStudents(new int[][] {{1,2,3,8},{4,5,6,3}}, 1);
                });
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.sortTheStudents(new int[][] {{1,2,3,4},{5,6,7,8}}, 4);
                });
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.sortTheStudents(new int[][] {{1,2,3,4},{5,6,7,8}}, -1);
                });
    }
}