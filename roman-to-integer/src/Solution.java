import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Solution {
    public int romanToInt(String s) {
        Map<String, Integer> romanNumeralsAndTheirValuesAsArabicNumberals = Map.of(
                "I", 1,
                "V", 5,
                "X", 10,
                "L", 50,
                "C", 100,
                "D", 500,
                "M", 1000
        );

        String[] romanNumeralsFromInput = s.split("");
        List<Integer> romanNumeralsFromInputAsArabicNumerals = new ArrayList<>();
        List<Integer> digitsWhereSubstractionWereUsed = new ArrayList<>();

        for(String digit : romanNumeralsFromInput) {
            if (romanNumeralsAndTheirValuesAsArabicNumberals.containsKey(digit)) {
                romanNumeralsFromInputAsArabicNumerals.add(
                        romanNumeralsAndTheirValuesAsArabicNumberals.get(digit).intValue()
                );
            }
        }

        for (int i = 0; i < romanNumeralsFromInputAsArabicNumerals.size(); i++) {
            if (i > 0) {
                if (romanNumeralsFromInputAsArabicNumerals.get(i) >
                        romanNumeralsFromInputAsArabicNumerals.get(i - 1)) {
                    digitsWhereSubstractionWereUsed.add(
                            romanNumeralsFromInputAsArabicNumerals.get(i) -
                                    romanNumeralsFromInputAsArabicNumerals.get(i - 1)
                    );
                    romanNumeralsFromInputAsArabicNumerals.remove(i);
                    romanNumeralsFromInputAsArabicNumerals.remove(i - 1);
                    i--;
                }
            }
        }

        romanNumeralsFromInputAsArabicNumerals.addAll(digitsWhereSubstractionWereUsed);

        int sum = 0;

        for (int digit : romanNumeralsFromInputAsArabicNumerals) {
            sum += digit;
        }

        return sum;
    }
}
