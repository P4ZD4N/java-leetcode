import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int findComplement(int num) {
        String numToBinary = Integer.toBinaryString(num);
        List<String> binaryDigitsInNumber = List.of(numToBinary.split(""));
        List<String> binaryDigitsInNumberNegated = new ArrayList<>();

        for (String digit : binaryDigitsInNumber) {
            if (digit.equals("0")) binaryDigitsInNumberNegated.add("1");
            else binaryDigitsInNumberNegated.add("0");
        }

        int complement = 0;
        int position = 0;

        for (int i = binaryDigitsInNumberNegated.size() - 1; i >= 0; i--) {
            complement += Integer.parseInt(binaryDigitsInNumberNegated.get(i)) * (int) Math.pow(2, position);
            position++;
        }

        return complement;
    }
}
