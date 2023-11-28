import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int majorityElement(int[] nums) {
        List<Integer> numsList = convertIntArrayToIntegerList(nums);
        Set<Integer> uniqueNumbersFromList = numsList
                .stream()
                .collect(Collectors.toSet());
        int majorityElement = uniqueNumbersFromList
                .stream()
                .filter(number -> Collections.frequency(numsList, number) > (numsList.size() / 2))
                .findFirst()
                .get();
        return majorityElement;
    }
    private List<Integer> convertIntArrayToIntegerList(int[] array) {
        List<Integer> numsList = new ArrayList<>();
        for (int num : array) {
            numsList.add(Integer.valueOf(num));
        }
        return numsList;
    }
}
