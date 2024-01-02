public class Solution {
    public int smallestEvenMultiple(int n) {
        if (n >= 1 && 150 >= n) {
            if (n % 2 == 0) return n;
            else return n * 2;
        } else throw new IllegalArgumentException("Number too big or too small!");
    }
}
