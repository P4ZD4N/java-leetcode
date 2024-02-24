public class Solution {
    public int smallestEvenMultiple(int number) {
        if (!(isNumberCorrect(number)))
            throw new IllegalArgumentException("Number too big or too small!");

        if (isNumberEven(number))
            return number;
        else
            return number * 2;
    }

    private boolean isNumberCorrect(int number) {
        return number >= 1 && 150 >= number;
    }

    private boolean isNumberEven(int number) {
        return number % 2 == 0;
    }
}
