import java.util.ArrayList;
import java.util.List;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        if (jewels.matches("[a-zA-Z]+") && stones.matches("[a-zA-Z]+")) {
            if (areAllCharactersInJewelsStringUnique(jewels)) {
                String[] charsInJewelsStr = jewels.split("");
                String[] charsInStonesStr = stones.split("");

                int jewelsCounter = 0;

                for (String charInJewels : charsInJewelsStr) {
                    for (String charInStones : charsInStonesStr) {
                        if (charInJewels.equals(charInStones)) {
                            jewelsCounter++;
                        }
                    }
                }
                return jewelsCounter;
            } else {
                throw new IllegalArgumentException("All the characters of jewels must be unique");
            }
        } else {
            throw new IllegalArgumentException("Both strings must consists of only English letters");
        }
    }
    private boolean areAllCharactersInJewelsStringUnique(String jewels) {
        List<String> charactersInString = new ArrayList<>();
        boolean areAllCharactersInJewelsStringUnique = true;

        for (int i = 0; i < jewels.length(); i++) {
            if (charactersInString.contains(Character.toString(jewels.charAt(i)))) {
                areAllCharactersInJewelsStringUnique = false;
                break;
            } else {
                charactersInString.add(Character.toString(jewels.charAt(i)));
            }
        }

        return areAllCharactersInJewelsStringUnique;
    }
}