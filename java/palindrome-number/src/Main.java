public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        boolean test1 = solution.isPalindrome(121);
        System.out.println(test1);
        boolean test2 = solution.isPalindrome(-121);
        System.out.println(test2);
        boolean test3 = solution.isPalindrome(10);
        System.out.println(test3);
        boolean test4 = solution.isPalindrome(1234554321);
        System.out.println(test4);
        boolean test5 = solution.isPalindrome(0);
        System.out.println(test5);
    }
}