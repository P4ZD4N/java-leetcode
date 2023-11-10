import java.util.Arrays;

public class Solution {
    public char findTheDifference(String s, String t) {
        if (
                (1000 >= s.length()) &&
                (s.length() >= 0) &&
                (t.length() == s.length() + 1)
        ) {
            char[] firstStringToCharArray = s.toCharArray();
            Arrays.sort(firstStringToCharArray);
            char[] secondStringStringToCharArray = t.toCharArray();
            Arrays.sort(secondStringStringToCharArray);

            boolean notFoundDifference = true;
            int index = 0;

            for (int i = 0; i < firstStringToCharArray.length && notFoundDifference; i++) {
                if (secondStringStringToCharArray[i] != firstStringToCharArray[i]) {
                    index = i;
                    notFoundDifference = false;
                } else if (
                        i == firstStringToCharArray.length - 1 && secondStringStringToCharArray[i] == firstStringToCharArray[i]
                ) {
                    index = i + 1;
                    notFoundDifference = false;
                }
            }

            return secondStringStringToCharArray[index];
        } else {
            throw new IllegalArgumentException("Illegal argument");
        }
    }
}
