class Solution {
    public int[] plusOne(int[] digits) {
        if (((digits.length >= 1 && 100 >= digits.length) && (digits[0] != 0 && digits.length >= 1)) || (digits[0] == 0 && digits.length == 1) ) {
            int[] result = new int[digits.length];
            int index = 0;

            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] == 9) {
                    if (i == 0) {
                        result = new int[digits.length + 1];
                        result[i] = 1;
                        result[i + 1] = 0;
                    } else {
                        result[i] = 0;
                    }
                } else {
                    result[i] = digits[i] + 1;
                    index = i;
                    break;
                }
            }

            for (int i = index - 1; i >= 0; i--) {
                result[i] = digits[i];
            }

            return result;
        } else {
            throw new IllegalArgumentException("Incorrect array entered as an argument");
        }
    }
}
