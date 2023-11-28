import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] wealths = calculateWealths(accounts);
        return findMaximumWealth(wealths);
    }
    private int[] calculateWealths(int[][] accounts) {
        int[] wealths = new int[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            int wealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                wealth += accounts[i][j];
            }
            wealths[i] = wealth;
        }
        return wealths;
    }
    private int findMaximumWealth(int[] wealths) {
        List<Integer> wealthsList = new ArrayList<>();
        for (int wealth: wealths) {
            wealthsList.add(Integer.valueOf(wealth));
        }
        return Collections.max(wealthsList);
    }
}
