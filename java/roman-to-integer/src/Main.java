public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int test1 = solution.romanToInt("III");
        System.out.println(test1);
        int test2 = solution.romanToInt("LVIII");
        System.out.println(test2);
        int test3 = solution.romanToInt("MCMXCIV");
        System.out.println(test3);
        int test4 = solution.romanToInt("CM");
        System.out.println(test4);
        int test5 = solution.romanToInt("XIV");
        System.out.println(test5);
    }
}