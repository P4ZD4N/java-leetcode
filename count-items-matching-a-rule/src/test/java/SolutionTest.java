import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void shouldReturnOne() {
        assertEquals(1, solution.countMatches(
                List.of(
                        List.of("phone","blue","pixel"),
                        List.of("computer","silver","lenovo"),
                        List.of("phone","gold","iphone")
                ),
                "color",
                "silver"
        ));
    }

    @Test
    void shouldReturnTwo() {
        assertEquals(2, solution.countMatches(
                List.of(
                        List.of("phone","blue","pixel"),
                        List.of("computer","silver","phone"),
                        List.of("phone","gold","iphone")
                ),
                "type",
                "phone"
        ));
    }

    @Test
    void anyPropertyWhichHasLengthGreaterThan10ShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.countMatches(
                            List.of(
                                    List.of("a".repeat(11),"blue","pixel"),
                                    List.of("computer","silver","phone"),
                                    List.of("phone","gold","iphone")
                            ),
                            "type",
                            "phone"
                    );
                }
        );
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.countMatches(
                            List.of(
                                    List.of("computer","blue","pixel"),
                                    List.of("a".repeat(11),"silver","phone"),
                                    List.of("phone","gold","iphone")
                            ),
                            "type",
                            "phone"
                    );
                }
        );
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.countMatches(
                            List.of(
                                    List.of("phone","blue","pixel"),
                                    List.of("computer","silver","phone"),
                                    List.of("a".repeat(11),"gold","iphone")
                            ),
                            "type",
                            "phone"
                    );
                }
        );
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.countMatches(
                            List.of(
                                    List.of("computer","a".repeat(11),"pixel"),
                                    List.of("laptop","red","phone"),
                                    List.of("phone","gold","iphone")
                            ),
                            "type",
                            "phone"
                    );
                }
        );
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.countMatches(
                            List.of(
                                    List.of("computer","red","pixel"),
                                    List.of("laptop","a".repeat(11),"phone"),
                                    List.of("phone","gold","iphone")
                            ),
                            "type",
                            "phone"
                    );
                }
        );
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.countMatches(
                            List.of(
                                    List.of("computer","black","pixel"),
                                    List.of("laptop","gold","phone"),
                                    List.of("phone","a".repeat(11),"iphone")
                            ),
                            "type",
                            "phone"
                    );
                }
        );
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.countMatches(
                            List.of(
                                    List.of("computer","black","a".repeat(11)),
                                    List.of("laptop","gold","phone"),
                                    List.of("phone","red","iphone")
                            ),
                            "type",
                            "phone"
                    );
                }
        );
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.countMatches(
                            List.of(
                                    List.of("computer","black","pixel"),
                                    List.of("laptop","gold","a".repeat(11)),
                                    List.of("phone","silver","iphone")
                            ),
                            "type",
                            "phone"
                    );
                }
        );
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.countMatches(
                            List.of(
                                    List.of("computer","black","pixel"),
                                    List.of("laptop","gold","phone"),
                                    List.of("phone","black","a".repeat(11))
                            ),
                            "type",
                            "phone"
                    );
                }
        );
    }

    @Test
    void anyPropertyWhichHasLengthLessThan1ShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.countMatches(
                            List.of(
                                    List.of("","blue","pixel"),
                                    List.of("computer","silver","phone"),
                                    List.of("phone","gold","iphone")
                            ),
                            "type",
                            "phone"
                    );
                }
        );
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.countMatches(
                            List.of(
                                    List.of("computer","blue","pixel"),
                                    List.of("","silver","phone"),
                                    List.of("phone","gold","iphone")
                            ),
                            "type",
                            "phone"
                    );
                }
        );
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.countMatches(
                            List.of(
                                    List.of("phone","blue","pixel"),
                                    List.of("computer","silver","phone"),
                                    List.of("","gold","iphone")
                            ),
                            "type",
                            "phone"
                    );
                }
        );
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.countMatches(
                            List.of(
                                    List.of("computer","","pixel"),
                                    List.of("laptop","red","phone"),
                                    List.of("phone","gold","iphone")
                            ),
                            "type",
                            "phone"
                    );
                }
        );
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.countMatches(
                            List.of(
                                    List.of("computer","red","pixel"),
                                    List.of("laptop","","phone"),
                                    List.of("phone","gold","iphone")
                            ),
                            "type",
                            "phone"
                    );
                }
        );
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.countMatches(
                            List.of(
                                    List.of("computer","black","pixel"),
                                    List.of("laptop","gold","phone"),
                                    List.of("phone","","iphone")
                            ),
                            "type",
                            "phone"
                    );
                }
        );
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.countMatches(
                            List.of(
                                    List.of("computer","black",""),
                                    List.of("laptop","gold","phone"),
                                    List.of("phone","red","iphone")
                            ),
                            "type",
                            "phone"
                    );
                }
        );
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.countMatches(
                            List.of(
                                    List.of("computer","black","pixel"),
                                    List.of("laptop","gold",""),
                                    List.of("phone","silver","iphone")
                            ),
                            "type",
                            "phone"
                    );
                }
        );
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.countMatches(
                            List.of(
                                    List.of("computer","black","pixel"),
                                    List.of("laptop","gold","phone"),
                                    List.of("phone","black","")
                            ),
                            "type",
                            "phone"
                    );
                }
        );
    }

    @Test
    void ruleValueLengthGreaterThan10ShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.countMatches(
                            List.of(
                                    List.of("computer","black","pixel"),
                                    List.of("laptop","gold","phone"),
                                    List.of("phone","black","lenovo")
                            ),
                            "type",
                            "a".repeat(11)
                    );
                }
        );
    }

    @Test
    void ruleValueLengthLessThan1ShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.countMatches(
                            List.of(
                                    List.of("computer","black","pixel"),
                                    List.of("laptop","gold","phone"),
                                    List.of("phone","black","lenovo")
                            ),
                            "type",
                            ""
                    );
                }
        );
    }

    @Test
    void ruleKeyDifferentThanTypeColorOrNameShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.countMatches(
                            List.of(
                                    List.of("computer","black","pixel"),
                                    List.of("laptop","gold","phone"),
                                    List.of("phone","black","lenovo")
                            ),
                            "typer",
                            "phone"
                    );
                }
        );
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.countMatches(
                            List.of(
                                    List.of("computer","black","pixel"),
                                    List.of("laptop","gold","phone"),
                                    List.of("phone","black","lenovo")
                            ),
                            "colour",
                            "silver"
                    );
                }
        );
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.countMatches(
                            List.of(
                                    List.of("computer","black","pixel"),
                                    List.of("laptop","gold","phone"),
                                    List.of("phone","black","lenovo")
                            ),
                            "names",
                            "lenovo"
                    );
                }
        );
    }

    @Test
    void anyPropertyWhichDoesNotConsistOnlyOfLowercaseLettersShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.countMatches(
                            List.of(
                                    List.of("K","blue","pixel"),
                                    List.of("computer","silver","phone"),
                                    List.of("phone","gold","iphone")
                            ),
                            "type",
                            "phone"
                    );
                }
        );
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.countMatches(
                            List.of(
                                    List.of("computer","blue","pixel"),
                                    List.of("H","silver","phone"),
                                    List.of("phone","gold","iphone")
                            ),
                            "type",
                            "phone"
                    );
                }
        );
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.countMatches(
                            List.of(
                                    List.of("phone","blue","pixel"),
                                    List.of("computer","silver","phone"),
                                    List.of("G","gold","iphone")
                            ),
                            "type",
                            "phone"
                    );
                }
        );
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.countMatches(
                            List.of(
                                    List.of("computer","R","pixel"),
                                    List.of("laptop","red","phone"),
                                    List.of("phone","gold","iphone")
                            ),
                            "type",
                            "phone"
                    );
                }
        );
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.countMatches(
                            List.of(
                                    List.of("computer","red","pixel"),
                                    List.of("laptop","G","phone"),
                                    List.of("phone","gold","iphone")
                            ),
                            "type",
                            "phone"
                    );
                }
        );
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.countMatches(
                            List.of(
                                    List.of("computer","black","pixel"),
                                    List.of("laptop","gold","phone"),
                                    List.of("phone","S","iphone")
                            ),
                            "type",
                            "phone"
                    );
                }
        );
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.countMatches(
                            List.of(
                                    List.of("computer","black","R"),
                                    List.of("laptop","gold","phone"),
                                    List.of("phone","red","iphone")
                            ),
                            "type",
                            "phone"
                    );
                }
        );
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.countMatches(
                            List.of(
                                    List.of("computer","black","pixel"),
                                    List.of("laptop","gold","R"),
                                    List.of("phone","silver","iphone")
                            ),
                            "type",
                            "phone"
                    );
                }
        );
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.countMatches(
                            List.of(
                                    List.of("computer","black","pixel"),
                                    List.of("laptop","gold","phone"),
                                    List.of("phone","black","N")
                            ),
                            "type",
                            "phone"
                    );
                }
        );
    }

    @Test
    void ruleKeyWhichDoesNotConsistOnlyOfLowercaseLettersShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.countMatches(
                            List.of(
                                    List.of("computer","black","pixel"),
                                    List.of("laptop","gold","phone"),
                                    List.of("phone","black","phone")
                            ),
                            "Type",
                            "phone"
                    );
                }
        );
    }

    @Test
    void ruleValueWhichDoesNotConsistOnlyOfLowercaseLettersShouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    solution.countMatches(
                            List.of(
                                    List.of("computer","black","pixel"),
                                    List.of("laptop","gold","phone"),
                                    List.of("phone","black","phone")
                            ),
                            "type",
                            "Phone"
                    );
                }
        );
    }
}