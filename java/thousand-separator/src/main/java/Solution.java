public class Solution {
    public String thousandSeparator(int number) {
        int numberOfDigitsInNumber = getNumberOfDigitsInNumber(number);

        if (isNumberOfDigitsLessThanOrEqualToThree(numberOfDigitsInNumber) && isNumberGraterThanOrEqualToZero(number))
            return getIntConvertedToString(number);
        else if (isNumberOfDigitsGreaterThanOrEqualToFour(numberOfDigitsInNumber) && isNumberGraterThanZero(number)) {
            String[] digitsInNumber = getIntConvertedToString(number).split("");
            return getNumberWithDots(digitsInNumber);
        } else
            throw new IllegalArgumentException("Illegal argument");
    }

    private int getNumberOfDigitsInNumber(int number) {
        return getIntConvertedToString(number).length();
    }

    private String getIntConvertedToString(int number) {
        return Integer.toString(number);
    }

    private boolean isNumberOfDigitsLessThanOrEqualToThree(int numberOfDigitsInNumber) {
        return 3 >= numberOfDigitsInNumber;
    }

    private boolean isNumberGraterThanOrEqualToZero(int number) {
        return number >= 0;
    }

    private boolean isNumberOfDigitsGreaterThanOrEqualToFour(int numberOfDigitsInNumber) {
        return numberOfDigitsInNumber >= 4;
    }

    private boolean isNumberGraterThanZero(int number) {
        return number > 0;
    }

    private String getNumberWithDots(String[] digitsInNumber) {
        StringBuilder numberWithDots = new StringBuilder();
        int numberOfDigitsInNumber = digitsInNumber.length;
        int numberOfDots = getNumberOfDots(digitsInNumber);

        int dotDetector = 1;
        int nextDigitFromBehind = numberOfDigitsInNumber - 1;

        for (int i = numberOfDigitsInNumber + numberOfDots - 1; i >= 0; i--) {
            if (isDotDetectorDivisibleByFour(dotDetector) && isNumberGraterThanZero(i)) {
                numberWithDots.append(".");
                dotDetector = 1;
            } else {
                numberWithDots.append(digitsInNumber[nextDigitFromBehind]);
                dotDetector++;
                nextDigitFromBehind--;
            }
        }

        return numberWithDots.reverse().toString();
    }

    private int getNumberOfDots(String[] digitsInNumber) {
        return digitsInNumber.length % 3 == 0 ? (digitsInNumber.length / 3) - 1 : digitsInNumber.length / 3;
    }

    private boolean isDotDetectorDivisibleByFour(int dotDetector) {
        return dotDetector % 4 == 0;
    }
}
