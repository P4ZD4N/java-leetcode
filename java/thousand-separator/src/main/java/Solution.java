public class Solution {
    public String thousandSeparator(int n) {
        int digitsInNumber = Integer.toString(n).length();
        if (3 >= digitsInNumber && n >= 0)
            return Integer.toString(n);
        else if (digitsInNumber >= 4 && n > 0) {
            String[] digits = Integer.toString(n).split("");
            StringBuilder numberWithDots = new StringBuilder();
            int dots = digits.length % 3 == 0 ? (digits.length / 3) - 1 : digits.length / 3;

            int dotDetector = 1;
            int nextDigitFromBehind = digits.length - 1;
            for (int i = digits.length + dots - 1; i >= 0; i--) {
                if (dotDetector % 4 == 0 && i > 0) {
                    numberWithDots.append(".");
                    dotDetector = 1;
                } else {
                    numberWithDots.append(digits[nextDigitFromBehind]);
                    dotDetector++;
                    nextDigitFromBehind--;
                }
            }

            return numberWithDots.reverse().toString();

        } else throw new IllegalArgumentException("Illegal argument");
    }
}
