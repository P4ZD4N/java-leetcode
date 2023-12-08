class Solution {
    public int dayOfYear(String date) {
        if (
                date.length() == 10 &&
                date.charAt(4) == '-' &&
                date.charAt(7) == '-' &&
                allCharactersExcept4And7AreDigits(date) &&
                isDateCorrect(date)
        ) {
            String[] inputDate = date.split("-");
            int inputYear = Integer.parseInt(inputDate[0]);
            int inputMonth = Integer.parseInt(inputDate[1]);
            int inputDay = Integer.parseInt(inputDate[2]);

            int day = 0;
            for (int month = 1; month <= inputMonth; month++)
                if (month < inputMonth)
                    for (int dayOfMonth = 1; dayOfMonth <= howManyDaysMonthHas(month, inputYear); dayOfMonth++)
                        day++;
                else
                    for (int dayOfLastMonth = 1; dayOfLastMonth <= inputDay; dayOfLastMonth++)
                        day++;
            return day;
        } else throw new IllegalArgumentException("Illegal argument");
    }

    private int howManyDaysMonthHas(int month, int year) {
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> isThisLeapYear(year) ? 29 : 28;
            default -> throw new IllegalArgumentException("Invalid month " + month);
        };
    }

    private boolean isThisLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    private boolean allCharactersExcept4And7AreDigits(String date) {
        char[] characters = date.toCharArray();
        boolean allCharactersExcept4And7AreDigits = true;
        for (int i = 0; i < characters.length && allCharactersExcept4And7AreDigits; i++) {
            if (i == 4 || i == 7)
                continue;
            if (!(Character.isDigit(characters[i])))
                allCharactersExcept4And7AreDigits = false;
        }
        return allCharactersExcept4And7AreDigits;
    }

    private boolean isDateCorrect(String date) {
        String[] inputDate = date.split("-");
        boolean isYearCorrect = Integer.parseInt(inputDate[0]) >= 1900 && 2019 >= Integer.parseInt(inputDate[0]);
        boolean isMonthCorrect = Integer.parseInt(inputDate[1]) >= 1 && 12 >= Integer.parseInt(inputDate[1]);
        boolean isDayCorrect = switch (Integer.parseInt(inputDate[1])) {
            case 1, 3, 5, 7, 8, 10, 12 -> Integer.parseInt(inputDate[2]) >= 1 && 31 >= Integer.parseInt(inputDate[2]);
            case 4, 6, 9, 11 -> Integer.parseInt(inputDate[2]) >= 1 && 30 >= Integer.parseInt(inputDate[2]);
            case 2 -> isThisLeapYear(Integer.parseInt(inputDate[0])) ? Integer.parseInt(inputDate[2]) >= 1 && 29 >= Integer.parseInt(inputDate[2]) : Integer.parseInt(inputDate[2]) >= 1 && 28 >= Integer.parseInt(inputDate[2]);
            default -> throw new IllegalArgumentException("Invalid month " + inputDate[1]);
        };
        return isYearCorrect && isMonthCorrect && isDayCorrect;
    }
}
