public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int test1 = solution.lengthOfLastWord("Hello World");
        System.out.println(test1);
        int test2 = solution.lengthOfLastWord("   fly me   to   the moon  ");
        System.out.println(test2);
        int test3 = solution.lengthOfLastWord("luffy is still joyboy");
        System.out.println(test3);
    }
}