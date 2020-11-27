public class CountWords {
    public static void main(String[] args) {
        String s = "I never saw a purple cow";

        System.out.println(countWords(s));
    }

    public static int countWords(String s) {
        System.out.println("***Output***");
        int ans = 1;
        for (int i = 0; i < s.length(); i++) {
            if (i != 0 && s.charAt(i - 1) == ' ') {
                ans++;
            }
        }
        return ans;
    }
}
