class Solution {
    public int lengthOfLastWord(String s) {
        String[] splittedString = s.split(" ");
        int lastIndex = splittedString.length - 1;
        return splittedString[lastIndex].length();
    }
}
