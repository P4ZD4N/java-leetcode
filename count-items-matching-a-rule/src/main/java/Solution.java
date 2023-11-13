import java.util.List;

public class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        if (
                items.size() >= 1 && Math.pow(10, 4) >= items.size() &&
                areAllPropertiesLengthLessOrEqual10AndGreaterOrEqual1(items) &&
                (ruleValue.length() >= 1 && 10 >= ruleValue.length()) &&
                areAllStringsConsistOnlyOfLowercaseLetters(items, ruleKey, ruleValue)
        ) {
            int key = convertStringKeyIntoIntKey(ruleKey);
            int matchings = 0;

            for (List<String> item : items)
                if (item.get(key).equals(ruleValue))
                    matchings++;

            return matchings;
        } else {
            throw new IllegalArgumentException();
        }
    }
    private int convertStringKeyIntoIntKey(String ruleKey) {
        int key = switch (ruleKey) {
            case "type" -> 0;
            case "color" -> 1;
            case "name" -> 2;
            default -> throw new IllegalArgumentException();
        };
        return key;
    }
    private boolean areAllPropertiesLengthLessOrEqual10AndGreaterOrEqual1(List<List<String>> items) {
        boolean areAllPropertiesLengthLessOrEqual10AndGreaterOrEqual1 = true;

        for (List<String> item : items)
            for (String property : item)
                if (!(property.length() >= 1 && 10 >= property.length()))
                    areAllPropertiesLengthLessOrEqual10AndGreaterOrEqual1 = false;

        return areAllPropertiesLengthLessOrEqual10AndGreaterOrEqual1;
    }
    private boolean areAllStringsConsistOnlyOfLowercaseLetters (
            List<List<String>> items, String ruleKey, String ruleValue
    ) {
        boolean areAllStringsConsistOnlyOfLowercaseLetters = true;

        if (!(ruleKey.equals(ruleKey.toLowerCase()) && ruleValue.equals(ruleValue.toLowerCase())))
            areAllStringsConsistOnlyOfLowercaseLetters = false;

        for (List<String> item : items)
            for (String property : item)
                if (!(property.equals(property.toLowerCase())))
                    areAllStringsConsistOnlyOfLowercaseLetters = false;

        return areAllStringsConsistOnlyOfLowercaseLetters;
    }
}
