import java.util.*;

public class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> namesAndHeights = createMapContainingNamesAndHeights(names, heights);
        Map<Integer, String> namesAndHeightsSortedAscendingByHeights = new TreeMap<>(namesAndHeights);
        String[] namesAscending = namesAndHeightsSortedAscendingByHeights.values().toArray(new String[0]);
        return sortNamesDescending(namesAscending);
    }
    private Map<Integer, String> createMapContainingNamesAndHeights(String[] names, int[] heights) {
        Map<Integer, String> namesAndHeights = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            namesAndHeights.put(Integer.valueOf(heights[i]), names[i]);
        }
        return namesAndHeights;
    }
    private String[] sortNamesDescending(String[] namesAscending) {
        String[] namesDescending = new String[namesAscending.length];
        for (int i = 0; i < namesAscending.length; i++) {
            namesDescending[i] = namesAscending[namesAscending.length - 1 - i];
        }
        return namesDescending;
    }
}
