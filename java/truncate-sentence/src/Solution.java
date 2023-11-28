public class Solution {
    public String truncateSentence(String s, int k) {
        if (
                ((s.length() >= 1) && (500 >= s.length())) &&
                ((k >= 1) && (s.length() >= k)) &&
                (!(s.substring(s.length()-1).equals(" ")) && !(s.substring(0, 1).equals(" ")))
        ) {
            String[] wordsInSentence = s.split(" ");
            String[] truncatedSentenceWords = new String[k];

            for (int i = 0; i < k; i++) {
                truncatedSentenceWords[i] = wordsInSentence[i];
            }

            return String.join(" ", truncatedSentenceWords);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
