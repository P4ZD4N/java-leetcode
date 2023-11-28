import java.util.Arrays;
import java.util.List;

class Solution {
    public String restoreString(String s, int[] indices) {
        String[] splittedString = s.split("");
        List<String> shuffledString = Arrays.asList(Arrays.copyOf(splittedString, splittedString.length));

        for (int i = 0; i < indices.length; i++) {
            shuffledString.set(indices[i], splittedString[i]);
        }

        return String.join("", shuffledString);
    }
}
