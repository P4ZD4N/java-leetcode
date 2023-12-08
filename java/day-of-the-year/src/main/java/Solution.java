class Solution {
    public int dayOfYear(String date) {
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
}
