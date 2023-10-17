import java.util.List;

class Solution {
    public boolean isHappy(int n) {
        int result = n;

        while (result != 1 && result != 4){
            List<String> digits = List.of(Integer.toString(result).split(""));
            int sum = digits.stream().mapToInt(digit -> (int) Math.pow(Integer.parseInt(digit), 2)).sum();
            result = sum;
        }

        return result == 1;
    }
}
