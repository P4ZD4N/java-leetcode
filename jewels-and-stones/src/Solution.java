class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        if (jewels.matches("[a-zA-Z]+") && stones.matches("[a-zA-Z]+")) {
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
            throw new IllegalArgumentException("Both strings must consists of only English letters");
        }
    }
}