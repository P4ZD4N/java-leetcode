public class Solution {
    public int differenceOfSums(int n, int m) {
        if (n >= 1 && 1000 >= m) {
            int num1 = calculateSumOfNonDivisable(n, m);
            int num2 = calculateSumOfDivisable(n, m);
            return num1 - num2;
        } else {
            throw new IllegalArgumentException("Invalid input");
        }
    }
    private int calculateSumOfNonDivisable(int n, int m) {
        int num1 = 0;
        for (int i = 1; i <= n; i++)
            if (i % m != 0)
                num1 += i;
        return num1;
    }
    private int calculateSumOfDivisable(int n, int m) {
        int num2 = 0;
        for (int i = 1; i <= n; i++)
            if (i % m == 0)
                num2 += i;
        return num2;
    }
}
