import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean isPalindrome(int x) {
        String numberToString = Integer.toString(x);
        List<Boolean> booleans = new ArrayList<>();

        for (int i = 0; i < numberToString.length(); i++) {
            if (numberToString.charAt(i) == numberToString.charAt(numberToString.length() - 1 - i)) {
                booleans.add(true);
            } else {
                booleans.add(false);
            }
        }

        if (booleans.contains(false)) {
            return false;
        } else {
            return true;
        }
    }
}
