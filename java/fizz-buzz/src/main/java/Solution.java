import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> fizzBuzz(int number) {
        if (isNotNumberCorrect(number))
            throw new IllegalArgumentException("Illegal argument");

        List<String> answer = new ArrayList<>();

        for (int i = 1; i <= number; i++) {
            if (isDivisibleBy3(i) && isDivisibleBy5(i))
                answer.add("FizzBuzz");
            else if (isDivisibleBy3(i))
                answer.add("Fizz");
            else if (isDivisibleBy5(i))
                answer.add("Buzz");
            else
                answer.add(Integer.toString(i));
        }

        return answer;
    }

    private boolean isNotNumberCorrect(int number) {
        return !(number >= 1 && 10000 >= number);
    }

    private boolean isDivisibleBy3(int number) {
        return number % 3 == 0;
    }

    private boolean isDivisibleBy5(int number) {
        return number % 5 == 0;
    }
}
