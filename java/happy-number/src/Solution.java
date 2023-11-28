import java.util.List;

class Solution {
    public boolean isHappy(int n) {
        if (checkWhetherNumberRespectsConstraints(n)) {
            int result = n;

            while (result != 1 && result != 4) {
                List<String> digits = List.of(Integer.toString(result).split(""));
                int sum = digits.stream().mapToInt(digit -> (int) Math.pow(Integer.parseInt(digit), 2)).sum();
                result = sum;
            }

            return result == 1;
        } else {
            throw new IllegalArgumentException("Incorrect number");
        }
    }
    public boolean checkWhetherNumberRespectsConstraints(int n) {
        return n >= 1 && (int) (Math.pow(2, 31) - 1) >= n;
    }
}
