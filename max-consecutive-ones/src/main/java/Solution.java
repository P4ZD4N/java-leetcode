import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if ((nums.length >= 1 && 100000 >= nums.length) && (allElementsOfArrayAreBinaryNumbers(nums))) {
            List<Integer> sequencesOfOnes = new ArrayList<>();
            int temp = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 1)
                    temp++;
                if (nums[i] == 0 || i == nums.length - 1) {
                    sequencesOfOnes.add(temp);
                    temp = 0;
                }
            }
            return Collections.max(sequencesOfOnes);
        } else
            throw new IllegalArgumentException();
    }
    private boolean allElementsOfArrayAreBinaryNumbers(int[] nums) {
        boolean result = true;
        for (int num : nums)
            if (num != 0 && num != 1)
                result = false;
        return result;
    }
}